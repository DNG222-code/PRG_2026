package corregits.practicaUnPoc3;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Client[] grupClients = {
                new Client("Joan", 25),
                new Client("Josep", 32),
                new Client("Maria", 28),
                new Client("Ana", 22)
        };

        System.out.println(maxim(grupClients, (c1, c2) -> c1.getEdat() - c2.getEdat()));

    }

    static <T> T maxim(T[] elements, Comparator<T> c) {

        T max = elements[0];

        for (T e : elements) {
            if (c.compare(e, max) > 0) {
                max = e;
            }
        }

        return max;
    }
}
