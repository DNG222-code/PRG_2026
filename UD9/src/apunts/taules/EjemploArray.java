package apunts.taules;

import java.util.*;

public class EjemploArray {

    public static void main(String[] args) {

        // Métodes de taula

        Collection<String> nombres = new ArrayList<>();

        nombres.add("Anna");
        nombres.add("Marc");
        nombres.add("Anna");

        System.out.println("Collectió: " + nombres);

        // La convertim en un array d'object (despres s'ha de fer un cast)
        Object[] t1 = nombres.toArray();

        // La convertim en un array de string (no s'ha de fer un cast)
        String[] t2 = nombres.toArray(new String[0]);

        Integer[] tabla = {1, 2, 3, 4, 5, 6};

        // Creem una col. buida

        Collection<Integer> lista = new ArrayList<>();

        lista.addAll(Arrays.asList(tabla)); // A partir d'una taula cerar una llista

        // Mostrem resultats
        System.out.println("Primer element de l'array: ");
        System.out.println(t1[0]); // object
        System.out.println(t2[0]); // string

        System.out.println("Creada a partir de l'array: " + lista);

    }
}
