package provesText;

import java.io.*;
import java.util.*;

public class Reales {

    public static void main(String[] args) {

        String path = "UD8/fixers/ficherosReales";
        String linea = "\n";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linia = br.readLine();
            String[] numeros = linia.split(", ");

            System.out.println(Arrays.toString(numeros));

            double suma = 0;
            double mitjana = 0;

            while (linia != null) {
                for (int i = 0; i < numeros.length; i++) {
                    suma += Double.parseDouble(Arrays.toString(numeros));
                }
            }

            mitjana = suma / numeros.length;

            System.out.println("Suma: " + suma + "\tMitjana: " + mitjana);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage() + "");
        }

    }
}