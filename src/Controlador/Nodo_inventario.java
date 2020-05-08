package Controlador;
public class Nodo_inventario {
    private int id;
    private String fecha_ingres;
    private String nombre;
    private String tipo_objeto;
    private String caracteristicas;
    private String estado;
    private int unidades;
    Nodo_inventario sig;
    public void setId(int id) {
        this.id = id;
    }
    public Nodo_inventario(int id, String fecha_ingres, String nombre, String tipo_objeto, String caracteristicas, String estado, int unidades) {
        this.id = id;
        this.fecha_ingres = fecha_ingres;
        this.nombre = nombre;
        this.tipo_objeto = tipo_objeto;
        this.caracteristicas = caracteristicas;
        this.estado = estado;
        this.unidades = unidades;
        this.sig=this;
    }
    public void setFecha_ingres(String fecha_ingres) {
        this.fecha_ingres = fecha_ingres;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo_objeto(String tipo_objeto) {
        this.tipo_objeto = tipo_objeto;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public int getId() {
        return id;
    }
    public String getFecha_ingres() {
        return fecha_ingres;
    }
    public String getNombre() {
        return nombre;
    }

    public String getTipo_objeto() {
        return tipo_objeto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getEstado() {
        return estado;
    }

    public int getUnidades() {
        return unidades;
    }
}
