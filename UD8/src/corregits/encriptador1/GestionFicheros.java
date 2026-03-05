package corregits.encriptador1;

import java.io.*;

public class GestionFicheros {

//    public static String leer(String nombreFichero) {
//
//        String texto = "";
//        String saltoLinea = "\n";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
//            String linea = br.readLine();
//
//            while (linea != null) {
//                texto += linea + saltoLinea;
//                linea = br.readLine();
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error al leer el fichero: " + e);
//        }
//
//        return texto;
//    }
//
//    public static char[] leerCodigo(String nombreFichero, boolean esCodificado) {
//        char[] caracters = null;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
//            String linea = br.readLine();
//
//            // AL aber solo 2 líneas es suficiente 2 if's.
//            if (linea != null) {
//                if (esCodificado) {
//                    linea = br.readLine();
//
//                    if (linea != null) {
//                        caracters = br.readLine().toCharArray();
//                    }
//                }
//            } else {
//                caracters = br.readLine().toCharArray();
//            }
//        } catch (IOException e) {
//            System.out.println("Error al leer el fichero: " + e);
//        }
//
//        return caracters;
//    }
//
//    public static void escribeFichero(String texto, String nombreFichero) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
//            bw.write(texto);
//        } catch (IOException e) {
//            System.out.println("Error al escribir el fichero: " + e);
//        }
//    }
}
