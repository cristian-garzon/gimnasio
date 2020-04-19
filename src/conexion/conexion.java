package conexion;

import java.sql.*;
import javax.swing.JOptionPane;


public class conexion {
    String opcion;
    public conexion(String opcion){
        this.opcion=opcion;
    }
    public void conectar(){
        switch(opcion){
            case "postgreSQL":
                String BD="jdbc:postgresql://localhost:5432/gymbd";
                String user="postgres";
                String password="1234";
                try {
                    Connection cn=DriverManager.getConnection(BD,user,password);
                    JOptionPane.showMessageDialog(null,"conectada con exito");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error al conectar: "+e);
                }
                break;
            case "oracle":
                 Connection conexion = null;
                 String url = "jdbc:oracle:thin:@localhost:1521:XE";
                 String usuario = "system";  //Este es el usuario System
                 String contraseña = "daniel22p3";  //La contraseña que cada uno tenga en su DB
                try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conexion = DriverManager.getConnection(url, usuario, contraseña);
                    if( conexion != null){
                        JOptionPane.showMessageDialog(null, "Conexion exitosa"+conexion);
                    }
                    
                }catch(ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
                }
                break;
            case "base 3":
                /// aca, la accion para conectar la base Daniel
                break;
            }
    }

}
