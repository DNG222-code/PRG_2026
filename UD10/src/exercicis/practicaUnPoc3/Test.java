package exercicis.practicaUnPoc3;

import java.util.*;

public class Test<T> {

    public static void main(String[] args) {

        Client[] grupClients = {
                new Client("Joan", 25),
                new Client("Josep", 32),
                new Client("Maria", 28),
                new Client("Ana", 22)
        };

        System.out.println();

    }

    public static <T> void maximo(T[] array, Comparator<T> comparador) {
        Comparator<Client> comparadorEdad =
                (c1, c2) -> Integer.compare(c1.getEdat(), c2.getEdat());

        System.out.println("El cliente con mayor edad, es: ");
    }
}
