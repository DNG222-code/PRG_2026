package ejercicios.activitat9pt24;

import java.io.*;
import java.util.*;

public class TratamientoFicheros {

    // Atributo privado para el nombre del fichero.
    private static String nombreFichero = "registros_2026/03/30.dat";

    // Creamos una lista para guardar los datos de la temperatura.
    List<Temperatura> listaTemperaturas = new ArrayList<>();

    // Método para grabar datos en un fichero binario.
    public static void grabarFichero(List<Temperatura> listaTemperaturas) {
        // Mostramos que se está guardando el fichero.
        System.out.println("\nGuardando fichero: " + nombreFichero);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            // Vamos escribiendo lo que hay en la lista en el fichero binario.
            for (Temperatura t : listaTemperaturas) {
                oos.writeObject(t);
            }

            System.out.println("Se ha grabado el fichero " + nombreFichero +
                    " correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e + ". Revisa el error que te muestra.");
        }
    }
}
