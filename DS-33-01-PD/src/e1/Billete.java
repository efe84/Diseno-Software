package e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Billete implements Comparable<Billete>{
    public String origen;
    public String destino;
    public float precio;
    public int fecha;
    public Comparator<Billete> comp;

    public Billete(){
    }

    public Billete(String origen, String destino, float precio, int fecha) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.fecha = fecha;
    }

    ArrayList<Billete> ListaBilletes = new ArrayList<>();
    public void addBillete(String origen,String destino,float precio,int fecha){
        ListaBilletes.add(new Billete(origen,destino,precio,fecha));
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public float getPrecio() {
        return precio;
    }

    public int getFecha() {
        return fecha;
    }


    @Override
    public int compareTo(Billete o) {
        return this.getFecha()-o.getFecha();
    }

    public void setComp(Comparator<Billete> comp){
        this.comp = comp;
    }

    public void ordenarBilletes(){
        ListaBilletes.sort(comp);
    }

}
