package Controlador;

import Modelo.JavaConexion;

public class lista_inventario {

    Nodo_inventario ultimo;
    private int tamaño;

    public lista_inventario() {
        ultimo = null;
        tamaño = 0;
    }

    public boolean vacio() {
        return ultimo == null;
    }

    public Nodo_inventario getUltimo() {
        return ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }
    public lista_inventario agregar(int id, String fecha_ingres, String nombre, String tipo_objeto, String caracteristicas, String estado, int unidades){
       Nodo_inventario nuevo=new Nodo_inventario(id,fecha_ingres,nombre,tipo_objeto,caracteristicas,estado,unidades);
        if (!vacio()) {
            nuevo.sig = ultimo.sig;
            ultimo.sig = nuevo;
        } else {
            ultimo = nuevo;
        }
        tamaño++;
        return this;
    }
    public String[][] listado(JavaConexion BD, String filtro){
        lista_inventario lista= BD.listari(filtro);
        if(!lista.vacio()){
            int i=0;
            String informacion[][]=new String [lista.getTamaño()][7];
            Nodo_inventario p=lista.ultimo.sig;
            do {                
                informacion[i][0]=""+p.getId();
                informacion[i][1]=p.getFecha_ingres();
                informacion[i][2]=p.getNombre();
                informacion[i][3]=p.getTipo_objeto();
                informacion[i][4]=p.getCaracteristicas();
                informacion[i][5]=p.getEstado();
                informacion[i][6]=""+p.getUnidades();
                i++;
                p=p.sig;
            } while (p != lista.ultimo.sig);
            return informacion;
        }
        String nada[][]=new String [0][0];
        return nada;
    }
}
