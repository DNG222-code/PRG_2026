package corregits.encriptador2;

import java.io.*;

public class GestionFicheros {

    // Lee, línea a línea, un fichero de texto determinado.
    public static String leer(String nombreFichero) {

        String texto = "";
        String salto = "\n";

        try(BufferedReader in = new BufferedReader(new FileReader(nombreFichero))) {
            String linea  = in.readLine();
            while(linea != null) {
                texto += linea + salto;
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA: " + e);
        }

        return texto;
    }

    // Devuelve un array con los caracteres de una línea determinada
    // de un fichero de texto.
    public static char[] leerCodigo(String nombreFichero, boolean esCodificado) {

        char[] caracteres = null;

        try(BufferedReader in = new BufferedReader(new FileReader(nombreFichero))) {

            String linea  = in.readLine();
            if(linea != null) {
                if(!esCodificado) {
                    caracteres = linea.toCharArray();
                } else {
                    linea = in.readLine();
                    if(linea != null) {
                        caracteres = linea.toCharArray();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA: " + e);
        }

        return caracteres;
    }

    public static void escribeFichero(String texto, String nombreFichero) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero))) {
            out.write(texto);
        } catch (IOException e) {
            System.out.println("ERROR DE ESCRITURA: " + e);
        }
    }
}
