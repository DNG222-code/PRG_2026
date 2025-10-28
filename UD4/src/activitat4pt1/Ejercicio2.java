package activitat4pt1;

import java.util.Scanner; // Importamos la clase Scanner.

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);
        int edad;

        // Pedimos al usuario una edad.
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        // Hacemos las condiciones con el if, para saber si puede votar o no.
        if (edad >= 18) {
            System.out.println("Puedes votar.");

        } else if (edad < 18) {
            System.out.println("No puedes votar.");

        }

    }

}