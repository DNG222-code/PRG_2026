package actividad3pt3;

import java.util.*; // Importamos todas las librerías para que funcione el Scanner.

public class Ejercicio1 {

    public static void main(String[] args) {
        // Declaramos las variables para calular los km's.
        Scanner sc = new Scanner(System.in);
        int millas;
        double conversionAKm;

        // Pedimos al usuario que introduzca una distancia.
        System.out.println("Introduzca el una distancia en millas, para convertir a km: ");
        millas = sc.nextInt();

        // Hacemos la conversión de millas a km.
        conversionAKm = millas * 1.61;

        // Imprimimos el resultado a km's.
        System.out.println("El total de millas a km, es: " + conversionAKm + " km");

    }

}