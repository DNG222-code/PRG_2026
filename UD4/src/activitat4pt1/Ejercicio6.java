package activitat4pt1;

import java.util.Scanner; // Importamos la clase Scanner.

public class Ejercicio6 {

    public static void main(String[] args) {

        // Declaramos variables
        Scanner sc = new Scanner(System.in);
        int numero;
        String esPar;

        // Pedimos al usuario que introduzca un número.
        System.out.print("Introduzca un número entero, por favor: ");
        numero = sc.nextInt();

        // Hacemos las condiciones de if
        System.out.println("Respuestas con condiciones de if.");
        if (numero % 2 == 0) {
            System.out.println("Es un número par. (if/else)");

        } else System.out.println("Es un número impar. (if/else)");

        System.out.println();

        // Hacemos las condición con operador ternario.
        esPar = numero % 2 == 0 ? "Es un número par. (ternario)" : "Es un número impar. (ternario)";

        System.out.println("Respuesta con condicion ternaria." + "\n" + esPar);

    }

}
