package Controlador;

/**
 *
 * @author Daniel
 */
public class Nodo_compra {

    Nodo_compra sig;
    int id_producto, cantidad, precio;
    String peso, detalles, tipo;

    //Contructor asignando valores donde se instancie
    public Nodo_compra(int id_producto, String tipo, int cantidad, int precio, String peso, String detalles) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.detalles = detalles;
        this.peso = peso;
        this.sig = this;
    }
// Metodos de tipo set para los atributos y asignar valores.

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodos de tipo getter para retornar el valor de los atributos
    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getPeso() {
        return peso;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getTipo() {
        return tipo;
    }

}
