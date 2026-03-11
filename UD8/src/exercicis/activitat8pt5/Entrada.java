package exercicis.activitat8pt5;

public class Entrada {

    // Atributs
    String castella;
    String catala;

    // Constructor para añadir las palabras al array de Entrada.
    public Entrada(String castella, String catala) {
        this.castella = castella;
        this.catala = catala;
    }

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
