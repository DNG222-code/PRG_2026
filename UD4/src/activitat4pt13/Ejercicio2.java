package activitat4pt13;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaramos las variables
        int[] temperaturas = new int[7];

        // Llamamos al metodo donde pedimos las temperaturas.
        temperaturas(temperaturas);
        System.out.println();
        // Llamamos el método temperaturaMedia.
        temperaturaMedia(temperaturas);

        System.out.println();
        ordenInverso(temperaturas);

    }

    public static void temperaturas(int[] temperaturas) {
        // Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextInt();

        }

    }

    public static void temperaturaMedia(int[] temperaturas) {
        // Declaramos variables para calcular la media.
        int suma = 0;
        double media = 0;

        // Sumamos las temperaturas 1 a 1 y calculamos la media de ellas.
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];

        }

        media = (double) suma / temperaturas.length;

        // Mostramos el total.
        System.out.println("Temperatura media: " + media);

        // Comprobamos que algún día tenga más temperatura que la media y lo mostramos por pantalla.
        boolean hayMayor = true;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                if (!hayMayor) {
                    System.out.println("No hay temperaturas mayores a la media.");

                } else {
                    System.out.println("Días con temperaturas mayores a la media: " + temperaturas[i]);

                }

            }

        }

    }

    public static void ordenInverso(int[] temperaturas) {
        System.out.print("Temperaturas en orden inverso: ");

        Arrays.sort(temperaturas);
        for (int t : temperaturas) {
            System.out.print(t);

        }

    }

}