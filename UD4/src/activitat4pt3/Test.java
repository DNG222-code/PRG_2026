package activitat4pt3;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in); // Scanner.

        // Variable para numero.
        int numero = 0;

        // Variable para el switch por meses.
        String mes;

        // Variable para saber el año.
        int anyo;

        // Variable para saber si es bisioesto o no.
        boolean esBisiesto;

        // Pedimos al usuario el número.
        System.out.println("Introduce un número del 1 al 12, si no introduces sobre ese rango, dará error.");
        numero = sc.nextInt(); // Guardamos el número via Scanner en la variable numero.

        // Pedimos al usuario el año.
        System.out.println("Introduce un número, que puede ser el año.");
        anyo = sc.nextInt();

        // Hacemos la condición con el switch, para saber el mes.
        mes = switch (numero) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";

            // Mostramos un error si la opción es incorrecta.
            default -> "ERROR: Tiene que ser del 1 al 12.";

        };

        // Mostramos por pantalla el valor de la opción introducida.
        System.out.println("El numero " + numero + " es: " + mes);

        if (anyo % 4 == 0) {
            esBisiesto = true;

        }

    }

}