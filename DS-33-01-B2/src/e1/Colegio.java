package e1;

import java.util.*;

public class Colegio{

    //Declaracion de listas
    public ArrayList<Integrantes> ListaIntegrantes = new ArrayList<>();

    //Funciones para añadir Integrantes de cada tipo
    public void addDocente(String nombre,String apellido,int edad,float horrocruxes,Docentes.Asignaturas asignatura){
        ListaIntegrantes.add(new Docentes(nombre,apellido,edad,horrocruxes,asignatura));
    }
    public void addConserje(String nombre,String apellido,int edad,float horrocruxes){
        ListaIntegrantes.add(new Conserjes(nombre,apellido,edad,horrocruxes));
    }
    public void addGuardabosques(String nombre,String apellido,int edad,float horrocruxes){
        ListaIntegrantes.add(new Guardabosques(nombre,apellido,edad,horrocruxes));
    }
    public void addEstudiante(String nombre, String apellido, int edad, float horrocruxes, Residentes.Casas casa){
        ListaIntegrantes.add(new Estudiantes(nombre,apellido,edad,horrocruxes,casa));
    }
    public void addFantasma(String nombre,String apellido,int edad,float horrocruxes,Residentes.Casas casa){
        ListaIntegrantes.add(new Fantasmas(nombre,apellido,edad,horrocruxes,casa));
    }


    //Funcion imprimirRecompensas
    public String imprimirRecompensas(){
        int n=0;
        float total=0.0f;
        String concat ="";

        //Comprobamos si la lista está vacía
        if(ListaIntegrantes.isEmpty()){
            return "La recompensa total del Colegio Hogwarts es de 0 galeones";
        }

        while (n<= ListaIntegrantes.size()-1){
            if(ListaIntegrantes.get(n) instanceof Docentes docentes){
                concat += docentes.toStringRecompensa((Docentes) ListaIntegrantes.get(n));
                total += docentes.getRecompensa(ListaIntegrantes.get(n).horrocruxes);
            }else if(ListaIntegrantes.get(n) instanceof Guardabosques guardabosques){
                concat += guardabosques.toStringRecompensa((Guardabosques)ListaIntegrantes.get(n));
                total += guardabosques.getRecompensa(ListaIntegrantes.get(n).horrocruxes);
            }else if(ListaIntegrantes.get(n) instanceof Conserjes conserjes){
                concat += conserjes.toStringRecompensa((Conserjes) ListaIntegrantes.get(n));
                total += conserjes.getRecompensa(ListaIntegrantes.get(n).horrocruxes);
            }else if(ListaIntegrantes.get(n) instanceof Estudiantes estudiantes){
                concat += estudiantes.toStringRecompensa((Estudiantes)ListaIntegrantes.get(n));
                total += estudiantes.getRecompensa(ListaIntegrantes.get(n).horrocruxes);
            }else if(ListaIntegrantes.get(n) instanceof Fantasmas fantasmas){
                concat += fantasmas.toStringRecompensa((Fantasmas)ListaIntegrantes.get(n));
                total += fantasmas.getRecompensa(ListaIntegrantes.get(n).horrocruxes);
            }else{
                return "Error de tipo de persona en imprimir recompensa";
            }
            n++;
        }
        return concat.concat("La recompensa total del Colegio Hogwarts es de ").concat(String.valueOf(total)).concat(" galeones");
    }


    //Funcion imprimirSalarios
    public String imprimirSalarios() {
        int n = 0,total=0;
        String concat ="";

        //Comprobamos si la lista está vacía
        if(ListaIntegrantes.isEmpty()){
            return "El gasto de Hogwarts en personal es de 0 galeones";
        }

        while (n <= ListaIntegrantes.size()-1) {
            if(ListaIntegrantes.get(n) instanceof Personal) {
                if (ListaIntegrantes.get(n) instanceof Docentes docentes) {
                    concat += docentes.toStringSalario((Docentes) ListaIntegrantes.get(n));
                    total += docentes.getSalario((Docentes) ListaIntegrantes.get(n));
                } else if (ListaIntegrantes.get(n) instanceof Guardabosques guardabosques) {
                    concat += guardabosques.toStringSalario((Guardabosques) ListaIntegrantes.get(n));
                    total += guardabosques.getSalario((Guardabosques) ListaIntegrantes.get(n));
                } else if (ListaIntegrantes.get(n) instanceof Conserjes conserjes) {
                    concat += conserjes.toStringSalario((Conserjes) ListaIntegrantes.get(n));
                    total += conserjes.getSalario((Conserjes) ListaIntegrantes.get(n));
                } else {
                    return "Error de tipo de persona Personal";
                }
            }
            n++;
        }
        return concat.concat("El gasto de Hogwarts en personal es de ").concat(String.valueOf(total)).concat(" galeones");
    }
}
