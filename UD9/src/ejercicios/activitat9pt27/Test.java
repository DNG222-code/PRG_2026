package ejercicios.activitat9pt27;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Declaramos las 2 colecciones.
        Collection<Integer> numsAleatorios1 = new ArrayList<>();
        Collection<Integer> numsAleatorios2 = new ArrayList<>();

        // Generamos los números aleatorios y los guardamos en las 2 colecciones.
        for (int i = 0; i < 20; i++) {
            numsAleatorios1.add((int) (1 + Math.random() * 30));
            numsAleatorios2.add((int) (1 + Math.random() * 30));
        }

        // Mostramos ambas colecciones.
        System.out.println("COLECCION 1: ");
        System.out.println(numsAleatorios1 + "\n");

        System.out.println("COLECCION 2: ");
        System.out.println(numsAleatorios2 + "\n");

        // Creamos una colección con la unión de las dos.
        Collection<Integer> union = new ArrayList<>(numsAleatorios1);
        union.addAll(numsAleatorios2);

        // Mostramos la union de las 2 colecciones.
        System.out.println("UNION: ");
        System.out.println(union + "\n");

        // Creamos otra con los elementos comunes.
        Collection<Integer> comunes = new ArrayList<>(numsAleatorios1);
        comunes.retainAll(numsAleatorios2);

        // Mostramos los elementos comunes.
        System.out.println("ELEMENTOS COMUNES: ");
        System.out.println(comunes + "\n");

        // Creamos otra con los elementos que están sólo en la primera colección.
        Collection<Integer> soloEn1 = new ArrayList<>(numsAleatorios1);
        soloEn1.removeAll(numsAleatorios2);

        // Mostramos solo las que están en la primera.
        System.out.println("SOLO LA PRIMERA: ");
        System.out.println(soloEn1 + "\n");

    }
}
