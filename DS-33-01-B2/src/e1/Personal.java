package e1;

import java.util.ArrayList;

public class Personal extends Integrantes{
    public int salario;

    public Personal(){
    }
    public Personal(String nombre, String apellido, int edad, float horrocruxes){
        super(nombre,apellido,edad,horrocruxes);
    }

    public int getSalario(Personal personal){
        return salario;
    }
}
