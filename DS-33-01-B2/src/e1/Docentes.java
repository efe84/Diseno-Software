package e1;

public class Docentes extends Personal{
    public enum Asignaturas{
        Historia,
        Transformaciones,
        Defensa,
        Herbologia,
        Pociones
    }
    public Asignaturas asignatura;

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

    public String toStringRecompensa(Docentes docentes){
        String concat = "";
        String recompensa = String.valueOf(docentes.getRecompensa(docentes.horrocruxes));
        concat += docentes.nombre.concat(" ").concat(docentes.apellido).concat(" ").concat("(Docente de ").concat(String.valueOf(docentes.asignatura)).concat(" ,").concat(String.valueOf(docentes.horrocruxes)).concat(" horrocruxes): ").concat(recompensa).concat(" galeones").concat("\n");
        return concat;
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

    public String toStringSalario(Docentes docente){
        String concat = "";
        String salario = String.valueOf(docente.getSalario(docente));
        concat += docente.nombre.concat(" ").concat(docente.apellido).concat(" ").concat("(Docente de ").concat(String.valueOf(docente.asignatura)).concat("): ").concat(salario).concat(" galeones").concat("\n");
        return concat;
    }
}

