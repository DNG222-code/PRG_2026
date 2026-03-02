package exercicis.activitat8pt4;

import java.io.*;

public class TratamientoFicheros {

    // Nombre ficheros declarados.
    static String nombreFichero1 = "UD8/fitxersBinaris/equipos.dat";
    static String nombreFichero2 = "UD8/fitxersBinaris/jugadores.dat";

    public static void leerFicheros() {
        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(nombreFichero1))) {
            String datos;

            while ((datos = oi.readLine()) != null) {

                datos = oi.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: Fichero no encontrado: " + e.getMessage());
        }

        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(nombreFichero2))) {
            String datos;

            while ((datos = oi.readLine()) != null) {

                datos = oi.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: Fichero no encontrado: " + e.getMessage());
        }
    }

    public static void generarFicheroTexto() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resumen_torneo.txt"))) {

        } catch (IOException e) {
            System.out.println("Error: El fichero ya existe: " + e.getMessage());
        }
    }
}
