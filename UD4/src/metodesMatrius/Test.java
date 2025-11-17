package metodesMatrius;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Arrays.binarySearch(array, key)

//        int[] numeros = {1, 2, 3, 4, 5};

//        int index = Arrays.binarySearch(numeros, 3);

//        System.out.println(index);

//        String[] palabras = {"hola", "mundo", "java"};
//
//        int index = Arrays.binarySearch(palabras, "mundo");
//
//        System.out.println(index);

//        int[] numeros2 = {1, 2, 3, 4, 5};

//        boolean sonIguals = Arrays.equals(numeros, numeros2);
//        System.out.println("¿Son iguals? " + (sonIguals ? "Sí " : "No "));

//        int[] numeros = new int[5];
//
         // Arrays.fill()
//        Arrays.fill(numeros, 7);
//
//        System.out.println(Arrays.toString(numeros));

        // Arrays.copyOf(array, newSize)
//        int[] numeros = {1, 2, 3, 4, 5};
//        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length + 3);

//        System.out.println(Arrays.toString(copiaNumeros));
//        System.out.println(numeros);
//        System.out.println(copiaNumeros);

        // Arrays.copyOfRange(array, from, to)
//        int[] numeros = {1, 2, 3, 4, 5};
//        int[] subArray = Arrays.copyOfRange(numeros, 1, 4);
//
//        System.out.println(Arrays.toString(subArray));
//
//        System.out.println(numeros);
//        System.out.println(subArray);

        // Arrays.deepToString(array)
//        int[][] matriu = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(Arrays.toString(matriu));
//        System.out.println(Arrays.deepToString(matriu));

//        Arrays.clone()
//        int[] numeros = {1, 2, 3};
//        int[] copiaNumeros = numeros.clone();
//        System.out.println(Arrays.toString(copiaNumeros));
//        System.out.println(numeros);
//        System.out.println(copiaNumeros);

        // System.arraycopy(origen, posOrigen, desti, PosDesti, longitud)
//        int[] origen = {1, 2, 3, 4, 5};
//        int[] desti = new int[5];
//        System.arraycopy(origen, 1, desti, 1, 4);
//        System.out.println(Arrays.toString(desti));

        int quantitat = 0;
        String[] noms;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quants noms?");
        quantitat = sc.nextInt();

        // cosa curiosa
        noms = new String[quantitat];

        for (int i = 0; i < noms.length; i++) {
            System.out.println("Nom " + (i + 1) + ": ");
            noms[i] = sc.next();

        }

        System.out.println(Arrays.toString(noms));

        Arrays.sort(noms, (a, b) -> a.length() - b.length());

    }

}