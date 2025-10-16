package activitat3pt4Corregido;

import java.util.Scanner;

public class NotaMitja {

    public static void main(String[] args) {

        // Declaració de variables.
        double notaPrimerTrimestre = 0;
        double notaSegonTrimestre = 0;
        double notaTercerTrimestre = 0;
        double mitjanaExpedientAcademic = 0;
        int mitjanaButlleti = 0;

        // Instancia a la classe Scanner per poder recollir dades des del teclat.
        Scanner sc = new Scanner(System.in);

        // Solicitem la nota del primer trimestre.
        System.out.println("Per favor, introdueix la nota del primer trimestre: ");
        notaPrimerTrimestre = sc.nextInt();

        // Solicitem la nota del segon trimestre.
        System.out.println("Per favor, introdueix la nota del segon trimestre: ");
        notaSegonTrimestre = sc.nextInt();

        // Solicitem la nota del tercer trimestre.
        System.out.println("Per favor, introdueix la nota del tercer trimestre: ");
        notaTercerTrimestre = sc.nextInt();

        // Calculem la mitjana amb decimal per l'expedient acadèmic.
        mitjanaExpedientAcademic = (notaPrimerTrimestre + notaSegonTrimestre + notaTercerTrimestre) / 3;

        // Calculem la mitjana pel butlletí.
        mitjanaButlleti = (int) mitjanaExpedientAcademic;

        // Mostrem els resultat.
        System.out.println("La nota mitjana del curs per l'Expedient Acadèmic és: " + mitjanaExpedientAcademic);
        System.out.println("La nota mitjana del curs pel Butlleti és: " + mitjanaButlleti);

    }

}