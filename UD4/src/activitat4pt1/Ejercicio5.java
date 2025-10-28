package activitat4pt1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean esAprobadoTeorico;
        boolean esAprobadoPractico;

        // Introduzca la edad de la persona.
        System.out.println("Introduzca la edad de la persona: ");
        edad = sc.nextInt();

        // Pedimos si ha aprobado a la primera el teórico.
        System.out.println("Ha aprobado el examen teórico? (true/false)");
        esAprobadoTeorico = sc.nextBoolean();

        // Pedimos si ha aprobado el práctico.
        System.out.println("Ha aprobado el examen práctico? (true/false)");
        esAprobadoPractico = sc.nextBoolean();

        // Hacemos todas las condiciones.
        if (edad < 18) {
            System.out.println("No puede obtener la licencia. Es menor de edad.");

        } else if (esAprobadoTeorico && !esAprobadoPractico) {
            System.out.println("No puede obtener la licencia. Tiene que aprobar el práctico.");

        } else  if (esAprobadoPractico && !esAprobadoTeorico) {
            System.out.println("No puede obtener la licencia. Tiene que aprobar el teórico.");

        } else System.out.println("Puede obtener la licencia.");

    }

}