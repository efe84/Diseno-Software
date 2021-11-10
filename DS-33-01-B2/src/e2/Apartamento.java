package e2;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;
import java.util.*;

public class Apartamento implements Comparable<Apartamento>{
    public int num_ref;
    public int precio_base;
    public int precio_garaje;
    public int size;
    public int codPostal;
    public Comparator<Apartamento> comp = null;

    public Apartamento(){
    }

    public Apartamento(int num_ref, int precio_base, int precio_garaje, int size, int codPostal){
        this.num_ref = num_ref;
        this.precio_base = precio_base;
        this.precio_garaje = precio_garaje;
        this.size = size;
        this.codPostal = codPostal;
    }

    ArrayList<Apartamento> ListaApartamentos = new ArrayList<>();
    public void addApartamento(int num_ref, int precio_base, int precio_garaje, int size, int codPostal){
        ListaApartamentos.add(new Apartamento(num_ref,precio_base,precio_garaje,size,codPostal));
    }

    public int getcodPostal() {return this.codPostal;}
    public int getnum_ref() {
        return this.num_ref;
    }
    public int getprecio_base() {
        return this.precio_base;
    }
    public int getprecio_garaje(){
        return this.precio_garaje;
    }
    public int getSize(){
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartamento apartamento)) return false;
        return this.precio_base == apartamento.precio_base && this.precio_garaje == apartamento.precio_garaje && this.size == apartamento.size && this.codPostal == apartamento.codPostal;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getnum_ref();
        result = 31 * result + getcodPostal();
        result = 31 * result + getprecio_base();
        result = 31 * result + getprecio_garaje();
        result = 31 * result + getSize();
        return result;
    }

    @Override
    public int compareTo(Apartamento o) {
        return this.getnum_ref()-o.getnum_ref();
    }

    public void setComp(Comparator<Apartamento> comp){
        this.comp = comp;
    }

    public Comparator<Apartamento> getComp(){
        return this.comp;
    }

    public void ordenarApartamentos(){
        if(this.comp != null){
            Collections.sort(ListaApartamentos,comp);
        }else{
            Collections.sort(ListaApartamentos);
        }
    }

    public String toString(){
        int n = 0;
        String concat = "";
        while(n< ListaApartamentos.size()){
            Apartamento a = ListaApartamentos.get(n);
                concat += String.valueOf(a.num_ref).concat(",").concat(String.valueOf(a.precio_base)).concat(",").concat(String.valueOf(a.precio_garaje)).concat(",").concat(String.valueOf(a.size)).concat(",").concat(String.valueOf(a.codPostal)).concat("\n");
            n++;
        }
        return concat;
    }

}
