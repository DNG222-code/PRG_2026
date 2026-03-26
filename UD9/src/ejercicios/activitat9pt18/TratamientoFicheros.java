package ejercicios.activitat9pt18;

import java.io.*;
import java.util.*;

public class TratamientoFicheros {

    // Variable para el nombre del fichero.
    private static String nombreFichero = "socio.dat";

    // Método para leer el fichero.
    public static void leerFichero() {

        // Lista donde guardaremos los datos.
        List<Socio> listaSocios = new ArrayList<>();

        // Mostramos que se está cargando el fichero.
        System.out.println("\nLeyendo fichero: " + nombreFichero);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))) {
            Socio s = (Socio) ois.readObject();
            
            while (s != null) {
                s = (Socio) ois.readObject();
                listaSocios.add(s);
            }
        } catch (EOFException ef) {
            System.out.println("\nSe ha acabado de leer el fichero: " + ef);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para guardar el fichero.
    public static void guardarFichero(List<Socio> listaSocios) {
        // Mostramos que se está guardando el fichero.
        System.out.println("\nGuardando fichero: " + nombreFichero);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            // Recorrer la lista y guardar cada socio en el fichero.
            for (Socio s : listaSocios) {
                oos.writeObject(s);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
