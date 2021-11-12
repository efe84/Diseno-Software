package e3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NetworkMapTest {
    private NetworkMap newNetworkMap;

    @BeforeEach
    void setUp(){
        newNetworkMap = new NetworkMap();
        List<TopicOfInterest> listaIntereses = new ArrayList<>();
        HashMap<String, List<TopicOfInterest>> newMap= new HashMap<String,List<TopicOfInterest>>();
    }


    @Test
    void testAddUser(){
    }


}