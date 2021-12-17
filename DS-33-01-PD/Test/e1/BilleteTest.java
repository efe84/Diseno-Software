package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BilleteTest{
    List<Billete> ListaBilletes = new ArrayList<>();
    Billete billete1 = new Billete();
    Billete billete2 = new Billete("Santiago","Madrid",16,"17/12/2021");
    Billete billete3 = new Billete("Ourense","Coruña",10,"17/12/2021");
    Billete billete4 = new Billete("Ourense","Santiago",16,"16/12/2021");

    @BeforeEach
    void setUp(){
        billete1.setOrigen("Coruña");
        billete1.setDestino("Ourense");
        billete1.setPrecio(10);
        billete1.setFecha("16/12/2021");
        ListaBilletes.add(billete1);
        ListaBilletes.add(billete2);
        ListaBilletes.add(billete3);
        ListaBilletes.add(billete4);
    }

    @Test
    void testBuscarOrigen(){
        BuscarOrigen origen1 = new BuscarOrigen("Coruña");
        BuscarOrigen origen2 = new BuscarOrigen("Lugo");
        List<Billete> ListaResultado1 = new ArrayList<>();
        List<Billete> ListaResultado2 = new ArrayList<>();
        ListaResultado1.add(billete1);
        //1 billete desde Coruña
        assertEquals(ListaResultado1,origen1.buscar(ListaBilletes));
        //Ningun billete desde Lugo
        assertEquals(ListaResultado2,origen2.buscar(ListaBilletes));
    }

    @Test
    void testBuscarDestino(){
        BuscarDestino destino1 = new BuscarDestino("Ourense");
        BuscarDestino destino2 = new BuscarDestino("Lugo");
        List<Billete> ListaResultado1 = new ArrayList<>();
        List<Billete> ListaResultado2 = new ArrayList<>();
        ListaResultado1.add(billete1);
        //1 billete a Ourense
        assertEquals(ListaResultado1,destino1.buscar(ListaBilletes));
        //Ningun billete a Lugo
        assertEquals(ListaResultado2,destino2.buscar(ListaBilletes));
    }

    @Test
    void testBuscarFecha(){
        BuscarFecha fecha1 = new BuscarFecha("16/12/2021");
        BuscarFecha fecha2 = new BuscarFecha("31/12/2021");
        List<Billete> ListaResultado1 = new ArrayList<>();
        List<Billete> ListaResultado2 = new ArrayList<>();
        ListaResultado1.add(billete1);
        ListaResultado1.add(billete4);
        //2 billetes para el 16/12/2021
        assertEquals(ListaResultado1,fecha1.buscar(ListaBilletes));
        //Ningun billete para el 31/12/2021
        assertEquals(ListaResultado2,fecha2.buscar(ListaBilletes));
    }

    @Test
    void testBuscarPrecio(){
        BuscarPrecio precio1 = new BuscarPrecio(15);
        BuscarPrecio precio2 = new BuscarPrecio(9);
        List<Billete> ListaResultado1 = new ArrayList<>();
        List<Billete> ListaResultado2 = new ArrayList<>();
        ListaResultado1.add(billete1);
        ListaResultado1.add(billete3);
        //2 billetes por menos de 15€
        assertEquals(ListaResultado1,precio1.buscar(ListaBilletes));
        //Ningun billete por menos de 9€
        assertEquals(ListaResultado2,precio2.buscar(ListaBilletes));
    }

    @Test
    void testBuscador(){
        List<BuscarOrigen> ListaOrigenes = new ArrayList<>();
        List<BuscarFecha> ListaFechas = new ArrayList<>();
        BuscarOrigen origen1 = new BuscarOrigen("Coruña");
        BuscarOrigen origen2 = new BuscarOrigen("Santiago");
        ListaOrigenes.add(origen1);
        ListaOrigenes.add(origen2);
        BuscarDestino destino = new BuscarDestino("Ourense");
        BuscarFecha fecha1 = new BuscarFecha("16/12/2021");
        BuscarFecha fecha3 = new BuscarFecha("17/12/2021");
        BuscarFecha fecha2 = new BuscarFecha("31/12/2021");
        ListaFechas.add(fecha1);
        ListaFechas.add(fecha2);
        ListaFechas.add(fecha3);
        BuscarPrecio precio = new BuscarPrecio(15);

        List<Billete> Resultado = new ArrayList<>();
        Resultado.add(billete1);

        Buscador buscador = new Buscador();
        buscador.setListaOrigenes(ListaOrigenes);
        buscador.setDestino(destino);
        buscador.setListaFechas(ListaFechas);
        buscador.setPrecio(precio);
        assertEquals(Resultado,buscador.buscar(ListaBilletes));
    }
}