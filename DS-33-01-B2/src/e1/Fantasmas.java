package e1;

public class Fantasmas extends Residentes{

    public Fantasmas(String nombre,String apellido, int edad,int horrocruxes,Casas casa){
        super(nombre,apellido,edad,horrocruxes,casa);
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        if(casa == Casas.Slytherin){
            return super.getRecompensa(horrocruxes*160);
        }
        return super.getRecompensa(horrocruxes*80);
    }

    public String toStringRecompensa(Fantasmas fantasma){
        String concat = "";
        String recompensa = String.valueOf(fantasma.getRecompensa(fantasma.horrocruxes));
        concat += fantasma.nombre.concat(" ").concat(fantasma.apellido).concat(" ").concat("(Fantasma de ").concat(String.valueOf(fantasma.casa)).concat(" ,").concat(String.valueOf(fantasma.horrocruxes)).concat(" horrocruxes): ").concat(recompensa).concat(" galeones");
        return concat;
    }
}
