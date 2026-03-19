package ejercicios.activitat9pt9;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Collection<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a las dos colecciónes por separado.
        for (int i = 0; i < 50; i++) {
            aleatorios.add((int) (1 + Math.random() * 30));
        }

        // Mostrar la colección original.
        System.out.println("COLECCION ORIGINAL: ");
        System.out.println(aleatorios);
        System.out.println();

        // Colección para números pares.
        Collection<Integer> pares = new ArrayList<>();

        pares.addAll(aleatorios.stream()
        .filter(n -> n % 2 == 0)
        .toList());

        // Colección para los números multiples de cinco.
        Collection<Integer> multiplosDeCinco = new ArrayList<>();

        multiplosDeCinco.addAll(aleatorios
                .stream()
                .filter(n -> n % 5 == 0)
                .toList());

        // Comprobamos si los multiplos de 5 están en la colección de números pares.
        pares.retainAll(multiplosDeCinco);

        // Eliminamos de la colección original todos los números que aparecen en la colección de
        // múltiplos de 5.
        aleatorios.removeAll(multiplosDeCinco);

        // Mostramos la coleccion final y cuantos números contiene.
        System.out.println("Coleccion: " + aleatorios);
        System.out.println("¿Cuantos número tiene? " + aleatorios.size());

    }
}
