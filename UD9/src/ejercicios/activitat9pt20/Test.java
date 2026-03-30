package ejercicios.activitat9pt20;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Declaramos variables.
        List<Integer> numsAleatorios = new ArrayList<>();

        // Vamos añadiendo 25 números aleatorios a la lista.
        for (int i = 0; i < 25; i++) {
            numsAleatorios.add((int) (1 + Math.random() * 15));
        }

        // Mostramos la lista original.
        System.out.println("Lista original: ");
        System.out.println(numsAleatorios + "\n");

        // Convertimos en un LinkedHashSet para eliminar duplicados manteniendo el orden.
        Set<Integer> numsSinDuplicados = new LinkedHashSet<>(numsAleatorios);

        // Mostramos la lista sin duplicados.
        System.out.println("Lista sin duplicados: ");
        System.out.println(numsSinDuplicados + "\n");

        // Volvemos a convertir la lista en una lista normal.
        List<Integer> numsNormal = new ArrayList<>(numsSinDuplicados);

        // Mostramos la lista normal.
        System.out.println("Lista normal: ");
        System.out.println(numsNormal + "\n");

        // Indicamos cuántos elementos se han eliminado.
        System.out.println("Se han eliminado " + (numsAleatorios.size() - numsSinDuplicados.size()) + " elementos.");
    }
}
