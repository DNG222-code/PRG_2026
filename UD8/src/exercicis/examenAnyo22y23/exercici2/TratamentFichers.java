package exercicis.examenAnyo22y23.exercici2;

import java.io.*;
import java.util.*;

public class TratamentFichers {

    static String nombreFichero = "esportistes.txt";

    public static void leer(int edat, double pes, double alsada) {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            br.readLine(); // Salto de lectura de línea.

            // Inicializamos el Scanner y la lectura de cada línea.
            Scanner sc;
            String linea = br.readLine();

            // Recorremos todo el fichero.
            while (linea != null) {
                sc = new Scanner(linea);
                linea = br.readLine();

                // Guardamos lo leído en cada variable.
                edat = sc.nextInt();
                pes = sc.nextDouble();
                alsada = sc.nextDouble();
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
