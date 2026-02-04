package exercicis.practicaUnPoc.exercici3;

import java.io.*;
import java.util.*;

public class TratamientoFicheros3 {

    // Declaramos los 2 ficheros.
    File f1 = new File("UD8/fixers/lista1.txt");
    File f2 = new File("UD8/fixers/lista2.txt");

    // Declaramos las variables para leer.
    FileReader fr1 = null;
    BufferedReader br1 = null;
    FileReader fr2 = null;
    BufferedReader br2 = null;

    public void leerFicheros() {
        try {
            int total = contarEnteros(f1) + contarEnteros(f2);
            int[] numeros = new int[total];

            int idx = 0;
            idx = leerEnterosEnArray(f1, numeros, idx);
            idx = leerEnterosEnArray(f2, numeros, idx);

            System.out.println("Los 2 ficheros contienen: " + Arrays.toString(numeros));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private int contarEnteros(File f) throws IOException {
        int count = 0;
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    sc.nextInt();
                    count++;
                } else {
                    sc.next(); // salta tokens que no sean enteros
                }
            }
        }
        return count;
    }

    private int leerEnterosEnArray(File f, int[] dest, int startIndex) throws IOException {
        int i = startIndex;
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    dest[i] = sc.nextInt();
                    i++;
                } else {
                    sc.next();
                }
            }
        }
        return i;
    }
}
