package e2;

import java.util.Comparator;

public class CompPrecioBase implements Comparator<Apartamento> {

    @Override
    public int compare(Apartamento a1,Apartamento a2){
        return a1.getprecio_base()-a2.getprecio_base();
    }
}
