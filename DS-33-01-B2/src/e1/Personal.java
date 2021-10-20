package e1;

public class Personal {
    public enum personal{
        docentes,
        conserjes,
        guardabosques;
    }

    public enum Asignaturas{
        Defensa,
        Transformaciones,
        Pociones,
        Herbologia,
        Historia;
    }

    public personal personal;
    public Asignaturas asignatura;

    public Personal() {
    }

    public Personal(personal personal, Asignaturas asignatura) {
        this.personal = personal;
        this.asignatura = asignatura;
    }
}
