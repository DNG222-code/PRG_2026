package exercicis.examenAnyo22y23.exercici2;

import java.io.*;

public class TratamentFichers {

    static String nombreFichero;

    public static void leer() {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea = br.readLine();

            while (linea != null) {
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
