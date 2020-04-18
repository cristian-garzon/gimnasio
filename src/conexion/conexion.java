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
            case "base 2":
                // aca la opcion para conectar la base Sebastian
                break;
            case "base 3":
                /// aca, la accion para conectar la base Daniel
                break;
            }
    }

}