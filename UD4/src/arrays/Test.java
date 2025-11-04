package arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // ARRAYS - MATRIUS

        // Col·lecció ORDENADA de elements del MATEIX TIPUS.

        // Característiques
        /*
            - Elements homogenis
            - Index (inici en el 0)
            - Te un tamany fixad
         */

        // Declaració
        // tipusDada[] nomArray

        int[] numeros;
        double decimals[];

        // Inicialització
        numeros = new int[5]; // index 0 -> 4

//        numeros[0] = 40;
//        numeros[1] = 41;
//        numeros[2] = 42;
//        numeros[3] = 43;
//        numeros[4] = 44;

//        System.out.println(numeros[3]); // Si no hi ha, es 0.
        // y si supera el limit del array dona error

        // Bucle for
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//
//        }

        // Bucle for each
//        for (int numero : numeros) {
//            System.out.println(numero);
//
//        }

        String[] ciutats = {"Madrid", "barcelona", "Valencia", "Sevilla", "Bilbao"};

//        for (String ciudad : ciutats) {
//            System.out.println("Ciutat: " + ciudad);
//
//        }

        decimals = new double[4];

//        int[] numeros2 = numeros;
//        System.out.println(numeros2[4]);
//        numeros2[4] = 99;
//        System.out.println(numeros2[4]);
//        System.out.println(numeros[4]);

        numeros[0] = 8;
        numeros[1] = 4;
        numeros[2] = 2;
        numeros[3] = 9;
        numeros[4] = 0;


        // Posició de memoria.
//        System.out.println(ciutats);
        System.out.println(numeros);
//        System.out.println(decimals);
//        System.out.println(numeros2);

        int resultatSuma = suma(numeros);
        System.out.println(resultatSuma);

        // Mètodes i Propietats

        // Arrays.toString(T[] arr)
        System.out.println(Arrays.toString(numeros)); // [8, 4, 2, 9, 0] Usa corchetes.

        // Arrays.sort(T[] arr)
        Arrays.sort(numeros); // Lo ordena.
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(ciutats, String.CASE_INSENSITIVE_ORDER); // Ignora las mayusculas y minúsculas.
        System.out.println(Arrays.toString(ciutats));

    }

    public static int suma(int[] dades) {
        int resultat = 0;

        for (int d : dades) {
            resultat += d;
        }

        return resultat;

    }

}