package Modelo;

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

    Connection conexion = null;
    private String url = null;
    private String user = null;
    private String password = null;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConexion() {
        return conexion;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public JavaConexion() {
        url = "";
        user = "";
        password = "";
    }
    public JavaConexion(String db){
        this.url=url;
        this.user=user;
        this.password=password;
    }

    public boolean isConectado() {
        if (conexion != null) {
            return true;
        } else {
            return false;
        }
    }

    public void conectar_Postgresql() {
        conexion = null;
        try {
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                JOptionPane.showMessageDialog(null, "Base de Datos conectada" + conexion.toString());
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }

    }

    public void Conectar_oracle() {
        conexion = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                JOptionPane.showMessageDialog(null, "Base de Datos conectada" + conexion.toString());
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

    public boolean validarUsuario(String nombre, String cedula) {
        try {
            String sql = "select nombre,cedula from usuarios";
            Statement st = conexion.createStatement();
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

    public void consulta(String id) {
        try {
            String sql = "select nombre,telefono,correo,direccion,estatus,tipo_usuario from usuarios where cedula =  " + id;
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null,"Nombre : " + rs.getNString(1));               
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
    }

    public void instert(long cedula, String nombre, String apellido, long telefono) {
        try {
            String sql = "insert into usuarios (cedula,nombre,apellido,telefono) values (" + cedula + ",'" + nombre + "' , '" + apellido + "' ," + telefono + ")";
            Statement st = conexion.createStatement();
            st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());

        }

    }

    public void update(String nombre, String cedula) {
        try {
            String sql = "update usuarios set nombre = " + nombre + " where cedula =" + cedula;
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());

        }

    }
}
