package e1;

public class Integrantes extends Colegio{
    public String nombre;
    public String apellido;
    public int edad;
    public float horrocruxes;

    public Integrantes() {
    }

    public Integrantes(String nombre, String apellido, int edad, float horrocruxes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horrocruxes = horrocruxes;
    }

    public float getRecompensa(float horrocruxes){
        return horrocruxes;
    }

}


