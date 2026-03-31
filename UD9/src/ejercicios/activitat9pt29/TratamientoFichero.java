package ejercicios.activitat9pt29;

import java.io.*;
import java.util.*;

public class TratamientoFichero {

    // Variable del nombre del fichero.
    private static String nombreFichero = "stock.dat";

    // Declaramos el File, para comprobar si existe el fichero.
    private static File f = new File(nombreFichero);

    // Instanciamos el objeto Stock.
    Stock s = new Stock();

    // Declaramos el map para guardar los datos.
    Map<Integer, Stock> listaStock = new HashMap<>();

    // Método para leer fichero.
    public static void leerFichero(Stock s, List<Stock> listaStock) {
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))) {
                s = (Stock) ois.readObject();

                // Añadimos lo leído a la lista.
                listaStock.add(s);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el fichero: " + e);
            }
        } else {
            System.out.println("El fichero no existe. Vamos a crearlo vacío.");

            // Creamos el fichero.
            crearFichero();
        }
    }

    // Método para crear fichero. Porque aveces no se crea aun así ejecutando el programa varias veces.
    public static void crearFichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            oos.writeObject(new Stock());
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e);
        }
    }

    // Método para guardar fichero.
    public static void guardarFichero(List<Stock> listaStock) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            for (Stock s : listaStock) {
                oos.writeObject(s);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e);
        }
    }
}
