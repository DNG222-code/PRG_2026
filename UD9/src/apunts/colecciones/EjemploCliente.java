package apunts.colecciones;

import java.util.*;

public class EjemploCliente {

    public static void main(String[] args) {

        List<Cliente> lista1 = new ArrayList<>();
        Cliente Cliente = new Cliente("111", "Anna", "12/05/1990");

        // Mètodes bàsics
        lista1.add(Cliente); // Afegir elements
        lista1.remove(Cliente); // Esborrar elements

        lista1.add(new Cliente("222", "Brais", "12/05/1990"));
        lista1.add(new Cliente("333", "David", "12/05/1990"));
        lista1.add(new Cliente("444", "Anna", "12/05/1990"));

        System.out.println(lista1);
        // Comprova si un element existeix
        System.out.println(lista1.contains(new Cliente("444", "Anna", "12/05/1990")));
        System.out.println(lista1.isEmpty()); // Ens diu si està buit o no.
        System.out.println(lista1.size()); // retorna el número d'elements.

    }
}
