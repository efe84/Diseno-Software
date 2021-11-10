package e2;

import java.util.Comparator;

public class CompPrecioTotal implements Comparator<Apartamento> {

    @Override
    public int compare(Apartamento a1,Apartamento a2){
        int preciototal1 = a1.getprecio_base() + a1.getprecio_garaje();
        int preciototal2 = a2.getprecio_base() + a2.getprecio_garaje();
        return preciototal1-preciototal2;
    }
}
