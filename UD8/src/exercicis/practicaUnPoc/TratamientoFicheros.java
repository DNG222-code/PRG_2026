package exercicis.practicaUnPoc;

import java.io.*;
import java.util.*;

public class TratamientoFicheros {

    String path;
    String nombreFichero;

    // Juntamos la ruta con el nombre del fichero.
    File f = new File(nombreFichero + path);

    public void leerFichero() {
        // Declaramos el scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos el nombre del fichero al usuario.
        System.out.print("Introduce un nombre de fichero: ");
        nombreFichero = sc.nextLine();

        // Pedimos la ruta del fichero al usuario.
        System.out.print("Introduzca la ruta del fichero, según su Sistema: ");
        path = sc.nextLine();

        // Comprobamos si existe el fichero, si no le pondremos prova.txt.
        if (f.exists()) {
            try {
                FileReader fr = new FileReader(f);
            } catch (IOException e) {
                System.out.println("Error, no se encuntra el fichero: " + e.getMessage());
            }

            System.out.println("El fichero existe. Vamos a enseñarlo.");
        } else {
            System.out.println("El fichero no existe. Pondremos por defecto prova.txt");
            try {
                String linea = "";
            } catch (IOException e) {
                System.out.println("Error, no se encuntra el fichero: " + e.getMessage());
            }
        }
    }

    public void escribirFichero() {

    }
}
