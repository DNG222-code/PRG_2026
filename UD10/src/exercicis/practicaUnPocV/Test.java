package exercicis.practicaUnPocV;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // Array de enteros.
        Integer[] numEnteros = {1, 5, 7, 2, 10};

        // Array para guardar el resultado de la raiz cuarta.
        Double[] resultado = new Double[numEnteros.length];

        // Recorremos el array de enteros y calculamos la raiz cuarta de cada uno.
        for (int i = 0; i < numEnteros.length; i++) {
            resultado[i] = Calculs.raizN(numEnteros[i].doubleValue(), 4);
        }

        // Mostramos el array con los resultados.
        System.out.println(Arrays.toString(resultado));

    }
}
