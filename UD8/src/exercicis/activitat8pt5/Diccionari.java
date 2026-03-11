package exercicis.activitat8pt5;

public class Diccionari implements Traductor {

    // Atributos
    Entrada[] entrades;

    // Mètodes del contracte.
    int cercar(String paraula) {
        return 0;
    }

    void afegit(String castella, String catala) {
        // Contador para que no se borren las palabras.
        int contador = 0;

        // Declarem s'array amb dues posicions.
        entrades = new Entrada[10];
        entrades[contador] = new Entrada(castella, catala);

        contador++;
    }

    void llistar() {

    }

    // Mètode implementat
    @Override
    public String traducir(String paraula) {
        return "";
    }
}
