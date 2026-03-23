package ejercicios.activitat9pt14;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        List<Integer> aleatorios = new ArrayList<>();

        // Generamos los números aleatorios y lo añadimos en la lista.
        for(int i = 1; i < 40; i++) {
            aleatorios.add((int) (1 + Math.random() * 25));
        }

        // Mostramos la lista original.
        System.out.println("Lista original: ");
        System.out.println(aleatorios);
        System.out.println();

        // Convertimos la lista a un Array con el toArray().
        Integer[] array = aleatorios.toArray(new Integer[0]);

        // Ordenamos el Array de menor a mayor con el sort().
        Arrays.sort(array);

        // Volvemos a convertir el Array a una Colección con el Arrays.asList().
        Collection<Integer> nuevaLista = Arrays.asList(array);

        // Creamos una nueva colección con los números mayores que 20.
        Collection<Integer> mayoresDeVeinte = nuevaLista.stream()
                .filter(n -> n > 20)
                .toList();

        // Comprobamos si todos los elementos están dentro de la colección original.
        // Con el retainAll().
        aleatorios.retainAll(mayoresDeVeinte);

        // Mostramos todas las colecciónes.
        System.out.println("Colecciones resultantes: ");
        System.out.println("Aleatorios: " + aleatorios);
        System.out.println("Mayores de 20: " + mayoresDeVeinte);

    }
}
