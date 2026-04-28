package exercicis.activitat10pt6;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Array de clientes.
        Client[] arryClientes = {
                new Client("Juan", "13/02/2005"),
                new Client("Adri", "14/01/2006"),
                new Client("Emilio", "15/05/1987")
        };

        // Ordenamos el array de clientes por nombre.
        Arrays.sort(arryClientes, (c1, c2) -> c1.getNom().compareTo(c2.getNom()));

        // Listamos el array de clientes ordenados.
        for (Client c : arryClientes) {
            System.out.println(c);
        }

    }
}
