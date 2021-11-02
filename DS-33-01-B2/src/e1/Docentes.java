package e1;

import java.util.ArrayList;

public class Docentes extends Personal{
    public enum Asignaturas{
        Historia,
        Transformaciones,
        Defensa,
        Herbologia,
        Pociones;
    }
    public Asignaturas asignatura;

    public Docentes(){
    }

    public Docentes(String nombre, String apellido, int edad, float horrocruxes, Asignaturas asignatura){
        super(nombre,apellido,edad,horrocruxes);
        this.asignatura = asignatura;
    }

    @Override
    public float getRecompensa(float horrocruxes) {
        if (asignatura == Asignaturas.Defensa){
            return super.getRecompensa(horrocruxes*50*75/100);
        }
        return super.getRecompensa(horrocruxes*65);
    }

    public int getSalario(Docentes docente){
        if(docente.asignatura == Asignaturas.Historia){
            return 200;
        }else if(docente.asignatura == Asignaturas.Transformaciones){
            return 400;
        }else if(docente.asignatura == Asignaturas.Defensa){
            return 500;
        }else if(docente.asignatura == Asignaturas.Herbologia){
            return 250;
        }else if(docente.asignatura == Asignaturas.Pociones){
            return 350;
        }else{
            return 0;
        }
    }
}

