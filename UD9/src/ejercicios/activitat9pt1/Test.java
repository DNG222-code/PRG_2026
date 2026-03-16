package ejercicios.activitat9pt1;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Scanner sc = new Scanner(System.in);

        // Lista de números.
        List<Integer> numeros = new ArrayList<>();

        // Pedimos al usuario número entero no negativos.
        // Si el usuario introduce un -1 se saldrá del bucle.
        do {
            System.out.print("Introduzca otro número entro, " +
                    "si introduce un -1 saldrá del bucle: ");
            numeros.add(sc.nextInt());
        } while (!numeros.contains(-1));

        // Mostramos al usuario la lista de los número introducidos.
        System.out.println(numeros + "\n");

        // Mostramos solo los valores pares al usuario.
        System.out.println(numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList());

        // Eliminamos los múltiplos de 3 de la lista.
        numeros.removeIf(n -> n % 3 == 0);

        // Mostramos el resultado por pantalla.
        System.out.println(numeros + "\n");

    }
}
