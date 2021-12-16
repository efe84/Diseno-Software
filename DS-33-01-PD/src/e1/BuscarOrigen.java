package e1;

import java.util.ArrayList;
import java.util.List;

public class BuscarOrigen implements Componente{
    public String origen;

    public BuscarOrigen(String origen) {
        this.origen = origen;
    }
    List<Billete> ListaBilletesOrigen = new ArrayList<>();

    @Override
    public List<Billete> buscar(List<Billete> ListaBilletes) {
        for (Billete billete : ListaBilletes ){
            if(billete.getOrigen() == this.origen){
                ListaBilletesOrigen.add(billete);
            }
        }
        return ListaBilletesOrigen;
    }
}
