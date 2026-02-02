package scanner;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] numero = new int[5];
//        String numerosCadena = "4 5 2 5 -1";

        String nombreFichero = "UD8/fixers/ficherosReales";

        FileReader fr = null;
        BufferedReader br = null;
//        Scanner sc = new Scanner(numerosCadena);
        try {
            Scanner sc = new Scanner(nombreFichero);

            fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);

            String linia = br.readLine();
            String[] numeros = linia.split(", ");

            System.out.println(Arrays.toString(numeros));

            while (linia != null) {
                for (int i = 0; i < numero.length; i++) {
                    numero[i] = sc.nextInt();
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Hay un error.");
        }
//        System.out.println("Introduzca 5 números enteros: ");
//        for (int i = 0; i < numero.length; i++) {
//            numero[i] = sc.nextInt();
//        }

        System.out.println(Arrays.toString(numero));

    }
}
