package exercicis.activitat8pt4;

import java.io.*;
import java.util.*;

public class CopaDelReyManager {

    public static void main(String[] args) {

        // Mostramos primero el menú.
        menu();
    }

    // Método para el menu de la aplicación.
    public static void menu() {
        // Leemos los ficheros al iniciar el menú.
        TratamientoFicheros.leerFicheros();

        int opcion; // Variable para guardar la opcion seleccionada.

        try {
            do {
                // Mostramos todo el menú.
                System.out.println();
                System.out.println("===============================");
                System.out.println("    COPA DEL REY BALONCESTO    ");
                System.out.println("===============================");

                System.out.println("1. Crear equipo");
                System.out.println("2. Eliminar equipo");
                System.out.println("3. Crear jugador");
                System.out.println("4. Eliminar jugador");
                System.out.println("5. Asignar jugador a equipo");
                System.out.println("6. Mostrar equipos");
                System.out.println("7. Mostrar jugadores de un equipo");
                System.out.println("8. Simular partido");
                System.out.println("9. Mostrar clasificación");
                System.out.println("0. Salir");

                System.out.print("Selecciona una opcion: ");
                opcion = new Scanner(System.in).nextInt();

                // Condiciones, según la opcion seleccionada.
                if (opcion == 1) {
                    Equipo.crearEquipo();
                } else if (opcion == 2) {

                } else if (opcion == 3) {

                } else if (opcion == 4) {

                } else if (opcion == 5) {

                } else if (opcion == 6) {

                } else if (opcion == 7) {

                } else if (opcion == 8) {

                } else if (opcion == 9) {

                } else if (opcion == 0) {
                    System.out.println("Has salido de la aplicación. Hasta pronto!");
                } else {
                    System.out.println();
                }
            } while (opcion != 0);

        } catch (Exception ex) {
            System.out.println("Error: Introduce un rando correcto: " + ex.getMessage());
        }
    }

}
