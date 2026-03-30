package ejercicios.activitat9pt21;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Generamos 2 listas con 15 números aleatorios entre 1 y 20.

        // Declaramos las listas.
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        // Añadimos los números aleatorios a las listas.
        for (int i = 0; i < 15; i++) {
            lista1.add((int) (1 + Math.random() * 20));
            lista2.add((int) (1 + Math.random() * 20));
        }

        // Convertimos ambas listas en Set.
        Set<Integer> set1 = new HashSet<>(lista1);
        Set<Integer> set2 = new HashSet<>(lista2);

        // Mostramos los elementos comunes entre ambos conjuntos.
        Set<Integer> comunes = new HashSet<>(set1);
        comunes.retainAll(set2);
        System.out.println("Elementos comunes: " + comunes + "\n");

        // Mostramos los elementos que solo están en el primer conjunto.
        Set<Integer> soloEnSet1 = new HashSet<>(set1);
        soloEnSet1.removeAll(set2);
        System.out.println("Elementos que solo están en el primer conjunto: " + soloEnSet1 + "\n");

        // Mostramos los elementos que solo están en el segundo conjunto.
        Set<Integer> soloEnSet2 = new HashSet<>(set2);
        soloEnSet2.removeAll(set1);
        System.out.println("Elementos que solo están en el segundo conjunto: " + soloEnSet2 + "\n");

        // Indicamos si ambos conjuntos son iguales.
        System.out.println("Ambos conjuntos son iguales? (true/false) " + set1.equals(set2));
    }
}
