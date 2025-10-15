package actividad3pt6;

// Importamos la librería para el Scanner.
import java.util.Scanner;

public class Ejercicio1b {

    public static void main(String[] args) {

        // b) Con clase Math.
        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        int numero;
        double numeroAbsoluto;

        // Pedimos el número al usuario.
        System.out.println("Introduce un número, por favor: ");
        numero = sc.nextInt();

        // Usamos el método Math.abs para saber el número absoluto.
        numeroAbsoluto = Math.abs(numero);

        // Mostramos el número absoluto.
        System.out.println("El número absoluto de " + numero + " es: " + numeroAbsoluto);

    }

}