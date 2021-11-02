package e1;

public class Conserjes extends Personal{
    public Conserjes(){
    }

    public Conserjes(String nombre, String apellido, int edad, float horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        return super.getRecompensa(horrocruxes*65);
    }

    public int getSalario(Guardabosques guardabosques){
        return 160;
    }

}
