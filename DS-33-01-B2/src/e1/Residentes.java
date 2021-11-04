package e1;

public class Residentes extends Integrantes{
    public enum Casas{
        Gryffindor,
        Hufflepuff,
        Ravenclaw,
        Slytherin
    }
    public Casas casa;

    public Residentes(String nombre, String apellido, int edad, float horrocruxes, Casas casa){
        super(nombre,apellido,edad,horrocruxes);
        this.casa = casa;
    }

}
