package exercicis.activitat8pt3;

import java.io.*;
import java.util.*;

public class Principal {

    // Atributos de la clase.
    Scanner sc = new Scanner(System.in);
    static String path;

    Equacion[] ecuaciones = TratamientoFicheros.leerFichero(path);

    // Método principal de la clase.
    public void ejecutar() {
        // Llamamos los métodos de la clase.
        menu();
    }

    public void menu() {
        // Guardamos la opción en la variable.
        int opcion;

        do {
            // Mostramos al usuario el menú.
            System.out.println("\n" + "--------------");
            System.out.println("---- MENÚ ----");
            System.out.println("--------------" + "\n");
            System.out.println("1 - Pedir nombre del fichero.");
            System.out.println("2 - Resolver una equación.");
            System.out.println("3 - Resolver todas.");
            System.out.println("4 - Salir y guardar fichero." + "\n");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();

            // Hacemos condiciones según la opción que seleccione el usuario.
            if (opcion == 1) {
                // Llamamos el método de la clase TratamientoFicheros.
                TratamientoFicheros.pedirNombreFichero();
            } else if (opcion == 2) {
                System.out.print("Número de ecuación (1 - " + ecuaciones.length + "): ");
                int num = sc.nextInt() - 1;

                if (num >= 0 && num < ecuaciones.length) {
                    if (ecuaciones[num] != null) {
                        String resultado = ecuaciones[num].toString() + " -> " + ecuaciones[num].resolver();
                        System.out.println(resultado);
                        TratamientoFicheros.escribirSoluciones(resultado);
                    }
                }
            } else if (opcion == 3) {

            } else if (opcion == 4) {
                System.out.println("Has salido del programa. " + "\n");
                System.out.println("Guardando fichero...");
            } else {
                System.out.println("La opción es incorrecta ! ");
            }
        } while (opcion != 4);
    }
}
