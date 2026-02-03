package exercicis.practicaUnPoc.exercici1;

import java.io.*;
import java.util.*;

public class TratamientoFicheros1 {

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
        System.out.print("Introduzca la ruta del fichero, según su Sistema de archivos: ");
        path = sc.nextLine();

        // Comprobamos si existe el fichero, si no le pondremos prova.txt.
        if (f.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));

                System.out.println("El fichero existe. Vamos a enseñarlo.");
                String linea = ""; // Declaramos la variable para leer el fichero.
                // Recorremos el fichero con la variable creada.
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error, no se encuntra el fichero: " + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe. Pondremos por defecto prova.txt");
            escribirFichero(); // Llamamos el método de escribirFichero(), para crearlo.
        }
    }

    public void escribirFichero() {
        // Creamos el fichero si no está creado.
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
