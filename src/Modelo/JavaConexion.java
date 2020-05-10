package Modelo;

import Controlador.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConexion {

    Connection cn;
    private String url;
    private String user;
    private String password;
    private String opcion;
    Statement st;
    ResultSet rs;

    public JavaConexion() {

    }

    public JavaConexion(String opcion) {
        this.opcion = opcion;
    }

    public void conectar() {
        switch (opcion) {
            case "postgres":
                url = "jdbc:postgresql://localhost:5432/GYMDB";
                user = "postgres";
                password = "1234";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    JOptionPane.showMessageDialog(null, "Base de Datos conectada");
                } catch (SQLException e) {
                    System.out.println("Error" + e.toString());
                }
                break;
            case "oracle":
                url = "jdbc:oracle:thin:@localhost:1521:XE";
                user = "system";
                password = "daniel22p3";
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    cn = DriverManager.getConnection(url, user, password);
                    if (cn != null) {
                        JOptionPane.showMessageDialog(null, "Base de Datos conectada" + cn.toString());
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                break;
            case "mysql":
                //Dejar todo por defecto y solo modicar (persona) que se refiere el nombre de la base de datos 
                //Modicar el usuario y contraseña para que se acomode a su base de datos
                //Cambiar esos datos en el Metodo Insert que cree ,en lo ultimo
                url = "jdbc:mysql://localhost/proyecto?useSSL=false&useTimezone=true&serverTimezone=UTC";
                user = "root";
                password = "admin";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    JOptionPane.showMessageDialog(null, "Conectado a MySql");
                } catch (SQLException e1) {
                    e1.printStackTrace(System.out);
                }

                break;
        }
    }
    public String estatus(String nombre, String cedula) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT TIPO_USUARIO FROM usuarios WHERE nombre='" + nombre + "'AND cedula=" + cedula + "");
            while (rs.next()) {
                return rs.getString(1);
            }
            return "error";
        } catch (SQLException e) {
            System.out.println("error al encontrar estatus " + e);
            return "error";
        }
    }

    public boolean validarUsuario(String nombre, String cedula) {
        try {
            String sql = "select nombre,cedula from usuarios";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals(nombre) && rs.getString(2).equals(cedula)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    //metodo para eliminar el datp que pasan
    public void eliminar(String cedula) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("DELETE FROM usuarios where cedula=" + cedula);
        } catch (SQLException e) {
        }
    }

    //metodo para eliminar al producto papaaaaa
    public void eliminarp(String id_producto) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("DELETE FROM productos where id_productos=" + id_producto);
        } catch (SQLException e) {
        }
    }

    //actualizar producto
    public void updatep(long producto, String tipo, int precio, String peso, String detalles, int cantidad) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("UPDATE productos set tipo='" + tipo + "',cantidad=" + cantidad + ",precio=" + precio + ",peso='" + peso + "',detalles='" + detalles + "'" + "where id_productos=" + producto);
        } catch (SQLException e) {
            System.out.println("error al actualizar " + e);
        }
    }

    public void consulta(String id) {
        try {
            String sql = "select nombre,telefono,correo,direccion,estatus,tipo_usuario from usuarios where cedula =  " + id;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Nombre : " + rs.getNString(1));
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
    }

    public void instert(long cedula, String nombre, String apellido, long telefono) {
        try {
            String sql = "insert into usuarios (cedula,nombre,apellido,telefono) values (" + cedula + ",'" + nombre + "' , '" + apellido + "' ," + telefono + ")";
            Statement st = cn.createStatement();
            st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());

        }

    }
    //metodo para actualizar el inventario 
    public void updatei(String nombre,String tipo_objeto,String caracteristicas,String estado,int unidades,int id){
        try {
            st= cn.createStatement();
            st.execute("update inventario set nombre= '"+nombre+"', tipo_objeto='"+tipo_objeto+"', caracteristicas='"+caracteristicas+"', estado='"+estado+"',unidades="+unidades+" where id="+id);
        } catch (Exception e) {
            System.out.println("error al actualizar el inventario "+e);
        }
    }
    public void update(long cedula, String nombre, long telefono, String correo, String direccion, String estatus, String tipo_usuario) {
        try {
            st = cn.createStatement();
            st.executeUpdate("update usuarios set nombre = '" + nombre + "', telefono=" + telefono + ",correo='" + correo + "',direccion='" + direccion + "',estatus='" + estatus + "', tipo_usuario='" + tipo_usuario + "'  where cedula =" + cedula);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
    }
    //metodo para listar el inventario
    public lista_inventario listari(String filtro){
        lista_inventario lista= new lista_inventario();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM INVENTARIO WHERE nombre like '"+filtro+"%'");
            while(rs.next()){
                lista.agregar(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Integer.parseInt(rs.getString(7)));          
            }
        } catch (SQLException e) {
            System.out.println(" error al listar el inventario "+e);
        }
        return lista;
    }
       //metodo para listar los usuarios
    public lista_usuarios listar(String filtro) {
        lista_usuarios lista = new lista_usuarios();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM USUARIOS where nombre like '" + filtro + "%'");
            while (rs.next()) {
                lista.agregar(Long.parseLong(rs.getString(1)), rs.getString(2), Long.parseLong(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println("error al listar " + e);
        }
        return lista;
    }

    //metodo para listar los productos
    public lista_producto listarP(String filtro) {
        lista_producto lista = new lista_producto();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM PRODUCTOS where TIPO like '" + filtro + "%'");
            while (rs.next()) {
                lista.agregar(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3)), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL LISTAR " + e);
        }
        return lista;
    }

    //Metodo para poder listar  usado en ventana_comprar
    public Lista_compra MostrarCompra() {
        Lista_compra Lista = new Lista_compra();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select * from productos");
            while (rs.next()) {
                Lista.AgregarCompra(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3)), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en mostrar compra.");
        }
        return Lista;
    }

    //Metodo para proceso de compra
    public boolean Validar_producto(int id_producto) {
        String sql = "select id_producto from productos";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals(String.valueOf(id_producto))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error de validacion en productos compras");
            return false;
        }
    }

    // Metodo para validar la cantidad del producto 
    public boolean validar_cantidad(int id_producto, int cantidad) {
        String sql = "select cantidad from productos where id_producto =" + id_producto;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int aux = Integer.parseInt(rs.getString(1));
                if (cantidad <= aux) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Hubo un problema en validar cantidad");
            return false;
        }
    }

    //Metodo para modificar la cantidad del producto en la BD
    public void Modificar_cantidad(int id_producto, int cantidad) {
        int auxiliar = 0;
        String presql = "select cantidad from productos where id_producto=" + id_producto;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(presql);
            while (rs.next()) {
                auxiliar = Integer.parseInt(rs.getString(1)) - cantidad;
            }

        } catch (SQLException e) {
            System.out.println("Hubo un error cod 01 en modificar cantidad");
        }
        String sql = "update productos set cantidad=" + auxiliar + " where id_producto=" + id_producto;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Compra exitosa", "COMPRA EXITOSA", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("hubo un error en modificar_cantidad");
        }
    }

    // Metodo para mostrar la cantidad a pagar
    public int Cantidad_pagar(int id_producto, int cantidad) {
        String sql = " select precio from productos where id_producto=" + id_producto;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int aux = 0;
                aux = Integer.parseInt(rs.getString(1)) * cantidad;
                return aux;
            }
            return 0;
        } catch (SQLException e) {
            return 0;
        }
    }

    //COMMINT 
//Agregando Metodo INSERTAR DATOS para MySql
    public int insert(Nodo_usuarios usuario) {
        String SQL_INSERT = "INSERT INTO usuarios(cedula,nombre,telefono,correo,direccion,estatus,tipo_usuario) VALUES(" + usuario.getCedula() + "," + usuario.getNombre() + ", " + usuario.getTelefono() + ", " + usuario.getCorreo() + "," + usuario.getDireccion() + ", " + usuario.getEstatus() + ", " + usuario.getTipo_usuario() + ")";
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(SQL_INSERT);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("error al insertar "+ex);
        }
        return rows;
    }
    //agregar el usuario
    public void insertU(long cedula,String nombre,long telefono,String correo,String direccion, String estatus,String tipo_usuario ){
        try {
            st = cn.createStatement();
            rs=st.executeQuery("INSERT INTO USUARIOS VALUES ("+cedula+",'"+nombre+"',"+telefono+",'"+correo+"','"+direccion+"','"+estatus+"','"+tipo_usuario+"') ");    
        } catch (Exception e) {
            System.out.println("error al agregar "+e);
        }
    }

}
