package activitat7pt4;

import java.time.format.*;

public class Llamada implements Comparable<Llamada> {
    // Atributos.
    int numTelefono;
    int numInterlocutor;
    boolean esSaliente;
    DateTimeFormatter fechaYHora;
    Zona zonas;
    final double[] tarifas = {2.0, 2.0, 1.5, 1.2, 0.5};

    // Implementamos el método del comparable.
    @Override
    public int compareTo(Llamada o) {


        return 0;
    }
}
