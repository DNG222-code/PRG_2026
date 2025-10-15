package actividad3pt6;

// Importamos la librería para el Scanner.
import java.util.Scanner;

public class Ejercicio1a {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroAbsoluto;

        // Pedimos al usuario el número.
        System.out.println("Introduze un número, por favor: ");
        numero = sc.nextInt();

        // Comprobamos el número introducido si es absoluto o no, sin utilizar ningúna librería.
        // Comprobamos si el número es negativo,
        // si es negativo hacemos una resta con el mismo número, para que sea negativo
        // y si es positivo dejamos el número como está.
        numeroAbsoluto = numero < 0 ? -numero : numero;

        // Mostramos el número absoluto del número introducido.
        System.out.println("El número absoluto de " + numero + " es: " + numeroAbsoluto);

    }

}