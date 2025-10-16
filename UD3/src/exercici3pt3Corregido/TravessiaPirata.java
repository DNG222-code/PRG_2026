package exercici3pt3Corregido;

public class TravessiaPirata {

    public static void main(String[] args) {

        // Declaración de variables.
        double distancia = 900.0; // Milles nàutiques.
        double velocitat = 20.0; // nusos (milles nàutiques per hora).
        double temps; // distancia / velocitat.

        // Calculem el temps.
        temps = distancia / velocitat;

        // Mostrem el resultat amb dos decimals.
        System.out.println("Per navegar " + distancia + " milles nàutiques a "
                +  velocitat + " nusos, el Programació de DAM tardarà " + temps + " hores.");

    }

}