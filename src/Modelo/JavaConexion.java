package Modelo;

import Controlador.*;
import com.itextpdf.text.pdf.ByteBuffer;
import com.sun.pdfview.PDFFile;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.sql.*;
import javax.imageio.ImageIO;
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

    //METODO PRINCIPAL PARA LA CONEXION HACIA LAS BASES DE DATOS
    public void conectar() {
        switch (opcion) {
            case "postgres":
                url = "jdbc:postgresql://localhost:5432/GYMDB";
                user = "postgres";
                password = "1234";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    if (cn != null) {
                        JOptionPane.showMessageDialog(null, "Base de Datos conectada. \n" + cn.toString());
                    }
                } catch (SQLException e) {
                    System.out.println("Error" + e.toString());
                    System.exit(0);
                }
                break;
            case "oracle":
                url = "jdbc:oracle:thin:@localhost:1521:XE";
                user = "system";
                password = "1234";
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    cn = DriverManager.getConnection(url, user, password);
                    if (cn != null) {
                        JOptionPane.showMessageDialog(null, "Base de Datos conectada. \n" + cn.toString());
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                    System.exit(0);

                }
                break;
            case "mysql":
                url = "jdbc:mysql://localhost/gymdb?useSSL=false&useTimezone=true&serverTimezone=UTC";
                user = "root";
                password = "1234";
                try {
                    cn = DriverManager.getConnection(url, user, password);
                    JOptionPane.showMessageDialog(null, "Conectado a MySql. \n" + cn.toString());
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.toString());
                    System.exit(0);
                }
                break;
        }
    }
//////////////////////////////////////////////////////////////////////////////
///////////////////////////////METODOS DEL LOGIN//////////////////////////////
    //METODO PARA SABER EL TIPO DE USUARIOS QUE ES, SI EMPLEADO, ADMINISTRADOR O CLIENTE

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

    //METODO PARA SABER SI EL USUARIO EXISTE EN LA BASE DE DATOS
    public boolean validarUsuario(String nombre, String cedula) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select nombre,cedula from usuarios");
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
//////////////////////////////////////////////////////////////////////////////
///////////////////////METODOS DEL PANEL USUARIO//////////////////////////////
    //METODO PARA ELIMINAR EL USUARIO

    public void eliminar(String cedula) {
        try {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM  usuarios where cedula=" + cedula);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //METODO PARA ENLISTAR LOS USUARIOS
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

    //METODO PARA AGREGAR EL USUARIO
    public void insertU(long cedula, String nombre, long telefono, String correo, String direccion, String estatus, String tipo_usuario) {
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO USUARIOS VALUES (" + cedula + ",'" + nombre + "'," + telefono + ",'" + correo + "','" + direccion + "','" + estatus + "','" + tipo_usuario + "') ");
        } catch (Exception e) {
            System.out.println("error al agregar a los usuarios " + e);
        }
    }

    //METODO PARA SABER QUE NO ESTA DUPLICANDO EL USUARIO
    public boolean pk(long id, String lista, String indicador) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT cedula FROM " + lista + " where " + indicador + "=" + id + "");
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(id);
                if (Long.parseLong(rs.getString(1)) == id) {
                    return false;
                }
            }
        } catch (SQLException e) {
        }
        return true;
    }

    //METODO PARA CONSULTAR EL USUARIO
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

    //METODO PARA ACTUALIZAR LOS USUARIOS
    public void update(long cedula, String nombre, long telefono, String correo, String direccion, String estatus, String tipo_usuario) {
        try {
            st = cn.createStatement();
            st.executeUpdate("update usuarios set nombre = '" + nombre + "', telefono=" + telefono + ",correo='" + correo + "',direccion='" + direccion + "',estatus='" + estatus + "', tipo_usuario='" + tipo_usuario + "'  where cedula =" + cedula);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
    }
//////////////////////////////////////////////////////////////////////////////
/////////////////////METODOS DE EL PANEL DE INVENTARIO////////////////////////    
    //METODO PARA ACTUALIZAR EL INVENTARIO

    public void updatei(String nombre, String tipo_objeto, String caracteristicas, String estado, int unidades, int id) {
        try {
            st = cn.createStatement();
            st.executeUpdate("update inventario set nombre= '" + nombre + "', tipo_objeto='" + tipo_objeto + "', caracteristicas='" + caracteristicas + "', estado='" + estado + "',unidades=" + unidades + " where id=" + id);
        } catch (Exception e) {
            System.out.println("error al actualizar el inventario " + e);
        }
    }

    // METODO PARA AGREGAR AL INVENTARIO
    public void inserti(String nombre, String tipo_objeto, String caracteristicas, String estado, int unidades) {
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO INVENTARIO  (fecha_ingreso,nombre,tipo_objeto,caracteristicas,estado,unidades) VALUES(current_date,'" + nombre + "','" + tipo_objeto + "','" + caracteristicas + "','" + estado + "'," + unidades + ")");
        } catch (SQLException e) {
            System.out.println("error al agregar al inventario " + e);
        }
    }

    // METODO PARA ELIMINAR UN OBJETO DEL INVENTARIO
    public void deletei(int id) {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("Delete from inventario where id = " + id);
        } catch (SQLException e) {
        }
    }

    //METODO PARA LISTAR EL INVENTARIO
    public lista_inventario listari(String filtro) {
        lista_inventario lista = new lista_inventario();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM INVENTARIO WHERE nombre like '" + filtro + "%'");
            while (rs.next()) {
                lista.agregar(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Integer.parseInt(rs.getString(7)));
            }
        } catch (SQLException e) {
            System.out.println(" error al listar el inventario " + e);
        }
        return lista;
    }
/////////////////////////////////////////////////////////////////////////////    
///////////////////////////METODOS DEL PANEL PRODUCTO////////////////////////

    //METODO PARA ELIMINAR EL PRODUCTO
    public void eliminarp(long id_producto) {
        try {
            st = cn.createStatement();
            st.executeUpdate("DELETE FROM productos where id_productos=" + id_producto);
        } catch (SQLException e) {
        }
    }

    //METODO PARA ACTUALIZAR EL PRODUCTO
    public void updatep(long producto, String tipo, int precio, String peso, String detalles, int cantidad) {
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE productos set tipo='" + tipo + "',cantidad=" + cantidad + ",precio=" + precio + ",peso='" + peso + "',detalles='" + detalles + "'" + "where id_producto=" + producto);
        } catch (SQLException e) {
        }
    }

    //METODO PARA ENLISTAR EL PRODUCTO
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

    //METODO PARA AGREGAR PRODUCTOS
    public void insertarProducto(int id_producto, String tipo, int cantidad, int precio, String peso, String detalles) {
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO PRODUCTOS VALUES (" + id_producto
                    + ",'" + tipo + "'," + cantidad + "," + precio + ",'" + peso + "','" + detalles + "')");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
/////////////////////////////////////////////////////////////////////////////   

    //Metodo para poder listar  usado en ventana_comprar
    public Lista_compra MostrarCompra(String filtro) {
        Lista_compra Lista = new Lista_compra();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select * from productos where tipo like  '" + filtro + "%'");
            while (rs.next()) {
                Lista.AgregarCompra(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(3)), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Hubo un error en mostrar compra." + e.getMessage());
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
            System.out.println("Hubo un error cod 01 en modificar cantidad"+e.getMessage());
        }
        String sql = "update productos set cantidad=" + auxiliar + " where id_producto=" + id_producto;
        try {
            st = cn.createStatement();
            st.executeUpdate(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Compra exitosa", "COMPRA EXITOSA", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("hubo un error en modificar_cantidad"+e.getMessage());
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
    
//    //Metodo para mostrar recibos en pdf
//    public Lista_pdf Cargar_lista(String filtro){
//        Lista_pdf Lista = new Lista_pdf();
//        try {
//            st = cn.createStatement();
//            rs = st.executeQuery("select * from recibos_pdf where nombrepdf like  '" + filtro + "%'");
//            while (rs.next()) {
//                Lista.AgregarPDF(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getBytes(3));
//            }
//        } catch (SQLException e) {
//            System.out.println("Hubo un error en mostrar compra." + e.getMessage());
//        }catch(Exception e){
//            System.out.println("Error"+e.getMessage());
//        }
//        return Lista;
//    }
    
    //Metodo para traer el nombre del articulo RECIBO
    public String Nombre_compra(int ID, String atributo){
        String sql = "select "+ atributo+" from productos where id_producto="+ID;
        String nombre = null;
        try{
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nombre = rs.getString(1);
            }
            return nombre;
        }catch(SQLException e){
            System.out.println("Error de la sentencia"+e.getMessage());
            return nombre;
        }
    }
    
    //Metodo para poner el archivo pdf en la BD
    public void insertarPDF(String ruta){
        try{
            FileInputStream pdf = new FileInputStream(ruta);
            String sql = "insert into recibos values(?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setBinaryStream(1,pdf, pdf.available());
            ps.executeUpdate();
            System.out.println("Se agregó correctamente");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
