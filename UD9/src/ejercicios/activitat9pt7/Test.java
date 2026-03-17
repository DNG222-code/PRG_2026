package ejercicios.activitat9pt7;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributo.
        Collection<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a la colección.
        for (int i = 0; i < 25; i++) {
            aleatorios.add((int) (1 + Math.random() * 15));
        }

        // Creamos una colección para los números que aparecen más de una vez
        Collection<Integer> masDeUnaVez = new ArrayList<>();

        // Comprobamos si se repiten más de una vez los números.
        masDeUnaVez.addAll(aleatorios
                .stream()
                .filter(n -> aleatorios
                        .stream()
                        .filter(m -> m == n)
                        .count() > 1)
                .distinct()
                .toList());

        // Creamos otra colección para los números que aparecen una vez.
        Collection<Integer> unaVez = new ArrayList<>();

        // Comprobamos si solo se repiten una sola vez.
        unaVez.addAll(aleatorios
                .stream()
                        .filter(n -> aleatorios
                            .stream()
                            .filter(m -> m == n)
                            .count() == 1)
                        .distinct()
                        .toList());

        // Mostramos las 3 colecciónes con el resultado final.
        System.out.println("Todos los números aleatorios: ");
        System.out.println(aleatorios);
        System.out.println();

        System.out.println("Números que se repiten más de una vez: ");
        System.out.println(masDeUnaVez);
        System.out.println();

        System.out.println("Número que se repiten una vez: ");
        System.out.println(unaVez);

    }
}
