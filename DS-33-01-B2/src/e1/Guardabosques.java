package e1;

public class Guardabosques extends Personal {

    public Guardabosques(String nombre, String apellido, int edad, float horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        return super.getRecompensa(horrocruxes*75);
    }

    public String toStringRecompensa(Guardabosques guardabosques){
        String concat = "";
        String recompensa = String.valueOf(guardabosques.getRecompensa(guardabosques.horrocruxes));
        concat += guardabosques.nombre.concat(" ").concat(guardabosques.apellido).concat("(Guardabosques").concat(" ,").concat(String.valueOf((int)guardabosques.horrocruxes)).concat(" horrocruxes): ").concat(recompensa).concat(" galeones\n");
        return concat;
    }

    @Override
    public int getSalario(Personal personal){
        return 180;
    }

    public String toStringSalario(Guardabosques guardabosque){
        String concat = "";
        String salario = String.valueOf(guardabosque.getSalario(guardabosque));
        concat += guardabosque.nombre.concat(" ").concat(guardabosque.apellido).concat("(Guardabosques): ").concat(salario).concat(" galeones\n");
        return concat;
    }
}
