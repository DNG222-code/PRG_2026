package ejercicios.activitat9pt5;

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
            System.out.print("Introduzca un número real o negativo, " +
                    "si introduce un 0 saldrá del bucle: ");
            numeros.add(sc.nextInt());
        } while (!numeros.contains(0));

        System.out.println();

        // Mostramos todos los números de la colección.
        System.out.println("Los números de la colección son: ");
        System.out.println(numeros + "\n");

        // Mostramos cuantos número hay.
        System.out.println("¿Cuantos números hay? ");
        System.out.println(numeros.size() + "\n");

        // Comprobamos si contiene el número 10.
        System.out.println("¿Contiene la Colección el número 10 (true o false)? " + numeros.contains(10));
        System.out.println();

        // Indicamos si la colección está vacia.
        System.out.println("¿La colección está vacia (true o false)? " + numeros.isEmpty() + "\n");

    }
}
