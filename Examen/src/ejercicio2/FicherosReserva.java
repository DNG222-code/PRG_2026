package ejercicio2;

// Importamos todos los packages para los ficheros.
import java.io.*;

public class FicherosReserva implements GestionReservas {

    // Implementamos el nuevo método guradarReservas con el array.
    @Override
    public void guardarReservas(Reserva[] reserva, String nombreFichero, boolean sobrescribir) {

        // Hacemos un control de error para guardar el fichero binario
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            // Inicializamos el array con la longitud de las reservas.
            reserva = new Reserva[reserva.length];

            // Guardamos en el fichero binario el contenido del array.
            for (int i = 0; i < reserva.length; i++) {
                out.writeObject(reserva[i]);
            }

        } catch (IOException e) {
            System.out.println("Error: No se pudo guardar el archivo: " + e.getMessage());
        }
    }

    @Override
    public Reserva[] leerReservas(String nombreFicheros) {

        // Control de error try-catch para la lectura del fichero binario.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFicheros))) {
            int[] datos; // Array para guradar los bits leídos.

            // Recorrer el fichero y guardarlo en el array.
            while (true) {
                datos = new int[]{ois.read()};
            }

        } catch (IOException ex) {
            System.out.println("Error: No se pudo leer el archivo: " + ex.getMessage());
        }

        return new Reserva[0];
    }
}
