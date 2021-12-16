package e1;

import java.util.ArrayList;
import java.util.List;

public class BuscarPrecio implements Componente{
    public float precio;

    public BuscarPrecio(float precio) {
        this.precio = precio;
    }
    List<Billete> ListaBilletesPrecio = new ArrayList<>();

    @Override
    public List<Billete> buscar(List<Billete> ListaBilletes) {
        for (Billete billete : ListaBilletes ){
            if(billete.getPrecio() <= this.precio){
                ListaBilletesPrecio.add(billete);
            }
        }
        return ListaBilletesPrecio;
    }
}
