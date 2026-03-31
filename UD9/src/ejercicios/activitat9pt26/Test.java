package ejercicios.activitat9pt26;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Declaramos la Colección.
        Collection<Integer> numsAleatorios = new ArrayList<>();

        // Generamos los números aleatorios y los guardamos a la colección.
        for (int i = 0; i < 25; i++) {
            numsAleatorios.add((int) (1 + Math.random() * 20));
        }

        // Creamos una colección con los elementos sin repetir.
        Set<Integer> numsSinRepetir = new HashSet<>(numsAleatorios);

        // Creamos otra con los elementos repetidos.
        Collection<Integer> numsRepetidos = new ArrayList<>(numsAleatorios);

        // Mostramos el conjunto sin repeticiones.
        System.out.print("Conjunto sin repeticiones: " + numsSinRepetir + "\n");

        // Mostramos el conjunto con repeticiones.
        System.out.print("Conjunto con repeticiones: " + numsRepetidos + "\n");

        // Indicamos cuántos elementos hay en cada una.
        System.out.println("Cantidad de elementos en el conjunto sin repeticiones: " + numsSinRepetir.size() + "\n");
        System.out.println("Cantidad de elementos en el conjunto con repeticiones: " + numsRepetidos.size());

    }
}
