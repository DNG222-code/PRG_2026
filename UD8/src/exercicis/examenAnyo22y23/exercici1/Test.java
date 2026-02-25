package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        NumerosABinari.escriureFitxerBinari();

        GestioFitxersBinaris.fusionar("UD8/fitxersBinaris/fitxer1.dat",
                "UD8/fitxersBinaris/fitxer2.dat");
    }
}
