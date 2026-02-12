package exercicis.activitat8pt3;

import java.io.*;
import java.util.*;

public class TratamientoFicheros {

    // Creamos los Atributos que necesiten los ficheros.
    static String path;

    public static void pedirNombreFichero() {
        // Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos el nombre del fichero al usuario.
        System.out.print("Introduce un nombre de fichero: ");
        path = sc.nextLine();
    }

    // Método para leer el fichero.
    public static Equacion[] leerFichero(String path) {

        // Declaramos el array de equaciones.
        Equacion[] equaciones = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int numEcuaciones = Integer.parseInt(br.readLine());
            // Le pasamos lo leido del fichero al array.
            equaciones = new Equacion[numEcuaciones];

            String linea;
            // Recorremos el fichero mientras se cumpla la condición.
            for (int i = 0; (linea = br.readLine()) != null && equaciones.length > 1; i++) {
                String[] espacios = linea.split(" ");

                // Guardamos en cada variable, cada índicie de espacios.
                int a = Integer.parseInt(espacios[0]);
                int b = Integer.parseInt(espacios[1]);
                int c = Integer.parseInt(espacios[2]);

                try {
                    equaciones[i] = new Equacion(a, b, c);

                } catch (EquacionInvalidaExcepcion e) {
                    System.out.println("Error en ecuación  " + (i + 1) +  ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return equaciones;
    }

    // Método para escribir en el fichero.
    public static void escribirSoluciones(String solucion) {
        // Control de errores.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("soluciones.txt", true))) {
            // Escribimos en el fichero la solución.
            bw.write(solucion);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
