package ejercicios.activitat9pt15;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributo.
        Scanner sc = new Scanner(System.in);

        int input; // Entrada del usuario.

        // Lista con números enteros.
        List<Integer> numeros = new ArrayList<>();

        // Pedimos al usuario números enteros.
        do {
            System.out.print("Introduzca un número entero o 0 para salir: ");
            input = sc.nextInt();

            // Guardamos los números a la lista.
            numeros.add(input);
        } while (input != 0);

        // Mostramos la lista original.
        System.out.println("Lista original: " + numeros + "\n");

        // Recorremos la lista y multiplicamos los números pares por 2 usando un set().

        for (Integer n : numeros) {
            if (n % 2 == 0) {
                numeros.set(numeros.indexOf(n), n * 2); // Multiplicamos los pares por 2 con el indexOf.
            }
        }

        // Mostramos la lista modificada.
        System.out.println("Lista modificada: " + numeros);

        // Ordenamos la lista de menor a mayor.
        Collections.sort(numeros); // Lo ordenamos con el sort().

        // Mostramos la lista final.
        System.out.println("Lista final: " + numeros);

        // Indicamos la posición del primer y último número repetido.
        int primerNumeroRepetido = 0;

        // Recorremos la lista.
        for (int i = 0; i < numeros.size(); i++) {
            if (Collections.frequency(numeros, numeros.get(i)) > 1) {
                primerNumeroRepetido = numeros.get(i);
            }
        }

        System.out.println("Primer número repetido: " + primerNumeroRepetido);
    }
}
