package activitat4pt13;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] tiradas = new int[20];

        // a) Simular las 20 tiradas y guardarlas en el array
        simularTiradas(tiradas);

        // b) Calcular cuántas veces salió cada número (1 a 6)
        int[] frecuencias = calcularFrecuencias(tiradas);

        // c) Determinar el número más frecuente
        int numeroMasFrecuente = numeroMasFrecuente(frecuencias);

        // d) Mostrar los resultados
        mostrarResultados(tiradas, frecuencias, numeroMasFrecuente);

    }

    // Simula 20 tiradas de un dado (valores entre 1 y 6) y las guarda en el array
    public static void simularTiradas(int[] tiradas) {
        Random random = new Random();

        for (int i = 0; i < tiradas.length; i++) {
            tiradas[i] = random.nextInt(6) + 1; // entre 1 y 6

        }

    }

    // Calcula cuántas veces salió cada número (1 a 6)
    public static int[] calcularFrecuencias(int[] tiradas) {
        int[] frecuencias = new int[6]; // índice 0 -> número 1, índice 5 -> número 6

        for (int tirada : tiradas) {
            frecuencias[tirada - 1]++; // restamos 1 para ajustarlo al índice

        }

        return frecuencias;
    }

    // Determina el número más frecuente (si hay empate, devuelve el menor de ellos)
    public static int numeroMasFrecuente(int[] frecuencias) {
        int maxFrecuencia = frecuencias[0];
        int numero = 1; // empezamos suponiendo que el 1 es el más frecuente

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numero = i + 1; // i=0 -> número 1, i=1 -> número 2, etc.

            }

        }

        return numero;
    }

    // Muestra los resultados como en el ejemplo
    public static void mostrarResultados(int[] tiradas, int[] frecuencias, int numeroMasFrecuente) {
        // Mostrar las tiradas
        System.out.print("Resultados de las tiradas: ");
        for (int i = 0; i < tiradas.length; i++) {
            if (i == tiradas.length - 1) {
                System.out.print(tiradas[i]);

            } else {
                System.out.print(tiradas[i] + ", ");

            }

        }
        System.out.println();

        // Mostrar las frecuencias
        System.out.println("Frecuencia de cada número:");
        for (int i = 0; i < frecuencias.length; i++) {
            int numero = i + 1;
            int veces = frecuencias[i];
            System.out.println(numero + ": " + veces + " veces");

        }

        // Mostrar el número más frecuente
        System.out.println("El número más frecuente es: " + numeroMasFrecuente);

    }

}