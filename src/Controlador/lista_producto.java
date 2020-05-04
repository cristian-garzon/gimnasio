package Controlador;

import Modelo.JavaConexion;

public class lista_producto {

    Nodo_producto ultimo;
    int tamaño;

    public lista_producto() {
        ultimo = null;
        tamaño = 0;
    }

    public boolean vacio() {
        return ultimo == null;
    }

    public Nodo_producto getUltimo() {
        return ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public lista_producto agregar(int id_productos, String tipo, int cantidad, int precio, String peso, String detalles) {
        Nodo_producto nuevo = new Nodo_producto(id_productos, tipo, cantidad, precio, peso, detalles);
        if (!vacio()) {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        } else {
            ultimo = nuevo;
        }
        tamaño++;
        return this;
    }

    public String[][] listado(JavaConexion BD, String filtro) {
        lista_producto listap = BD.listarP(filtro);
        if (!listap.vacio()) {
            int i = 0;
            String informacion[][] = new String[listap.getTamaño()][6];
            Nodo_producto p = listap.ultimo.sig;
            do {
                informacion[i][0] = "" + p.getId_productos();
                informacion[i][1] = p.getTipo();
                informacion[i][2] = "" + p.getCantidad();
                informacion[i][3] = "" + p.getPrecio();
                informacion[i][4] = p.getPeso();
                informacion[i][5] = p.getDetalles();
                i++;
                p = p.sig;
            } while (p != listap.ultimo.sig);
            return informacion;
        }
        String nada[][] = new String[0][0];
        return nada;
    }
    
}
