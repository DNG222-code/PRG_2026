package exercicis.activitat8pt5;

import java.util.*;

public class Diccionari implements Traductor {

    // Atributos
    Entrada[] entrades;

    // Mètodes del contracte.
    int cercar(String paraula) {
        return 0;
    }

    void afegit(String castella, String catala) {
        // Declarem el scanner.
        Scanner sc = new Scanner(System.in);

        // Demanem a l'usuari que introdueixi una paraula per cada idioma.
        System.out.println("Introdueix una paraula en Castella: " );
        castella = sc.nextLine();

        System.out.println("Introdueix una paraula en Catala: " );
        catala = sc.nextLine();


    }

    void llistar() {

    }

    // Mètode implementat
    @Override
    public String traducir(String paraula) {
        return "";
    }
}
