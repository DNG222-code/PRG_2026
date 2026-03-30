package ejercicios.activitat9pt23;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Sorteo<Integer> sorteo = new Sorteo<>();

        sorteo.add(10);
        sorteo.add(20);
        sorteo.add(30);
        sorteo.add(40);
        sorteo.add(50);

        Set<Integer> ganadores = sorteo.premiados(3);

        System.out.println("Premiados: " + ganadores);
    }

}
