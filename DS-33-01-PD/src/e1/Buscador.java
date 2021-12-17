package e1;

import java.util.ArrayList;
import java.util.List;

public class Buscador implements Componente{
    private List<BuscarOrigen> ListaOrigenes;
    private BuscarDestino destino;
    private List<BuscarFecha> ListaFechas;
    private BuscarPrecio precio;

    public Buscador(){
    }

    public Buscador(List<BuscarOrigen> listaOrigenes, BuscarDestino destino, List<BuscarFecha> listaFechas,
                    BuscarPrecio precio) {
        ListaOrigenes = listaOrigenes;
        this.destino = destino;
        ListaFechas = listaFechas;
        this.precio = precio;
    }

    public List<BuscarOrigen> getListaOrigenes() {
        return ListaOrigenes;
    }

    public BuscarDestino getDestino() {
        return destino;
    }

    public List<BuscarFecha> getListaFechas() {
        return ListaFechas;
    }

    public BuscarPrecio getPrecio() {
        return precio;
    }

    public void setListaOrigenes(List<BuscarOrigen> listaOrigenes) {
        ListaOrigenes = listaOrigenes;
    }

    public void setDestino(BuscarDestino destino) {
        this.destino = destino;
    }

    public void setListaFechas(List<BuscarFecha> listaFechas) {
        ListaFechas = listaFechas;
    }

    public void setPrecio(BuscarPrecio precio) {
        this.precio = precio;
    }

    @Override
    public List<Billete> buscar(List<Billete> ListaBilletes) {
        List<List<Billete>> ListaListaBilletes = new ArrayList<>();
        List<Billete> ListaAux = new ArrayList<>();
        List<Billete> ListaConcatenadaOrigenes = new ArrayList<>();
        List<Billete> ListaConcatenadaDestinos = new ArrayList<>();
        List<Billete> ListaConcatenadaFechas = new ArrayList<>();
        List<Billete> ListaConcatenadaPrecios = new ArrayList<>();


        //OR
        for (BuscarOrigen origen : this.ListaOrigenes) {
            ListaListaBilletes.add(origen.buscar(ListaBilletes));
        }
        for (List<Billete> listaListaBillete : ListaListaBilletes) {
            ListaAux = listaListaBillete;
            ListaConcatenadaOrigenes.addAll(ListaAux);
        }

        //AND
        ListaAux.clear();
        ListaAux = destino.buscar(ListaBilletes);
        for (Billete listaAux : ListaAux) {
            for (Billete listaConcatenadaOrigene : ListaConcatenadaOrigenes) {
                if (listaAux == listaConcatenadaOrigene) {
                    ListaConcatenadaDestinos.add(listaAux);
                }
            }
        }

        //OR
        ListaListaBilletes.clear();
        ListaAux.clear();
        for (BuscarFecha fecha : this.ListaFechas) {
            ListaListaBilletes.add(fecha.buscar(ListaBilletes));
        }
        for (List<Billete> listaListaBillete : ListaListaBilletes) {
            ListaAux = listaListaBillete;
            ListaConcatenadaFechas.addAll(ListaAux);
        }

        //AND
        ListaAux.clear();
        for (Billete billete1 : ListaConcatenadaDestinos) {
            for (Billete billete2 : ListaConcatenadaFechas) {
                if (billete1 == billete2) {
                    ListaAux.add(billete1);
                }
            }
        }

        //AND
        ListaConcatenadaFechas.clear();
        ListaConcatenadaFechas = precio.buscar(ListaBilletes);
        for (Billete billete1 : ListaAux) {
            for (Billete billete2 : ListaConcatenadaFechas) {
                if (billete1 == billete2) {
                    ListaConcatenadaPrecios.add(billete1);
                }
            }
        }

        return ListaConcatenadaPrecios;
    }
}
