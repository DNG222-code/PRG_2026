package exercicis.practicaUnPoc.exercici2;

import java.io.*;
import java.util.*;

public class TratamientoFicheros2 {

    // Declaramos las variables para tratar los ficheros.
    File f = new File("datos.txt"); // Nombre fichero.
    BufferedWriter bw = null;

    public void crearFichero() {
        // Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        // Declaramos variables.
        String nombre;
        int edad;

        // Pedimos al usuario su nombre.
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        // Pedimos al usuario su edad.
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        if (f.exists()) {
            System.out.println("El fichero existe. Vamos a guardar los datos.");
            escribirFichero(nombre, edad); // Llamamos el método para escribir el fichero.
        } else {
            System.out.println("El fichero no existe. Lo crearemos.");

            // Creamos el fichero datos.txt.
            try {
                bw = new BufferedWriter(new FileWriter("datos.txt"));
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void escribirFichero(String nombre, int edad) {
        try {
            bw = new BufferedWriter(new FileWriter(f));

            // Escribimos los datos al fichero.
            bw.write("Nombre: " + nombre + " \nEdad: " + edad);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerramos el fichero.
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println("Error tancant el fitxer: " + e.getMessage());
            }
        }
    }
}

// PREGUNTA DEL EJERCICIO:
// ¿Es necesario comprobar si el fichero existe?
// Sí, para saber si hay que crearlo o no.