package ejercicios.activitat9pt3;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributo.
        List<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a la lista con repeticiónes.
        for (int i = 0; i < 100; i++) {
            aleatorios.add((int) (1 + Math.random() * 10));
        }

        // Mostramos toda la lista de los aleatorios.
        System.out.println("Todos los números: ");
        System.out.print(aleatorios + "\t");
        System.out.println();
        System.out.println();

        // Eliminamos los elementos que valen 5.
        System.out.println("Lista sin 5: ");
        aleatorios.removeIf(n -> n == 5);
        System.out.println(aleatorios); // Mostramos la lista nueva.

    }
}
