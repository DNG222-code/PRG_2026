package ejercicio1;

// Importamos todos los packages para los ficheros.
import java.io.*;

public class FicherosReserva implements GestionReservas {

    // Método propio de la clase.
    Reserva[] añadirReservas(Reserva[] reservas, Reserva nueva) {

        // Añadimos una opción más para la longitud del array reservas.
        reservas = new Reserva[reservas.length + 1];

        // Vamos añadiendo nuevas reservas
        for (int i = 0; i < reservas.length; i++) {
            reservas[i] = nueva;
        }

        return reservas;
    }

    // Implementamos lo métodos de la interfaz GestionReservas
    @Override
    public void guardarReserva(Reserva reserva, String nombreFichero, boolean sobrescribir /* Indicamos que se sobreescriba */) {

        // Control de error try-catch para la escritura del fichero.
        try (BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero, sobrescribir))) {
            // Escribimos las reservas en el fichero del out.
            out.write(reserva.toString().split(";")[0]); // el toString y al final el (;).

        } catch (IOException ex) {
            System.out.println("Error al guardar reserva" + ex.getMessage());
        }
    }

    @Override
    public Reserva[] leerReservas(String nombreFicheros) {

        // Control de error try-catch para la lectura del fichero.
        try (BufferedReader in = new BufferedReader(new FileReader(nombreFicheros))) {

            // Array de Reserva para guardar lo leído.
            Reserva[] leidoReservas;

            String linea = in.readLine(); // Variable para leer línea a línea.

            // Vamos leyendo todo el fichero mientras sea diferente a null.
            while (linea != null) {
                linea = in.readLine();
                leidoReservas = new Reserva[linea.length()]; // Guardamos lo leído en el array.
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el fichero: " + ex.getMessage());
        }

        return new Reserva[0];
    }
}
