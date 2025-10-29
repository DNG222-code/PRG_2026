package activitat4pt5;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        // Variable para el número.
        int numero;

        // Pedimos al usuario que introduzca un número.
        System.out.println("Introduzca un número del 0 al 9999, por favor: ");
        numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("Tiene que estar el número entre el rango de 0 y 9999.");

        } else {


        }

    }

}