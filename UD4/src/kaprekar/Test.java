package kaprekar;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // Declaració de variables
        int num = 0; // Número que demanem a l'usuari.
        int pasos = 0; // Passos que s'han necessitat.
        final int NUMERO_KAPREKAR = 6174;
        final int MAXIM_ITERACIONS = 7;

        // Demanar i capturarel número.
        num = demanarNumero();

        // Continuem demanant el número fins que siguí vàlid.
        while (validaNumero(num) != 0) {
            // Demanar i capturarel número.
            num = demanarNumero();

        }

        // Iterem fins trobar el número Kaprekar.
        // sobrepassar els passos màxims.
//        formataAQuatreXifres();

    }

    // Demanar un número a l'usuari.
    private static int demanarNumero() {
        // Creem un sacnner per interactuar amb l'usuari.
        Scanner sc = new Scanner(System.in);
        // Demanem el número...
        System.out.println("Introdueix un número tal que:" +
                "\n -Sigui un número de 4 xifres. " +
                "\n -Almenys dues de les seves xifres siguin diferents.\n ");
        // El retronem...
        return sc.nextInt();

    }

    // Valida si un número compleix les cundicions per ser un número de Kaprekar.
    // Sortides:
    //      - 0: Correcte.
    //      - 1: No té 4 xifres.
    //      - 2: No té almenys dues xifres diferents.
    private static int validaNumero(int numero) {
        // Variable auxiliar per comptar les vegades
        // que es repeteix un número.
        int mateixNumero = 0;
        // Versió cadena del número rebut per parámetre.
        String numeroString = "";

        // Convertim un número en un String
        numeroString = numero + "";

        // Validem que sigui de 4 xifres.
        if (numeroString.length() != 4) {
            System.out.println("El número introduït no té 4 xifres!\n");

            return 1;

        }

        // Comprovem que almenys té dues xifres diferents.
        // Recorrem la cadena per detectar si algún caràcter
        // (dígit) apareix 3 vegades.

        for (int i = 0; i < numeroString.length(); i++) {
            mateixNumero = 0;
            // Comparem el caràcter actual amb tots els que venen després.
            for (int j = i + 1; j < numeroString.length(); j++) {
                // Si troba un altre caràcter igual, incrementem el comptador.
                if (numeroString.charAt(i) == numeroString.charAt(j)) {
                    mateixNumero++;

                }

            }
            // Si el mateix número es repeteix almenys 2 vegades més
            // (en total 3 aparicions comptant la primera),
            // interrumpim el bucle extern.
            if (mateixNumero >= 2) {
                break;

            }

        }
        // Retornem el resultat de la comparació.
        if (mateixNumero >= 2) {
            System.out.println("El número no te almenys 2 xifres diferents!\n");
            return 2;

        }
        // Tot ha anat bé.
        return 0;

    }

    private static int operacioKaprekar(int numero) {

        // Declaració de variables
        String numeroString = ""; // Versió cadena del número.
        String numeroMenorAMajorString = "";
        String numeroMajorAMenorString = "";
        int numeroMenorAMajor = 0;
        int numeroMajorAMenor = 0;

        // Convertim el número en cadena.
        numeroString = numero + "";

        // Ordenem el número de menor a major i el guardem.

        // Ordenem el número de major a menor i el guardem.

        return 0;

    }

    // Ordena un número (expressat com a cadena) de menor a major
    // o de major a menor.
    private static String ordenaNumero(String numero, boolean menorAMajor) {

        // Declaració de variables.
        String maximNumero = "";
        String max1 = "";
        String max2 = "";
        String max3 = "";
        String max4 = "";

        max1 = maxim(numero);
//        System.out.println(max1);
        numero = numero.replaceFirst(max1, "");

        max2 = maxim(numero);
        numero = numero.replaceFirst(max2, "");

        max3 = maxim(numero);
        numero = numero.replaceFirst(max3, "");

        max4 = maxim(numero);
        numero = numero.replaceFirst(max4, "");

        return menorAMajor ? (max4 + max3 + max2 + max1) + "" : (max1 + max2 + max3 + max4) + "" ;

    }

    // Calcula el máxim d'un número expressat coma cadena).
    private static String maxim(String numero) {

        // Declaració de variables.
        char aux1 = '0';
        char aux2 = '0';
        char max = '0';

        // Recorrem tots els caràcters de la cadena paràmetres
        // per trobar el caràcter més gran.
        for (int i = 0; i < numero.length(); i++) {
            // Segon bucle per comparar cada caràcter amb tots els altres.
            for (int j = 0; j < numero.length(); j++) {
                aux1 = numero.charAt(i);
                aux2 = numero.charAt(j);

                if (aux1 > aux2) {
                    max = aux1 > max ? aux1 : max;

                } else {
                    max = aux2 > max ? aux2 : max;

                }

            }

        }

        return max + "";

    }

    public static String formataAQuatreXifres(String numero, boolean davant) {
        if (davant) {
            return switch (numero.length()) {
                case 1 -> "000" + numero;
                case 2 -> "00" + numero;
                case 3 -> "0" + numero;
                default -> numero;

            };

        } else {
            return switch (numero.length()) {
                case 1 -> "000" + numero;
                case 2 -> "00" + numero;
                case 3 -> "0" + numero;
                default -> numero;

            };

        }

    }

}