package Controlador;

import Vista.eleccion_gym_db;

public class Principal {

    public static void main(String[] args) {
        String proceso = "Eleccion DB";
        switch (proceso) {
            case "Eleccion DB":
                eleccion_gym_db frame = new eleccion_gym_db();
                frame.setVisible(true);
                break;
        }
}
}
