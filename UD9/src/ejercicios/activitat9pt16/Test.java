package ejercicios.activitat9pt16;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        List<Integer> aleatorios = new ArrayList<>();

        // Generamos los números aleatorios y lo añadimos en la lista.
        for(int i = 0; i < 20; i++) {
            aleatorios.add((int) (1 + Math.random() * 30));
        }

        // Mostramos la lista original.
        System.out.println("Lista original: ");
        System.out.println(aleatorios);
        System.out.println();

        // Creamos otra lista con los números pares.
        List<Integer> pares = aleatorios.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        // Creamos otra lista con los números múltiplos de 3.
        List<Integer> multiplosTres = aleatorios.stream()
                .filter(n -> n % 3 == 0)
                .toList();

        // Creamos una nueva lista con la unión de ambas.
        List<Integer> union = new ArrayList<>(pares);
        union.addAll(multiplosTres);

        // Eliminamos de esta lista todos los elementos que también aparecen en la lista de
        // múltiplos de 3.
        union.removeAll(multiplosTres);

        // Ordenamos la lista resultante de menor a mayor.
        Collections.sort(union);

        // Convertimos en Array y mostramos el primer y último elemento.
        union.toArray(new Integer[0]);

        // Guardamos el primer y ultimo elemento del Array.
        int primerElemento = union.get(0);
        int ultimoElemento = union.get(union.size() - 1);

        // Mostramos el primer y último elemento del Array.
        System.out.println("Primer elemento: " + primerElemento
                + "\n" + "Ultimo elemento: " + ultimoElemento);

    }
}
