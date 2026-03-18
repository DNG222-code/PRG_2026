package ejercicios.activitat9pt10;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Scanner sc = new Scanner(System.in);

        // Lista de números.
        Collection<Integer> numeros = new ArrayList<>();

        // Pedimos al usuario números enteros.
        // Si el usuario introduce un 0 se saldrá del bucle.
        do {
            System.out.print("Introduzca un número entero, " +
                    "si introduce un 0 saldrá del bucle: ");
            numeros.add(sc.nextInt());
        } while (!numeros.contains(0));

        System.out.println();

    }
}
