package exercicis.activitat8pt5;

public class Entrada {

    // Atributs
    String castella;
    String catala;

    // Sobreescrivim el mètode de Object toString();
    @Override
    public String toString() {
        return "Entrada";
    }

    // Getter's (lectura)
    public String getCastella() {
        return castella;
    }

    public String getCatala() {
        return catala;
    }
}
