package exercicis.activitat10pt5;

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

        List<Integer> numerosPrimosMenorAMayor = new ArrayList<>();

        Integer[] numerosPrimosMenorAMayorArray = new Integer[numerosAleatorios.size()];

        // Guardamos los números primos en una lista.
        for (Integer numero : numerosAleatorios) {
            if (esPrimo(numero)) {
                numerosPrimosMenorAMayor.add(numero);
            }
        }

        System.out.println("De Menor a mayor. Guardado en una lista. ");

        // Convertimos List a array del mismo tipo.
        numerosPrimosMenorAMayorArray = numerosPrimosMenorAMayor.toArray(numerosPrimosMenorAMayorArray);

        System.out.println("De menor a mayor guardados en un array. ");
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
