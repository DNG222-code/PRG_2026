package activitat4pt1;

import java.util.Scanner; // Importamos la clase Scanner.

public class Ejercicio4 {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        double nota;

        // Pedimos al usuario la nota.
        System.out.println("Introduzca su nota de 0 a 10, puede ser en decimales (0,0): ");
        nota = sc.nextDouble();

        // Hacemos las condiciones con el if.
        if (nota >= 9) {
            System.out.println("Excelente.");

        } else if (nota >= 7 && nota <= 9) {
            System.out.println("Notable.");

        }  else if (nota >= 6 && nota <= 7) {
            System.out.println("Destacado.");
            
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Aprobado.");
            
        } else if (nota < 5) {
            System.out.println("Suspenso.");

        } else System.out.println("Tiene que ser de 0 a 10.");

    }

}