package apuntes;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // FITXERS DE TEXT I FITXERS BINARIS

        // EXCEPCIONS

        // CHECKED / UNCHECKED EXCEPTIONS : CHECKED (Son les que el compilador fa servir) / UNCHECKED (Son les funcions en temps de execució).

        // EXEPCIONS D'USUARI: Són les excepcions que preparem, definit per el programador.

        /*
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                at apuntes.Test.main(Test.java:18)
         */

//        int numerador = 10;
//        int divisor = 0;
//        int divisio = 0;
//
//        try {
//            validaEdad(7);
//        } catch (MiExcepcion ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//        catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//        } finally {
//            System.out.println("Sempre pasa per aquí.");
//            System.out.println("Resultat: " + divisio);
//        }

//        try {
//            metodeA();
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }

        leeEntero();

    }

    public static int leeEntero() {
        int resultado = 0;

        while (true) {
            try {
                System.out.println("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Va, entra un número entero, muñón!");
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        return resultado;
    }

    public static void metodeA() throws Exception {
//        try{
//            metodeB();
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }

        metodeB();
    }

    public static void metodeB() throws MiExcepcion {
        int numerador = 10;
        int divisor = 0;
        int divisio = 0;

        divisio = numerador / divisor;
    }

    public static void validaEdad(int edat) throws MiExcepcion {
        if (edat < 18) {
            throw new MiExcepcion("Eres menor de edad.");
        }
    }
}
