package activitat4pt5;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        // Declaramos la variable para el número.
        int numero;

        // Declaramos la variable para el resto.
        int resto;

        // Declaramos la variable para el inverso.
        int inverso = 0;

        // Pedimos el número al usuario.
        System.out.println("Introduce un numero del 0 al 9999: ");
        numero = sc.nextInt(); // Guardamos la respuesta en la variable numero.

        // Declaramos una variable para que se quede el número original del principio.
        int numeroOriginal = numero;

        // Comprobamos si el numero no sale del rango.
        if (numero < 0 || numero > 9999) {
            System.out.println("ERROR: El numero introducido no es valido.");

        } else {
            // Vemos si es mayor a 0 y recogeremos el número.
            while (numero > 0) {
                resto = numero % 10; // Cogemos la última cifra con el resto.
                inverso = (inverso * 10) + resto; // Añadimos el resto a la variable inverso.
                numero = numero / 10; // Quitamos la ultima cifra del número introducido.

            }

        }

        // Comprobamos si es capicua o no.
        if (numeroOriginal == inverso) {
            System.out.println("El número es capicua");

        } else {
            System.out.println("No es capicua");

        }

    }

}