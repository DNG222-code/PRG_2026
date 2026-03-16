package ejercicios.activitat9pt2;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributo.
        List<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a la lista con repeticiónes.
        for (int i = 0; i < 20; i++) {
            aleatorios.add((int) (1 + Math.random() * 10));
        }

        // Mostramos la lista de los aleatorios.
        System.out.print(aleatorios + "\t");
        System.out.println();

        // Mostramos los números aleatorios sin repeticiónes.
        System.out.println(aleatorios.stream()
                .distinct()
                .toList());
    }
}
