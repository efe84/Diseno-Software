package e3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NetworkMapTest {
    NetworkMap newNetworkMap = new NetworkMap();
    List<TopicOfInterest> listaA = new ArrayList<>();
    List<TopicOfInterest> listaB = new ArrayList<>();

    @BeforeEach
    void setUp(){
        listaA.add(new TopicOfInterest("coches"));
        listaA.add(new TopicOfInterest("arte"));
        listaA.add(new TopicOfInterest("programar"));
        listaA.add(new TopicOfInterest("deporte"));
        listaB.add(new TopicOfInterest("coches"));
        listaB.add(new TopicOfInterest("arte"));
        listaB.add(new TopicOfInterest("programar"));
        listaB.add(new TopicOfInterest("deporte"));

    }


    @Test
    void testAddUser(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        assertEquals("Alex[coches, arte, programar, deporte] David[coches, arte, programar, deporte] ", newNetworkMap.toString());
    }

    @Test
    void testRemoveUser(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        newNetworkMap.removeUser("David");
        assertEquals("Alex[coches, arte, programar, deporte] ", newNetworkMap.toString());
    }

    @Test
    void testAddInterest(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        newNetworkMap.addInterest("Alex", new TopicOfInterest("videojuegos"));
        assertEquals("Alex[coches, arte, programar, deporte, videojuegos] David[coches, arte, programar, deporte] ", newNetworkMap.toString());
    }

    @Test
    void testRemoveInterest(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        newNetworkMap.removeInterest("Alex", new TopicOfInterest("arte"));
        assertEquals("Alex[coches, programar, deporte] David[coches, arte, programar, deporte] ", newNetworkMap.toString());
    }
    @Test
    void testGetUsers(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        List<String> listaC = new ArrayList<>();
        listaC.add("Alex");
        listaC.add("David");
        assertEquals(listaC,newNetworkMap.getUsers());
    }
    @Test
    void testGetInterest(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        List<TopicOfInterest> listaD = new ArrayList<>();
        listaD.add(new TopicOfInterest("coches"));
        listaD.add(new TopicOfInterest("arte"));
        listaD.add(new TopicOfInterest("programar"));
        listaD.add(new TopicOfInterest("deporte"));
        listaD.add(new TopicOfInterest("coches"));
        listaD.add(new TopicOfInterest("arte"));
        listaD.add(new TopicOfInterest("programar"));
        listaD.add(new TopicOfInterest("deporte"));
        assertEquals(listaD, newNetworkMap.getIterests());
    }
    @Test
    void testgetInterestUser(){
        newNetworkMap.addUser("David", listaA);
        newNetworkMap.addUser("Alex", listaB);
        List<TopicOfInterest> listaE = new ArrayList<>();
        listaE.add(new TopicOfInterest("coches"));
        listaE.add(new TopicOfInterest("arte"));
        listaE.add(new TopicOfInterest("programar"));
        listaE.add(new TopicOfInterest("deporte"));
        assertEquals(newNetworkMap.getInterestsUser("Alex"),listaE);
    }
}