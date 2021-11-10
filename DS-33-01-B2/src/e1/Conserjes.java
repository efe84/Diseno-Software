package e1;

public class Conserjes extends Personal{

    public Conserjes(String nombre, String apellido, int edad, float horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        return super.getRecompensa(horrocruxes*65);
    }

    public String toStringRecompensa(Conserjes conserjes){
        String concat = "";
        String recompensa = String.valueOf(conserjes.getRecompensa(conserjes.horrocruxes));
        concat += conserjes.nombre.concat(" ").concat(conserjes.apellido).concat("(Conserje").concat(" ,").concat(String.valueOf((int)conserjes.horrocruxes)).concat(" horrocruxes): ").concat(recompensa).concat(" galeones\n");
        return concat;
    }

    @Override
    public int getSalario(Personal personal){
        return 160;
    }

    public String toStringSalario(Conserjes conserje){
        String concat = "";
        String salario = String.valueOf(conserje.getSalario(conserje));
        concat += conserje.nombre.concat(" ").concat(conserje.apellido).concat("(Conserje): ").concat(salario).concat(" galeones").concat("\n");
        return concat;
    }

}
