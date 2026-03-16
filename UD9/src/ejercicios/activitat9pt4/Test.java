package ejercicios.activitat9pt4;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Scanner sc = new Scanner(System.in);

        // Lista de números.
        List<Integer> numeros = new ArrayList<>();

        // Pedimos al usuario números.
        // Si el usuario introduce un 0 se saldrá del bucle.
        do {
            System.out.print("Introduzca un número real o negativo, " +
                    "si introduce un 0 saldrá del bucle: ");
            numeros.add(sc.nextInt());
        } while (!numeros.contains(0));

        System.out.println();

        // Guardamos los números reales en otra lista.
        List<Integer> numerosReales = new ArrayList<>();

        numerosReales.addAll(numeros.stream()
                .filter(n -> n >= 0)
                .toList());

        // Guardamos los números negativos en otra lista.
        List<Integer> numerosNegativos = new ArrayList<>();

        numerosNegativos.addAll(numeros
                .stream()
                .filter(n -> n < 0)
                .toList());

        // Mostramos las 2 listas.
        System.out.println("Lista Reales: " + numerosReales);
        System.out.println("Lista Negativos: " + numerosNegativos + "\n");

        // Calculamos la suma de los elementos de cada una.
        double sumaReales = 0; // Variable para almacenar la suma de la lista de reales.

        for (Integer n : numerosReales) {
            sumaReales += n;
        }

        // Mostramos la suma de la Lista de reales.
        System.out.println("Suma de los número reales: " + sumaReales);

        // Calculamos la suma de los elementos de cada una.
        double sumaNegativos = 0; // Variable para almacenar la suma de la lista de reales.

        for (Integer n : numerosNegativos) {
            sumaNegativos += n;
        }

        // Mostramos la suma de la Lista de negativos.
        System.out.println("Suma de los números negativos: " + sumaNegativos);

        // Eliminamos los valores mayores a 10 o menores que -10 de ambas listas.
        numerosReales.removeIf(n -> n > 10);
        numerosNegativos.removeIf(n -> n < -10);

        System.out.println();

        // Mostramos el resultado final de las dos listas por pantalla.
        System.out.println("Lista Reales: " + numerosReales);
        System.out.println("Lista Negativos: " + numerosNegativos);

    }
}
