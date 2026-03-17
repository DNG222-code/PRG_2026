package ejercicios.activitat9pt6;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributo.
        Collection<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a la lista con repeticiónes.
        for (int i = 0; i < 30; i++) {
            aleatorios.add((int) (1 + Math.random() * 20));
        }

        // Creamos otra colección para los número mayores que 10.
        Collection<Integer> mayoresDeDiez = new ArrayList<>();

        // Guardamos los mayores de 10 en la nueva colección.
        mayoresDeDiez.addAll(aleatorios
                .stream()
                .filter(n -> n > 10)
                .toList());
        System.out.println();

        // Mostramos toda la lista de los aleatorios.
        System.out.println("Todos los números: ");
        System.out.println(aleatorios + "\t");
        System.out.println();

        // Mostramos la nueva colección con los mayores de 10.
        System.out.println("Mayores de 10: ");
        System.out.println(mayoresDeDiez + "\n");

        // Eliminamos los números que están en la segunda colección.
        aleatorios.removeAll(mayoresDeDiez
                .stream()
                .distinct()
                .toList());

        // Mostramos la colección final.
        System.out.println("Colección final: ");
        System.out.println(aleatorios);
    }
}
