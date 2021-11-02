package e1;

public class Estudiantes extends Residentes{

    public Estudiantes(String nombre,String apellido, int edad,float horrocruxes,Casas casa){
        super(nombre,apellido,edad,horrocruxes,casa);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        if(casa == Casas.Slytherin){
            return super.getRecompensa(horrocruxes*180);
        }
        return super.getRecompensa(horrocruxes*90);
    }
}
