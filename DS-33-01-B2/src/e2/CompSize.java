package e2;

import java.util.Comparator;

public class CompSize implements Comparator<Apartamento> {

    @Override
    public int compare(Apartamento a1,Apartamento a2){
        return a1.getSize()-a2.getSize();
    }
}
