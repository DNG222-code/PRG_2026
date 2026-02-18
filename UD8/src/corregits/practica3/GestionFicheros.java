package corregits.practica3;

import java.io.*;
import java.util.*;

public class GestionFicheros {

    public static int[] leerLista(String nombreFichero) {

        int[] numeros = new int[0];
        int numero;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea = br.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea);
                if (sc.hasNextInt()) {
                    numero = Integer.parseInt(linea);
                    numeros = Arrays.copyOf(numeros, numeros.length + 1);
                    numeros[numeros.length - 1] = numero;
                }
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error de lectura en \"" + nombreFichero + "\":" + e.getMessage());
        }

        return numeros;
    }

    public static boolean escribe(int[] lista, String nombreFichero, boolean sobreescribe) {

        boolean resultado = false;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero, sobreescribe))) {
            for (int numero : lista) {
                bw.write(numero + "");
                bw.newLine();
            }

            resultado = true;
        } catch (IOException e) {
            System.out.println("Error de escritura en \"" + nombreFichero + "\":" + e.getMessage());
        }

        return false;
    }
}
