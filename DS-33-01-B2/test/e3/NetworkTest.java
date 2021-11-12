package e3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NoopProcessorErrorHandler;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    private Network newNetwork;
    TopicOfInterest coches = new TopicOfInterest("Coches");
    TopicOfInterest futbol = new TopicOfInterest("Futbol");
    TopicOfInterest programacion = new TopicOfInterest("Programacion");
    TopicOfInterest arte = new TopicOfInterest("Arte");

    List<TopicOfInterest> listaInteresesDavid = new ArrayList<>();
    List<TopicOfInterest> listaInteresesAlex = new ArrayList<>();

    @BeforeEach
    void setUp(){
        newNetwork = new Network();
    }

    @Test
    void testAddUser(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        assertEquals("[David, Alex]",newNetwork.getUsers().toString());
       // assertEquals("[Coches, Futbol, Programacion]\n",newNetwork.getIterests().toString());
    }

    @Test
    void testRemoveUser(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        newNetwork.removeUser("Alex");
        assertEquals("[David]",newNetwork.getUsers().toString());
      //  assertEquals("[Coches, Futbol]\n",newNetwork.getIterests().toString());

    }

    @Test
    void testAddInterest(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        newNetwork.addInterest("David",arte);
        assertEquals("[David, Alex]",newNetwork.getUsers().toString());
       // assertEquals("[Coches, Futbol, Arte, Programacion]",newNetwork.getIterests().toString());
    }

    @Test
    void testRemoveInterest(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        newNetwork.removeInterest("Alex",programacion);
        assertEquals("[David, Alex]",newNetwork.getUsers().toString());
       // assertEquals("[Coches, Futbol]\n",newNetwork.getIterests().toString());
    }

    @Test
    void testGetUsers(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        assertEquals("[David, Alex]",newNetwork.getUsers().toString());
    }

    @Test
    void testGetInterests(){
        listaInteresesDavid.add(coches);
        listaInteresesDavid.add(futbol);
        listaInteresesAlex.add(futbol);
        listaInteresesAlex.add(programacion);
        newNetwork.addUser("David",listaInteresesDavid);
        newNetwork.addUser("Alex",listaInteresesAlex);
        //assertEquals("[Coches, Futbol, Programacion]",newNetwork.getIterests().toString());
    }

}