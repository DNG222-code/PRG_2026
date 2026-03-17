package ejercicios.activitat9pt8;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Collection <Integer> aleatorios1 = new ArrayList<>();
        Collection <Integer> aleatorios2 = new ArrayList<>();

        // Vamos guardando números aleatorios a las dos colecciónes por separado.
        for (int i = 0; i < 20; i++) {
            aleatorios1.add((int) (1 + Math.random() * 20));
            aleatorios2.add((int) (1 + Math.random() * 20));
        }

        // Mostramos ambas colecciónes.
        System.out.println("COLECCIONES: ");

        System.out.println("Colección 1: ");
        System.out.println(aleatorios1 + "\n");

        System.out.println("Colección 2: ");
        System.out.println(aleatorios2 + "\n");

        // Creamos una tercera colección con todos los elementos de ambas colecciones.
        Collection <Integer> todoJunto = new ArrayList<>();

        // Añadimos los elementos de ambas colecciones a la nueva colección.
        todoJunto.addAll(aleatorios1);
        todoJunto.addAll(aleatorios2);

        // Creamos una cuarta colección con los elementos comunes entre ambas colecciones.
        Collection <Integer> comunes = new ArrayList<>();
        comunes.addAll(todoJunto);
        comunes.retainAll(aleatorios1);
        comunes.retainAll(aleatorios2);

        // Eliminamos de la tercera colección los elementos que también aparecen en la cuarta.
        todoJunto.removeAll(comunes);

        // Mostramos todas las colecciones resultantes.
        System.out.println("Colecciones resultantes: ");
        System.out.println(todoJunto);
        System.out.println(comunes);

    }
}
