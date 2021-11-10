package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {
    private Apartamento newApartamento;
    private Apartamento emptyApartamento;
    private Apartamento newApartamento2;

    @BeforeEach
    void SetUp(){
        emptyApartamento = new Apartamento();
        newApartamento = new Apartamento();
        newApartamento.addApartamento(3,650,150,2000,15007);
        newApartamento.addApartamento(4,750,100,2500,15005);
        newApartamento.addApartamento(2,450,50,1000,15107);
        newApartamento.addApartamento(1,950,350,5000,15171);
        newApartamento.ordenarApartamentos(); //Ordenador con comp a null
    }

    @Test
    void testCompareTo(){
        assertEquals("",emptyApartamento.toString());
        assertEquals("1,950,350,5000,15171\n2,450,50,1000,15107\n3,650,150,2000,15007\n4,750,100,2500,15005\n",newApartamento.toString());
    }

    @Test
    void testComparePB(){
        newApartamento2 = new Apartamento();
        newApartamento2.addApartamento(3,650,150,2000,15007);
        newApartamento2.addApartamento(4,750,100,2500,15005);
        newApartamento2.addApartamento(2,450,50,1000,15107);
        newApartamento2.addApartamento(1,950,350,5000,15171);
        newApartamento2.setComp(new CompPrecioBase());
        newApartamento2.ordenarApartamentos();

        assertEquals("",emptyApartamento.toString());
        assertEquals("2,450,50,1000,15107\n3,650,150,2000,15007\n4,750,100,2500,15005\n1,950,350,5000,15171\n",newApartamento2.toString());

    }

    @Test
    void testComparePT(){
        newApartamento2 = new Apartamento();
        newApartamento2.addApartamento(3,650,150,2000,15007);
        newApartamento2.addApartamento(4,750,40,2500,15005);
        newApartamento2.addApartamento(2,450,50,1000,15107);
        newApartamento2.addApartamento(1,950,350,5000,15171);
        newApartamento2.setComp(new CompPrecioTotal());
        newApartamento2.ordenarApartamentos();

        assertEquals("",emptyApartamento.toString());
        assertEquals("2,450,50,1000,15107\n4,750,40,2500,15005\n3,650,150,2000,15007\n1,950,350,5000,15171\n",newApartamento2.toString());

    }

    @Test
    void testCompareCP(){
        newApartamento2 = new Apartamento();
        newApartamento2.addApartamento(3,650,150,2000,15007);
        newApartamento2.addApartamento(4,750,100,2500,15005);
        newApartamento2.addApartamento(2,450,50,1000,15107);
        newApartamento2.addApartamento(1,950,350,5000,15171);
        newApartamento2.setComp(new CompCP());
        newApartamento2.ordenarApartamentos();

        assertEquals("",emptyApartamento.toString());
        assertEquals("4,750,100,2500,15005\n3,650,150,2000,15007\n2,450,50,1000,15107\n1,950,350,5000,15171\n",newApartamento2.toString());

    }

    @Test
    void testCompareSize(){
        newApartamento2 = new Apartamento();
        newApartamento2.addApartamento(3,650,150,500,15007);
        newApartamento2.addApartamento(4,750,100,2500,15005);
        newApartamento2.addApartamento(2,450,50,1000,15107);
        newApartamento2.addApartamento(1,950,350,5000,15171);
        newApartamento2.setComp(new CompSize());
        newApartamento2.ordenarApartamentos();

        assertEquals("",emptyApartamento.toString());
        assertEquals("3,650,150,500,15007\n2,450,50,1000,15107\n4,750,100,2500,15005\n1,950,350,5000,15171\n",newApartamento2.toString());

    }

    @Test
    void equals(){
        Apartamento a1 = new Apartamento();
        Apartamento a2 = new Apartamento();

        assertEquals(a1,a2);
        assertEquals(a1.hashCode(),a2.hashCode());

        a1.addApartamento(3,650,150,2000,15007);
        a1.addApartamento(4,750,100,2500,15005);
        a1.addApartamento(2,450,50,1000,15107);
        a1.addApartamento(1,950,350,5000,15171);

        a2.addApartamento(2,650,150,2000,15007);
        a2.addApartamento(3,750,100,2500,15005);
        a2.addApartamento(1,450,50,1000,15107);
        a2.addApartamento(4,950,350,5000,15171);

        assertEquals(a1,a2);
        assertEquals(a1.hashCode(),a2.hashCode());
    }


}