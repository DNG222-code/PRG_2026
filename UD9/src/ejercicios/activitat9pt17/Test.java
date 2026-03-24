package ejercicios.activitat9pt17;

import java.util.*;
import java.util.stream.*;

public class Test {

    public static void main(String[] args) {


        // Atributos.
        List<Integer> lista = new ArrayList<>();

        // Generamos los números aleatorios y lo añadimos en la lista.
        for(int i = 0; i < 20; i++) {
            lista.add((int) (1 + Math.random() * 10));
        }

        // Mostramos la lista original.
        System.out.println("Lista original: ");
        System.out.println(lista);
        System.out.println();

        // 1. Sin repetir
        Set<Integer> sinRepetir = new HashSet<>(lista);

        // 2. Repetidos
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        for (Integer n : lista) {
            if (!vistos.add(n)) {
                repetidos.add(n);
            }
        }

        // 3. Los que aparecen una sola vez
        Set<Integer> unaSolaVez = lista.stream()
                .filter(n -> Collections.frequency(lista, n) == 1)
                .collect(Collectors.toSet());

        System.out.println("Sin repetir: " + sinRepetir);
        System.out.println("Repetidos: " + repetidos);
        System.out.println("Una sola vez: " + unaSolaVez);

    }
}
