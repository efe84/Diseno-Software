package e1;

import java.util.*;

public class Colegio {

    //Declaracion de listas
    public ArrayList<Integrantes> ListaIntegrantes = new ArrayList<>();
    public ArrayList<Personal> ListaPersonal = new ArrayList<>();
    public ArrayList<Docentes> ListaDocentes = new ArrayList<>();
    public ArrayList<Guardabosques> ListaGuardabosques = new ArrayList<>();
    public ArrayList<Conserjes> ListaConserjes = new ArrayList<>();
    public ArrayList<Residentes> ListaResidentes = new ArrayList<>();
    public ArrayList<Estudiantes> ListaEstudiantes = new ArrayList<>();
    public ArrayList<Fantasmas> ListaFantasmas = new ArrayList<>();

    //Funcion imprimirRecompensas
    public String imprimirRecompensas(Integrantes integrantes){ //Puede ser pasandole un Object en vez de Integrantes
        int n=0;
        while (n<ListaIntegrantes.size()){
            Docentes d1 = ListaDocentes.get(n);
            Personal p1 = ListaPersonal.get(n);
            Guardabosques g1 = ListaGuardabosques.get(n);
            Conserjes c1 = ListaConserjes.get(n);
            Residentes r1 = ListaResidentes.get(n);
            Estudiantes e1 = ListaEstudiantes.get(n);
            Fantasmas f1 = ListaFantasmas.get(n);


            if(integrantes.nombre == d1.nombre){
            }else if(integrantes.nombre == p1.nombre){
                if (integrantes.nombre == g1.nombre){
                }else if(integrantes.nombre == c1.nombre){
                }
            }else if(integrantes.nombre == r1.nombre){
                if(integrantes.nombre == e1.nombre){
                }else if(integrantes.nombre == f1.nombre){
                }
            }else{
                System.out.println("Error de nombre al imprimir recompensa");
            }
            n++;
        }
        return "0";
    }

    //Funcion imprimirSalarios
    public String imprimirSalarios(Personal personal){
        personal.getSalario(personal);
        return "0";
    }
}
