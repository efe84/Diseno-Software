package e1;

import java.util.*;

public class Colegio{

    //Declaracion de listas
    public ArrayList<Integrantes> ListaIntegrantes = new ArrayList<>();

    //Funcion imprimirRecompensas
    public String imprimirRecompensas(ArrayList<Integrantes> integrantes){
        int n=0;
        float total=0.0f;
        String concat ="";
        while (n<= integrantes.size()){
            if(integrantes.get(n) instanceof Docentes docentes){
                concat += docentes.toStringRecompensa((Docentes) integrantes.get(n));
                total += docentes.getRecompensa(integrantes.get(n).horrocruxes);
            }else if(integrantes.get(n) instanceof Guardabosques guardabosques){
                concat += guardabosques.toStringRecompensa((Guardabosques)integrantes.get(n));
                total += guardabosques.getRecompensa(integrantes.get(n).horrocruxes);
            }else if(integrantes.get(n) instanceof Conserjes conserjes){
                concat += conserjes.toStringRecompensa((Conserjes) integrantes.get(n));
                total += conserjes.getRecompensa(integrantes.get(n).horrocruxes);
            }else if(integrantes.get(n) instanceof Estudiantes estudiantes){
                concat += estudiantes.toStringRecompensa((Estudiantes)integrantes.get(n));
                total += estudiantes.getRecompensa(integrantes.get(n).horrocruxes);
            }else if(integrantes.get(n) instanceof Fantasmas fantasmas){
                concat += fantasmas.toStringRecompensa((Fantasmas)integrantes.get(n));
                total += fantasmas.getRecompensa(integrantes.get(n).horrocruxes);
            }else{
                return "Error de tipo de persona en imprimir recompensa";
            }
            n++;
        }
        return concat.concat("La recompensa total del Colegio Howarts es de ").concat(String.valueOf(total)).concat(" galeones");
    }


    //Funcion imprimirSalarios
    public String imprimirSalarios(ArrayList<Integrantes> integrantes) {
        int n = 0,total=0;
        String concat ="";
        while (n <= integrantes.size()) {
            if (integrantes.get(n) instanceof Personal) {
                if (integrantes.get(n) instanceof Docentes docentes) {
                    concat += docentes.toStringSalario((Docentes) integrantes.get(n));
                    total += docentes.getSalario((Docentes) integrantes.get(n));
                } else if (integrantes.get(n) instanceof Guardabosques guardabosques) {
                    concat += guardabosques.toStringSalario((Guardabosques)integrantes.get(n));
                    total += guardabosques.getSalario((Guardabosques) integrantes.get(n));
                } else if(integrantes.get(n) instanceof Conserjes conserjes){
                    concat += conserjes.toStringSalario((Conserjes) integrantes.get(n));
                    total += conserjes.getSalario((Conserjes) integrantes.get(n));
                }else{
                    return "Error de tipo de persona Personal";
                }
            }
            n++;
        }
        return concat.concat("El gasto de Howarts en personal es de ").concat(String.valueOf(total)).concat(" galeones");
    }
}
