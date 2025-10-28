package activitat4pt3;

import java.util.Scanner; // Importamos la clase Scanner.

public class Test {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        int numero = 0; // Número del mes.
        String mes = ""; // Inicializamos para evitar error de compilación.
        int dias = 0;
        int anyo;
        boolean esBisiesto;

        // Pedimos el número del mes.
        System.out.println("Introduce un número del 1 al 12 (representa el mes):");
        numero = sc.nextInt();

        // Pedimos el año.
        System.out.println("Introduce el año:");
        anyo = sc.nextInt();

        // Determinamos si es bisiesto.
        esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);

        // Determinamos el mes y los días.
        switch (numero) {
            case 1 -> {
                mes = "Enero";
                dias = 31;
            }
            case 2 -> {
                mes = "Febrero";
                dias = esBisiesto ? 29 : 28;
            }
            case 3 -> {
                mes = "Marzo";
                dias = 31;
            }
            case 4 -> {
                mes = "Abril";
                dias = 30;
            }
            case 5 -> {
                mes = "Mayo";
                dias = 31;
            }
            case 6 -> {
                mes = "Junio";
                dias = 30;
            }
            case 7 -> {
                mes = "Julio";
                dias = 31;
            }
            case 8 -> {
                mes = "Agosto";
                dias = 31;
            }
            case 9 -> {
                mes = "Septiembre";
                dias = 30;
            }
            case 10 -> {
                mes = "Octubre";
                dias = 31;
            }
            case 11 -> {
                mes = "Noviembre";
                dias = 30;
            }
            case 12 -> {
                mes = "Diciembre";
                dias = 31;
            }
            default -> {
                System.out.println("ERROR: Tiene que ser un número del 1 al 12.");
                return;
            }
        }

        // Mostramos los resultados.
        System.out.println("El número " + numero + " corresponde a " + mes + ".");
        System.out.println(mes + " tiene " + dias + " días.");
        System.out.println("El año " + anyo + (esBisiesto ? " es bisiesto." : " no es bisiesto."));

        sc.close(); // Cerramos el Scanner.

    }

}