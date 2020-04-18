
package clases;
import conexion.conexion;
import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {
        String opcion =(String) JOptionPane.showInputDialog(null,"Seleccione la base de datos a usar","BASE DE DATOS",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"base 1","base 2","base 3"},"Seleccione");
        conexion base=new conexion(opcion);
    }
}
