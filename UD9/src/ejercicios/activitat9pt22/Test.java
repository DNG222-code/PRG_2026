package ejercicios.activitat9pt22;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Generamos una lista con 20 números enteros aleatorios entre 1 y 30.

        // Declaramos la lista.
        List<Integer> listaAleatorios = new ArrayList<>();

        // Guardamos los números aleatorios en la lista.
        for (int i = 0; i < 20; i++) {
            listaAleatorios.add((int) (1 + Math.random() * 30));
        }

        // Convertimos la lista en un Set para eliminar duplicados.
        Set<Integer> setAleatorios = new HashSet<>(listaAleatorios);

        // Mostramos el set.
        System.out.println("Lista a Set: " + setAleatorios + "\n");

        // Convertimos el conjunto en un TreeSet para ordenar-los elementos.
        Set<Integer> setOrdenado = new TreeSet<>(setAleatorios);
        System.out.println("Set ordenado: " + setOrdenado + "\n");

        // Volvemos a convertirlo en una lista.
        List<Integer> listaOrdenada = new ArrayList<>(setOrdenado);
        System.out.println("Set ordenado en lista: " + listaOrdenada + "\n");

        // Mostramos la lista final ordenada.
        System.out.println("Lista ordenada: " + listaOrdenada + "\n");

        // Convertimos la lista en un array para mostrarla.
        Integer[] array = listaOrdenada.toArray(new Integer[0]);
        System.out.println("Lista ordenada en array: " + Arrays.toString(array));

    }
}
