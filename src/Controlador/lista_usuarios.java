package Controlador;

import Modelo.JavaConexion;

public class lista_usuarios {

    Nodo_usuarios ultimo;
    int tamaño;

    public lista_usuarios() {
        ultimo = null;
        tamaño = 0;
    }

    public boolean vacio() {
        return ultimo == null;
    }

    public lista_usuarios agregar(long cedula, String nombre, long telefono, String correo, String direccion, String estatus, String tipo_usuario) {
        Nodo_usuarios nuevo = new Nodo_usuarios(cedula, nombre, telefono, correo, direccion, estatus, tipo_usuario);
        if (!vacio()) {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        } else {
            ultimo = nuevo;
        }
        tamaño++;
        return this;
    }

    public Nodo_usuarios getUltimo() {
        return ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String[][] listado_admin(JavaConexion BD) {
        int i = 0;
        lista_usuarios lista = BD.listar();
        String informacion[][] = new String[lista.getTamaño()][7];
        Nodo_usuarios p = lista.ultimo.sig;
        do {
            informacion[i][0] = "" + p.getCedula();
            informacion[i][1] = p.getNombre();
            informacion[i][2] = "" + p.getTelefono();
            informacion[i][3] = p.getCorreo();
            informacion[i][4] = p.getDireccion();
            informacion[i][5] = p.getEstatus();
            informacion[i][6] = p.getTipo_usuario();
            i++;
            p = p.sig;
        } while (p != lista.ultimo.sig);
        return informacion;
    }

    public String[][] listado_empleado(JavaConexion BD) {
        int i = 0;
        lista_usuarios lista = BD.listar();
        String informacion[][] = new String[lista.getTamaño()][4];
        Nodo_usuarios p = lista.ultimo.sig;
        do {
            informacion[i][0] = p.getNombre();
            informacion[i][1] = "" + p.getTelefono();
            informacion[i][2] = p.getCorreo();
            informacion[i][3] = p.getEstatus();
            i++;
            p=p.sig;
        } while (p != lista.ultimo.sig);
        return informacion;
    }
}
