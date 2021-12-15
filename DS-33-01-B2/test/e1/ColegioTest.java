package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {
    private Colegio newColegio;
    private Colegio emptyColegio;

    @BeforeEach
    void setUp(){
        emptyColegio = new Colegio();
        newColegio = new Colegio();
        newColegio.addEstudiante("Hermione","Granger",18,3f, Residentes.Casas.Gryffindor);
        newColegio.addFantasma("Barón","Sanguinario",33,1f, Residentes.Casas.Slytherin);
        newColegio.addGuardabosques("Rubeus","Hagrid",22,2f);
        newColegio.addDocente("Minerva","McGonagall",34,1f, Docentes.Asignaturas.Transformaciones);
        newColegio.addDocente("Severus","Snape",29,2f, Docentes.Asignaturas.Defensa);
        newColegio.addConserje("Argus","Filch",30,0f);
    }

    @Test
    void testGetRecompensa(){
        assertEquals("La recompensa total del Colegio Hogwarts es de 0 galeones",emptyColegio.imprimirRecompensas());
        assertEquals("Hermione Granger(Estudiante de Gryffindor ,3 horrocruxes): 270.0 galeones\nBarón Sanguinario(Fantasma de Slytherin ,1 horrocruxes): 160.0 galeones\nRubeus Hagrid(Guardabosques ,2 horrocruxes): 150.0 galeones\nMinerva McGonagall(Docente de Transformaciones ,1 horrocruxes): 50.0 galeones\nSeverus Snape(Docente de Defensa ,2 horrocruxes): 75.0 galeones\nArgus Filch(Conserje ,0 horrocruxes): 0.0 galeones\nLa recompensa total del Colegio Hogwarts es de 705.0 galeones",newColegio.imprimirRecompensas());
    }
    @Test
    void testGetSalario(){
        assertEquals("El gasto de Hogwarts en personal es de 0 galeones",emptyColegio.imprimirSalarios());
        assertEquals("Rubeus Hagrid(Guardabosques): 180 galeones\nMinerva McGonagall(Docente de Transformaciones): 400 galeones\nSeverus Snape(Docente de Defensa): 500 galeones\nArgus Filch(Conserje): 160 galeones\nEl gasto de Hogwarts en personal es de 1240 galeones",newColegio.imprimirSalarios());
    }
}