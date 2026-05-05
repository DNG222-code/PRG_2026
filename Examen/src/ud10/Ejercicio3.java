package ud10;

import java.util.*;
import java.util.stream.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos una lista para los números.
        List<Integer> lista = new ArrayList<>();

        // Añadimos 50 números a la lista.
        for (int i = 0; i <= 50; i++) {
            lista.add(i);
        }

        // Declaramos un Stream para filtrar por números pares.
        Stream<Integer> pares = lista
                .stream()
                .filter(x -> x % 2 == 0);

        pares.forEach(System.out::println);

        // Sumamos todos los números pares.
        List<Integer> sumaPares = new ArrayList<>();
    }
}
