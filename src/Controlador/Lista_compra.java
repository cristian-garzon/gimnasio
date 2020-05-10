package Controlador;

import Modelo.JavaConexion;

/**
 *
 * @author Daniel
 */
public class Lista_compra {

    Nodo_compra ultimo;
    int tamaño;

    public Lista_compra() {
        ultimo = null;
        tamaño = 0;
    }

    // Metodos getter para los atributtos
    public Nodo_compra getUltimo() {
        return ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

    // Metodo para retornar si esta vacia la lista
    public boolean estaVacio() {
        return ultimo == null;
    }

    // Metodo de tipo Lista_compra Para agrfegar a la lista
    public Lista_compra AgregarCompra(int id_producto, String tipo, int cantidad, int precio, String peso, String detalles) {
        Nodo_compra nuevo = new Nodo_compra(id_producto, tipo, cantidad, precio, peso, detalles);
        if (!estaVacio()) {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        } else {
            ultimo = nuevo;
        }
        tamaño++;
        return this;
    }

    
    // Metodo para listar los productos.
    public String[][] Listado_compra(JavaConexion BD, String filtro) {
        Lista_compra lista = BD.MostrarCompra(filtro);
        if(!lista.estaVacio()){
        String[][] Bus_datos = new String[lista.getTamaño()][6];
        Nodo_compra primero = lista.ultimo.sig;
        int indice = 0;
        do {
            Bus_datos[indice][0] = "" + primero.getId_producto();
            Bus_datos[indice][1] = primero.getTipo();
            Bus_datos[indice][2] = "" + primero.getCantidad();
            Bus_datos[indice][3] = "" + primero.getPrecio();
            Bus_datos[indice][4] = primero.getPeso();
            Bus_datos[indice][5] = primero.getDetalles();
            indice++;
            primero = primero.sig;
        } while (primero != lista.ultimo.sig);
        return Bus_datos;
        }else{
            String Sin_datos[][] = new String [0][0];
            return Sin_datos;
        }
    }

    
   
}
