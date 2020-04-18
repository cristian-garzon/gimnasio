package conexion;
public class conexion {
    String opcion;
    public conexion(String opcion){
        this.opcion=opcion;
    }
    public void conectar(){
            switch(opcion){
                case "base 1":
                    // aca la opcion para conectar la base Cristian
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