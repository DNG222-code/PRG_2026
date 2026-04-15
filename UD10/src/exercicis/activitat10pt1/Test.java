package exercicis.activitat10pt1;

import java.util.function.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Declaramos un array de enteros.
        Integer[] enteros = new Integer[50];

        // Rellenamos con números aleatorios entre 1 y 100.
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int)(Math.random() * 100) + 1;
        }

        // Mostramos el array con los multiplos de 3 que hacemos la condición con el predicado.
        System.out.println(Arrays.toString(multiploTres(enteros, e -> e % 3 == 0)));
    }

    // Método statico obligatorio para sacar el multiplo de 3 del array.
    static <T> T[] multiploTres(T[] array, Predicate<T> predicado) {

        List<T> lista = new ArrayList<>();

        // Condición para añadir a la lista los multiplos de 3 del array.
        for (T e : array) {
            if (predicado.test(e)) {
                lista.add(e);
            }
        }

        // Convertimos List a array del mismo tipo.
        return lista.toArray(Arrays.copyOf(array, lista.size()));
    }
}
