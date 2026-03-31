package ejercicios.activitat9pt25;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Declaramos variables.
        Collection<Integer> numsAleatorios = new ArrayList<>();

        // Generamos números aleatorios y lo guardamos en la lista.
        for (int i = 0; i < 30; i++) {
            numsAleatorios.add((int) (1 + Math.random() * 50));
        }

        // Mostramos la colección original.
        System.out.println("Lista original: ");
        System.out.println(numsAleatorios + "\n");

        // Eliminamos todos los números múltiples de 5.
        numsAleatorios.removeIf(n -> n % 5 == 0);

        // Mostramos la colección resultante.
        System.out.println("Lista resultante: ");
        System.out.println(numsAleatorios + "\n");

        // Indicamos cuántos elementos se han eliminado.
        System.out.println("Se han eliminado " + (numsAleatorios.size() - numsAleatorios.size() / 5) + " elementos.");

    }
}
