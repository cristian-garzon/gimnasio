package Controlador;
public class Nodo_usuarios {
    long cedula,telefono;
    Nodo_usuarios sig;
    String nombre,correo,direccion,estatus,tipo_usuario;
    public Nodo_usuarios(long cedula, String nombre, long telefono, String correo, String direccion, String estatus, String tipo_usuario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estatus = estatus;
        this.tipo_usuario=tipo_usuario;
        this.sig=this;
    }
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstatus() {
        return estatus;
    }
    
}
