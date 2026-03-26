package ejercicios.activitat9pt19;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(2);
        conjunto1.add(2);
        conjunto1.add(3);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(10);
        conjunto2.add(20);
        conjunto2.add(30);

        System.out.println("Método de unión: " + union(new HashSet<>(conjunto1), new HashSet<>(conjunto2)));
        System.out.println("Método de intersección: " + interseccion(new HashSet<>(conjunto1), new HashSet<>(conjunto2)));
    }

    // Método de unión.
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        conjunto1.addAll(conjunto2);
        return conjunto1;
    }

    // Método de intersección.
    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        conjunto1.retainAll(conjunto2);
        return conjunto1;
    }
}
