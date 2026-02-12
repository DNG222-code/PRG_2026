package exercicis.activitat8pt2;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Instanciamos la clase Agenda.
        Agenda ag = new Agenda();

        // Hacemos un comparador para ordenar por nombre.
        Comparator<Agenda> comparaNombre = Comparator.comparing((Agenda a) -> a.nombre);

        // Llamamos al menú principal.
        ag.menu();

    }
}
