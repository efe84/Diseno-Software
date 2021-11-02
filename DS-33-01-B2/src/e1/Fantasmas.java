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
}
