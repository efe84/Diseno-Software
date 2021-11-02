package e1;

public class Guardabosques extends Personal{
    public Guardabosques(){
    }

    public Guardabosques(String nombre, String apellido, int edad, float horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        return super.getRecompensa(horrocruxes*75);
    }

    public int getSalario(Guardabosques guardabosques){
        return 180;
    }
}
