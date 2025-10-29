package activitat4pt2;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        // Variable para el carácter.
        char caracter;

        // Pedimos al usuario el carácter.
        System.out.println("Introduzca un carácter, por favor: ");
        caracter = sc.next().charAt(0); // Guardamos en la variable lo introducido.

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("Es una letra vocal.");

        } else if (!((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z'))) {
            System.out.println("Ha salido un ERROR, introduzca un valor válido.");

        } else {
            System.out.println("No es una vocal.");

        }

    }

}