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

        // Mostramos la colección original.
        System.out.println("Mostramos la colección original: " + numeros + "\n");

        // Creamos otra colección con número positivos.
        Collection<Integer> numsPositivos = numeros.stream()
                .filter(n -> n > 0)
                .toList();

        // Creamos otra colección con números negativos.
        Collection<Integer> numsNegativos = numeros.stream()
                .filter(n -> n < 0)
                .toList();

        // Creamos una colección con números pares.
        Collection<Integer> numsPares = numeros.stream()
                .filter(n -> n % 2  == 0)
                .toList();

        // Comprobamos si todos los números negativos se encuentran en la colección original.
        numeros.retainAll(numsNegativos);

        // Creamos una nueva colección que sea la unión de números positivos y pares.
        Collection<Integer> numsPositivosPares = new ArrayList<>();
        numsPositivosPares.addAll(numsPositivos);
        numsPositivosPares.addAll(numsPares);

        // Eliminamos de esta colección todos los elementos que también aparecen en la
        // colección de números negativos.
        numsPositivosPares.removeAll(numsNegativos);

        // Mostramos la colección final y su número de elementos.
        System.out.println("Colección final: ");
        System.out.println(numsPositivosPares + "\n" + "\n" + "¿Cuantos números hay? " + numsPositivosPares.size());

    }
}
