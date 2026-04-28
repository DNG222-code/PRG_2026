package exercicis.activitat10pt7;

import java.util.*;
import java.util.stream.*;

public class Test {

    public static void main(String[] args) {

        // Creamos una llista para Aleatorios.
        List<Integer> numAleatorios = new ArrayList<>();

        // Generamos números aleatorios.
        for (int i = 0; i < 40; i++) {
            numAleatorios.add((int) (Math.random() * 41) - 20); // 41 porque sino no hace el rango completo.
        }

        // Stream con números positivos sin repetir
        Stream<Integer> positivos = numAleatorios.stream()
                .filter(n -> n > 0)
                .distinct();

        // Stream con números negativos sin repetir
        Stream<Integer> negativos = numAleatorios.stream()
                .filter(n -> n < 0)
                .distinct();

        // Mostrar el número de elementos de cada Stream
        System.out.println("Cantidad de positivos: " + positivos.count());
        System.out.println("Cantidad de negativos: " + negativos.count());

        // Creamos un Stream para los números comprendidos del -10 al 10 sin repeticiones.
        Stream<Integer> numerosComprendidos = numAleatorios.stream()
                .filter(n -> n >= -10 && n <= 10)
                .distinct();

        System.out.println("Numeros Comprendidos: " + numerosComprendidos.count());

    }
}
