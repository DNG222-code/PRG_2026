package activitat4pt1;

import java.util.Scanner; // Importamos la clase Scanner.

public class Ejercicio3 {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);
        int temperatura;

        // Pedimos la temperatura al usuario.
        System.out.println("Ingrese una temperatura: ");
        temperatura = sc.nextInt();

        // Hacemos las condiciones con el if.
        if (temperatura > 30) {
            System.out.println("Hace calor.");
            
        } else if (temperatura <= 15 && temperatura >= 30) {
            System.out.println("El clima es templado.");

        } else if (temperatura < 15) {
            System.out.println("Hace frío.");

        }

    }

}