package apunts.globals;

import apunts.colecciones.Cliente;

import java.util.*;

public class EjemploClientes2 {

    public static void main(String[] args) {

        // creem les dues llistes
        List<Cliente> llista1 = new ArrayList<>();
        List<Cliente> llista2 = new ArrayList<>();

        llista1.add(new Cliente("111", "Anna", "12/05/1990"));
        llista1.add(new Cliente("222", "Brais", "12/05/1990"));

        llista2.add(new Cliente("200", "Laura", "12/05/1990"));
        llista2.add(new Cliente("201", "Pau", "12/05/1990"));

        // Mètodes globals
        llista1.addAll(llista2); // Lista1 tindra tots els clients
        System.out.println(llista1.containsAll(llista2)); // tots els elements de lista2

        llista1.retainAll(llista2); // mante només els clients de les dues llistes

        llista1.removeAll(llista2); // Elimina els clients de lista 2

        System.out.println(llista1);

    }
}
