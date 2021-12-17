package e1;

import java.util.ArrayList;
import java.util.List;

public class BuscarFecha implements Componente{
    public String fecha;

    public BuscarFecha(String fecha) {
        this.fecha = fecha;
    }
    List<Billete> ListaBilletesFecha = new ArrayList<>();

    @Override
    public List<Billete> buscar(List<Billete> ListaBilletes) {
        for (Billete billete : ListaBilletes ){
            if(billete.getFecha().equals(this.fecha)){
                ListaBilletesFecha.add(billete);
            }
        }
        return ListaBilletesFecha;
    }
}
