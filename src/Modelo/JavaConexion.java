package Modelo;

import Controlador.lista_usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class JavaConexion {

    Connection cn;
    private String url;
    private String user;
    private String password;
    private String opcion;
    Statement st;
    ResultSet rs;

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
                //aqui poner la conexion a mysql

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
    public void eliminar(String cedula){
        try {
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM usuarios where cedula="+cedula);
        } catch (SQLException e) {
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

    public void update(long cedula,String nombre, long telefono,String correo,String direccion,String estatus,String tipo_usuario) {
        try {
            st = cn.createStatement();
            st.executeUpdate( "update usuarios set nombre = '" + nombre + "', telefono="+telefono+",correo='"+correo+"',direccion='"+direccion+"',estatus='"+estatus+"', tipo_usuario='"+tipo_usuario+"'  where cedula =" + cedula);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
    }
    //metodo para listar los usuarios
    public lista_usuarios listar(String filtro) {
        lista_usuarios lista = new lista_usuarios();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM USUARIOS where nombre like '"+filtro+"%'");
            while (rs.next()) {
                lista.agregar(Long.parseLong(rs.getString(1)), rs.getString(2), Long.parseLong(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println("error al listar");
        }
        return lista;
    }
}
