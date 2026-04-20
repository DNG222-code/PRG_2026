package exercicis.activitat10pt3;

import java.util.function.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Creamos un array con varios clientes.
        Cliente[] grupClients = {
                new Cliente("Brais"),
                new Cliente("Juan"),
                new Cliente("Emilio"),
        };

        // Creamos un Consumer que imprime el nombre del cliente.
        Consumer<Cliente> c = System.out::println;

        paraCada(grupClients, c);
    }

    // Método obligatorio del ejercicio.
    static <T> void paraCada(T[] arrayP, Consumer<T> c) {
        for(T t : arrayP) {
            c.accept(t);
        }
    }
}
