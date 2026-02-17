package corregits.practica1;

import java.io.*;
import java.util.*;

public class TratarFichero {

    public static void leer() {
        String nombreFichero;
        Scanner sc = new Scanner(System.in);
        String contenidoFichero = "";
        String saltoCarro = "\n";

        System.out.println("Introduce el nombre del fichero con extensión \".txt\" :");
        nombreFichero = sc.nextLine().trim();

        if (nombreFichero == null || nombreFichero.length() == 0) {
            fitxerDefault();
        }

//        File f = new File(nombreFichero);
//        if (!f.exists()) {
//
//        }

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea = br.readLine();

            while (linea != null) {
                contenidoFichero += linea + saltoCarro;
                linea = br.readLine();
            }
            System.out.println(contenidoFichero);

        } catch (IOException e) {
            fitxerDefault();
            try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
                contenidoFichero = leerFichero(contenidoFichero, br);
            } catch (IOException ex) {
                System.out.println("Error al leer el fichero: " + ex.getMessage());
            }
        }
        System.out.println(contenidoFichero);
    }

    private static String leerFichero(String contenidoFichero, BufferedReader br) throws IOException {
        String saltoCarro = "\n";
        String linea = br.readLine();

        while (linea != null) {
            contenidoFichero += linea + saltoCarro;
            linea = br.readLine();
        }

        return contenidoFichero;
    }

    private static String fitxerDefault() {
        System.out.println("No se ha introducido un nombre de fichero válido. " +
                "\nSe utilizará el nombre: \"prova.txt\"");
        return "UD8/fixers/prova.txt";
    }
}
