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

    public String toStringRecompensa(Estudiantes estudiante){
        String concat = "";
        String recompensa = String.valueOf(estudiante.getRecompensa(estudiante.horrocruxes));
        concat += estudiante.nombre.concat(" ").concat(estudiante.apellido).concat("(Estudiante de ").concat(String.valueOf(estudiante.casa)).concat(" ,").concat(String.valueOf((int)estudiante.horrocruxes)).concat(" horrocruxes): ").concat(recompensa).concat(" galeones\n");
        return concat;
    }
}
