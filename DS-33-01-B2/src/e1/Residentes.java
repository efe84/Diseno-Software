package e1;

public class Residentes {
        public enum residentes {
            estudiantes,
            fantasmas;
        }
        public enum Casas {
            Gryffindor,
            Hufflepuff,
            Ravenclaw,
            Slytherin;
        }

        public residentes residente;
        public Casas casa;

    public Residentes() {
    }

    public Residentes(residentes residente, Casas casa) {
        this.residente = residente;
        this.casa = casa;
    }
}
