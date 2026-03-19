package ejercicios.activitat9pt12;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        List<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a la colección.
        for (int i = 0; i < 20; i++) {
            aleatorios.add((int) (1 + Math.random() * 30));
        }

        // Mostramos la colección original.
        System.out.println("COLECCION ORIGINAL: ");
        System.out.println(aleatorios + "\n");

        // Ordenaremos la colección de menor a mayor.
        Collections.sort(aleatorios);

        // Mostramos la collección ordenada.
        System.out.println("COLECCION ORDENADA (menor a mayor): ");
        System.out.println(aleatorios + "\n");

        // Ordenaremos la colección de mayor a menor.
        Collections.sort(aleatorios, Collections.reverseOrder());

        // Mostramos la colección ordenada.
        System.out.println("COLECCION ORDENADA (mayor a menor): ");
        System.out.println(aleatorios + "\n");

    }
}
