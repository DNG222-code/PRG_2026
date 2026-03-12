package practicar.examen22Y23;

import java.io.*;

public class GestionFicheros {

    public static String nombreFichero = "UD8/fixers/esportistes.txt";

    public static void leerFichero() {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            String linea = br.readLine();

            while (linea != null) {
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
