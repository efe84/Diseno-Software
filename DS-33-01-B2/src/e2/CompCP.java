package e2;

import java.util.Comparator;

public class CompCP implements Comparator<Apartamento> {

    @Override
    public int compare(Apartamento a1,Apartamento a2){
        return a1.getcodPostal()-a2.getcodPostal();
    }
}
