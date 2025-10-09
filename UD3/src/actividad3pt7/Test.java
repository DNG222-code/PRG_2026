package actividad3pt7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Declaramos las variables
        double pes = 0;
        String pel = "";
        String caracter = "";
        double preu = 0;

        // Declaramos un Scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario.
        System.out.println("Introduzca el peso del animal, por favor: ");
        pes = sc.nextDouble();

        System.out.println("Introduzca el tipo del pelo, por favor: ");
        pel = sc.nextLine();

        System.out.println("Introduzca el caracter del animal, por favor: ");
        caracter = sc.nextLine();

        // Tratamos el precio.
        preu = (pes < 10) ? 20 : (pes < 20) ? 30 : 40;

        // Tratamos el pelo.
        preu += pel.charAt(0) == 'l' ? 15 : 0;

    }

}