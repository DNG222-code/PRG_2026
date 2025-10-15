package actividad3pt8;

// Importamos la clase Scanner.
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        int numero;


        // Pedimos al usuario un número.
        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        int multiploDeSiete = numero % 7;

    }

}