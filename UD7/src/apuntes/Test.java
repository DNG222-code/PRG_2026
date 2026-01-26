package apuntes;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Persona[] persones = {
            new Persona("Anna", 25, "11111111A"),
            new Persona("Josep", 32, "22222222B"),
            new Persona("Joan", 27, "22222222B"),
        };

        // COMPARABLE
//        System.out.println(Arrays.toString(persones));
//        Arrays.sort(persones);
//        System.out.println(Arrays.toString(persones));

        // COMPARATOR
//        Comparator<Persona> compEdat = new ComparadorPerEdat();
//
//        System.out.println(Arrays.toString(persones));
//        Arrays.sort(persones, compEdat);
//        System.out.println(Arrays.toString(persones));

        Comparator<Persona> comparador = new ComparadorPerEdat();
    }
}
