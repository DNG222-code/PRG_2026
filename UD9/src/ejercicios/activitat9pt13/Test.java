package ejercicios.activitat9pt13;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Scanner sc = new Scanner(System.in);

        int negativo;

        // Lista de números.
        List<Integer> numeros = new ArrayList<>();

        // Pedimos al usuario números enteros.
        // Si el usuario introduce un número negativo se saldrá del bucle.
        do {
            System.out.print("Introduzca un número entero, " +
                    "si introduce un negativo saldrá del bucle: ");
            negativo = sc.nextInt();

            if (negativo < 0) {
                numeros.add(sc.nextInt());
            }
        } while (!numeros.contains(negativo));

        System.out.println();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.set(i, numeros.get(i) * 100);

            }
            System.out.println("Indices: " + numeros.get(i) + "\n");
        }

        System.out.println();

        // Mostrar la lista final.
        System.out.println("Lista final: ");
        System.out.println(numeros);

    }
}
