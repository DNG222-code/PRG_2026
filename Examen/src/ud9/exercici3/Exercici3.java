package ud9.exercici3;

import java.util.*;

public class Exercici3 {

    public static void main(String[] args) {
        // Declarem una llista de comentaris.
        Map<Integer, String> comentaris = new HashMap<>();

        // Declarem un Scanner.
        Scanner sc = new Scanner(System.in);

        String comentari = "";

        int i;

        // Anem afegint 5 comentaris, per tenir un límit.
        System.out.println("COMENTARIS");
        for (i = 1; i <= 5; i++) {
            System.out.println("Introdueix un comentari: ");
            comentari = sc.nextLine();

            // Afegim els comentaris al Map.
            comentaris.put(i, comentari);
        }

        // Mostrem quants comentaris ha fet cada usuari.
        System.out.println("Comentaris de cada usuari: ");
        System.out.println("Comentaris: ");
        for (Map.Entry c : comentaris.entrySet()) {

            System.out.println("Usuari: " + c.getKey() + " Comentari: " + c.getValue());
        }
    }

}
