package e1;

import java.util.ArrayList;
import java.util.List;

public class BuscarDestino implements Componente{
    public String destino;

    public BuscarDestino(String destino) {
        this.destino = destino;
    }
    List<Billete> ListaBilletesDestino = new ArrayList<>();

    @Override
    public List<Billete> buscar(List<Billete> ListaBilletes) {
        for (Billete billete : ListaBilletes ){
            if(billete.getDestino() == this.destino){
                ListaBilletesDestino.add(billete);
            }
        }
        return ListaBilletesDestino;
    }
}
