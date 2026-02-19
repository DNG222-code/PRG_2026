package exercicis.examenAnyo22y23.exercici2;

import java.util.*;

public class Esportistes {
    static String nom;
    static int edat;
    static double pes;
    static double alsada;

    public static void ObtenerAtributos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del esportista: ");
        nom = sc.next();

        System.out.println("Introduce la edad del esportista: ");
        edat = sc.nextInt();

    }
}
