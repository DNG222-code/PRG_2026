package apunts.set;

import java.util.*;

public class ExConversions {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println("Llista original: " + list);

        // De llista a Set (elimina els duplicats)
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set (sense repetits): " + set);

        // De Set a llista (recuperam l'index)
        List<Integer> llista2 = new ArrayList<>(set);
        System.out.println("Set convertit a llista: " + llista2);

        // De llista a Array
        Integer[] array = llista2.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array));

        // D'array a llista
        List<Integer> llista3 = Arrays.asList(array);
        System.out.println("Array convertit a llista: " + llista3);

    }
}
