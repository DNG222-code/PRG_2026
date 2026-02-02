package scanner;

import java.io.*;
import java.util.*;

public class ProvaScanner {

    public static void main(String[] args) {

        Scanner sc = null;
        // BufferedReader br = null;
        double numeros[] = new double[4];
        int contador = 0;

        String nombreFichero = "UD8/fixers/ficherosReales";

        try {
            // br = new BufferedReader(new FileReader(nombreFichero));
            sc = new Scanner(new File(nombreFichero));

            double suma = 0;
            double mitjana = 0;

//            for (int i = 0; i < numeros.length; i++) {
//                double n = sc.nextDouble();
//                numeros[i] = n;
//
//                suma += n;
//            }

            while (sc.hasNextDouble() && (contador < numeros.length)) {
                double n = sc.nextDouble();
                numeros[contador] = n;
                suma += n;

                contador++;
            }

            System.out.println("El array es: " + Arrays.toString(numeros));
            System.out.println();
            mitjana = suma / numeros.length;

            System.out.println("Suma: " + suma + "\tMitjana: " + mitjana);

        } catch (IOException ex) {
            System.out.println("S'ha produit un error intentant llegir el fitxer: " + ex.getMessage());
        } finally {
//            // Sempre s'ha de tancar el fitxer.
//            if (/*fr*/ br != null) {
//                try {
//                    /*fr*/ br.close();
//                } catch (IOException e) {
//                    System.out.println("S'ha produït un error intentant tancar el fitxer: " + e.getMessage());
//                }
//            }
            if (sc != null) {
                try {
                    sc.close();
                } catch (Exception ex) {
                    System.out.println("Error de Scanner: " + ex.getMessage());
                }
            }
        }

    }
}
