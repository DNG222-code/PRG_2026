package ejercicios.activitat9pt17;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        List<Integer> aleatorios = new ArrayList<>();

        // Conjuntos (Set's).
        Set<Integer> aleatoriosSet = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        // Generamos los números aleatorios y lo añadimos en la lista.
        for(int i = 0; i < 20; i++) {
            aleatorios.add((int) (1 + Math.random() * 10));
        }

        // Mostramos la lista original.
        System.out.println("Lista original: ");
        System.out.println(aleatorios);
        System.out.println();

        // Lista sin repeticiones.
        System.out.println("Lista sin repeticiones: ");
        aleatoriosSet.addAll(aleatorios);
        System.out.println(aleatoriosSet + "\n");

        // Elementos repetidos de la Lista.
        aleatorios.stream()
                .filter(n -> aleatorios.contains(n))
                .toList();
        System.out.println("Elementos repetidos: " + "\n" + aleatorios + "\n");

        // Elementos que aparecen una sola vez en la lista original.
        aleatorios.stream()
                .filter(n -> aleatorios.stream().filter(m -> m == n).count() == 1)
                .toList();
        System.out.println("Elementos que aparecen una sola vez: " + "\n" + aleatorios + "\n");

    }
}
