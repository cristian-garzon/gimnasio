package Controlador;
public class Nodo_producto {
    int id_productos;
    String tipo;
    int cantidad;  
    int precio;
    String peso;
    String detalles;
    Nodo_producto sig;
    public Nodo_producto(int id_productos, String tipo, int cantidad, int precio, String peso, String detalles) {
        this.id_productos = id_productos;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.peso = peso;
        this.detalles = detalles;
        this.sig=this;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getId_productos() {
        return id_productos;
    }

    public String getTipo() {
        return tipo;
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
    
}
