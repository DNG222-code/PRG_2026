package activitat4pt4;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);

        // Variable para el número.
        int n;

        // Pedimos el número al usuario.
        System.out.println("Introduce un número, por favor: ");
        n = sc.nextInt(); // Guardamos el número en (n).

        // Dibujamos el triángulo
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Sin salto de línea

            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        sc.close();
    }

}