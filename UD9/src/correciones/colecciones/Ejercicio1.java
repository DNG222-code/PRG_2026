package correciones.colecciones;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();

        System.out.println("Introducir entero: ");

        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        while (n != 1) {
            if (n >= 0) {
                numeros.add(n);
            } else {
                System.out.println("Número no valido");
            }
            System.out.println("Introducir entero: ");
            n = sc.nextInt();
        }

        // volem veure tots els numeros introduits
        System.out.println("Lista completa: " + numeros);

        System.out.println("Pares: ");

        // recorrem la llista amb un for-each
        for (Integer a : numeros) {
            if (a % 2 == 0) {
                System.out.println(a + ""); // si és par el mostrem
            }
        }

        System.out.println();

        // Creem un iterador
        Iterator<Integer> it = numeros.iterator();

        for (; it.hasNext();) { // recorrer la col·lecció
            n = it.next();

            if (n % 3 == 0) { // si és múltiple de 3
                it.remove(); // eliminar.
            }
        }

        System.out.println("No multiplo de 3: " + numeros);

        sc.close();

    }
}
