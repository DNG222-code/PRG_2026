package exercicis.activitat10pt4;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Lista con números aleatorios.
        List<Integer> numerosAleatorios = new ArrayList<>();

        // Generamos los números aleatorios.
        for (int i = 0; i < 100; i++) {
            numerosAleatorios.add((int) (1 + Math.random() * 1000));
        }

        // Ordenamos de menor a mayor.
        Collections.sort(numerosAleatorios);

        System.out.println("De Menor a mayor: " + "\n");

        // Mostramos los números y si son primos, en cada uno. De forma ordenada.
        for (Integer numero : numerosAleatorios) {
            System.out.println(numero + " " + esPrimo(numero));
        }

        System.out.println();
        System.out.println("De Mayor a menor: " + "\n");

        // Ordenamos de mayor a menor.
        Collections.sort(numerosAleatorios, Collections.reverseOrder());

        // Mostramos los números y si son primos, en cada uno. De forma ordenada.
        for (Integer numero : numerosAleatorios) {
            System.out.println(numero + " " + esPrimo(numero));
        }

        System.out.println();

        // Mostramos los números comprendidos entre 200 y 800.
        System.out.println("Números comprendidos entre 200 y 800: " + "\n");
        numerosAleatorios
                .stream()
                .filter(n -> n >= 200 && n <= 800)
                .forEach(System.out::println);
    }

    // Método obligatorio del ejercicio.
    static boolean esPrimo(Integer n) {

        if (n == null || n < 2) {
            return false;
        }

        // Comprobamos si hay números primos menores que n.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        // En caso contrario, es primo.
        return true;
    }
}
