/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Daniel
 */
public class Nodo_pdf {
    Nodo_pdf sig;
    int id;
    String nombre;
    byte[] archivopdf;
    
    public Nodo_pdf(int id, String nomrbe, byte[] archivopdf){
        this.id = id;
        this.nombre = nombre;
        this.archivopdf = archivopdf;
        this.sig=this;
    }

    //Metodos setter
    public void setSig(Nodo_pdf sig) {
        this.sig = sig;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    
    //Metodos Getter
    public Nodo_pdf getSig() {
        return sig;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }
}
