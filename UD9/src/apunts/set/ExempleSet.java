package apunts.set;

import java.util.*;

public class ExempleSet {

    public static void main(String[] args) {

        // HasSet (no mante un ordre, elimina els duplicats)
        Set<String> set = new HashSet<>();

        System.out.println("Afegim els elements: ");

        System.out.println(set.add("Anna"));
        System.out.println(set.add("Marc"));
        System.out.println(set.add("Anna"));

        System.out.println("Set: " + set);

        // conteins()
        System.out.println("Conté Anna" + set.contains("Anna"));

        // remove()
        System.out.println("Eliminem el Marc " + set.remove("Marc"));

        // size()
        System.out.println("Nombre d'elements: " + set.size());

        // Diferècia entre implementacions

        // HashSet

        // LinkedHashSet (manté un ordre d'insercció)
        Set <Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(3);
        linkedSet.add(2);
        linkedSet.add(1);
        System.out.println("LinkedHashSet: " + linkedSet);

        // TreeSet (ordenat)
        Set <Integer> treeSet = new TreeSet<>();
        linkedSet.add(3);
        linkedSet.add(2);
        linkedSet.add(1);
        System.out.println("TreeSet: " + treeSet);

    }
}
