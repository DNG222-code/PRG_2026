package corregits.diccionari;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Diccionari diccionari;
        String nomFitxer = "diccionari.dat";
        int opcio;

        diccionari = FitxerDiccionari.carregar(nomFitxer);

        do {
            menu();

            opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
                case 1 -> traduir(diccionari);
                case 2 -> afegir();
                case 3 -> diccionari.llistar();
            }

        } while (opcio != 4);

        FitxerDiccionari.guardar(diccionari, nomFitxer);

        sc.close();

    }

    private static void menu() {
        System.out.println("\n1 - Traduir paraula");
        System.out.println("2 - Afegir paraula");
        System.out.println("3 - Llista diccionari");
        System.out.println("4 - Sortir");

    }

    private static void traduir(Diccionari diccionari) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix la paraula en Castella: ");
        String castella = sc.nextLine();

        String traduccio = diccionari.traduir(castella);

        System.out.println("Introdueix la paraula en Catala: ");

    }

    private static void afegir() {}
}
