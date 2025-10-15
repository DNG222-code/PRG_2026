package actividad3pt7pt1;

// Importamos la clase Scanner.
import java.util.Scanner;

public class CamiCavalls {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);
        int distancia;
        double tiempo;
        char dificultad;

        // Damos la bienvenida.
        System.out.println("Bienvenido al Camí de Cavalls");

        // Pedimos al usuario todos los datos y los guardamos en las variables declaradas anteriormente.
        System.out.println("Introduzca la distancia de la ruta en kilómetros: ");
        distancia = sc.nextInt();
        System.out.println("Introduzca el tiempo estimado de la ruta en horas: ");
        tiempo = sc.nextDouble();
        System.out.println("Introduzca la dificultad de la ruta (F/M/D): ");
        dificultad = sc.next().charAt(0);

        // Hacemos las conversiones de datos.
        String doubleString = tiempo + " horas";
        String intString = distancia + " kilómetros";
        int charInt = dificultad;

        // Hacemos el operador ternado, para comprobar lo que se introduce y ponerlo como String.
        String charString = dificultad == 'F' ? "Fácil" : dificultad == 'M' ? "Media"
                : dificultad == 'D' ? "Difícil" : "Introduzca una letra de la lista.";

        // Pasamos el String a char.
        char stringChar = charString .charAt(0);

        // Pasamos el int a char.
        char intChar = (char) charInt;

        // Imprimimos los resultados.
        System.out.println("Detalles de la ruta: ");
        System.out.println("Ruta: " + "Camí de Cavalls");
        System.out.println("Distancia: " + intString);
        System.out.println("Tiempo estimado: " +  doubleString);
        System.out.println("Dificultad: " + charString);
        System.out.println("Dificultad (char a int): " + charInt);
        System.out.println("Dificultad (String a char): " + stringChar);
        System.out.println("Dificultad (int a char): " + intChar);

    }

}