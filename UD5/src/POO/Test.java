package POO;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int x = 3;
        int[] arrP = {1, 2, 3, 4};
        int posicio = 1;

//        System.out.println("Valor de \"" + posicio + "\" abans de la funció: " + arrP[1]);
//        pasoPorValor(arrP, posicio);
//        System.out.println("Valor de \"" + posicio + "\" després de la funció: " + arrP[1]);

//        System.out.println("Valor de \"x\" abans de la funció: " + x);
//
//        pasoPorValor(x);
//
//        System.out.println("Valor de \"x\" després de la funció: " + x);

//        Arrays.copyOf(arrN, 3);

        Persona p = new Persona("Joan");

//        System.out.println("Peso de persona: " + p.getPes());
//        System.out.println("Referencia de persona: " + p);

    }

    public static void pasoPorValor(Persona p) {
        Persona p2 = new Persona("Núria");

        p = p2;

    }

    public static void pasoPorValor(int p) {
        p = 10;

    }

    public static void pasoPorValor(int[] ps, int posicio) {
        int[] arrN = {7, 8, 9};
        ps[posicio] = arrN[posicio];

    }

}