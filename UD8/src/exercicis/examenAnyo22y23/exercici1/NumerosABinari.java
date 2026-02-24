package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

// Creem aquesta classe per poder escriure els fitxers binaris amb el Serializable.
public class NumerosABinari implements Serializable {

    // Variables amb la ruta dels fitxers binaris.
    static String fitxer1 = "UD8/fitxersBinaris/fitxer1.dat";
    static String fitxer2 = "UD8/fitxersBinaris/fitxer2.dat";

    // Método per escriure els fitxers binaris.
    public static void escriureFitxerBinari() throws IOException {

        // Escriure el primer fitxer binari.
        try (ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(fitxer1))) {

            // Array amb números.
            int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            // Anem escribint el fitxer amb la longitud de l'Array.
            for (int num : numeros1) {
                oos1.writeInt(num);
            }
        }

        // Escriure el segón fitxer binari.
        try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(fitxer2))) {

            // Array amb números.
            int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            // Anem escribint el fitxer amb la longitud de l'Array.
            for (int num : numeros2) {
                oos2.writeInt(num);
            }
        }

    }
}
