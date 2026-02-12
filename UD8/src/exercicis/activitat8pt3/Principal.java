package exercicis.activitat8pt3;

import java.util.*;

public class Principal {

    // Scanner para todo el programa
    Scanner sc = new Scanner(System.in);

    // Array de ecuaciones (al principio está vacío)
    Equacion[] ecuaciones = null;

    // Método principal que arranca el menú
    public void ejecutar() {
        menu();
    }

    public void menu() {

        int opcion;

        do {
            System.out.println("\n--------------");
            System.out.println("---- MENÚ ----");
            System.out.println("--------------\n");
            System.out.println("1 - Pedir nombre del fichero.");
            System.out.println("2 - Resolver una ecuación.");
            System.out.println("3 - Resolver todas.");
            System.out.println("4 - Salir.");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {

                // Pedimos el nombre del fichero
                System.out.print("Introduce el nombre del fichero: ");
                String path = sc.nextLine();

                // Leemos el fichero y guardamos las ecuaciones
                ecuaciones = TratamientoFicheros.leerFichero(path);

                if (ecuaciones != null) {
                    System.out.println("Fichero cargado correctamente.");
                }
            } else if (opcion == 2) {

                // Comprobamos que se haya cargado fichero
                if (ecuaciones == null) {
                    System.out.println("Primero debes cargar un fichero.");
                    continue;
                }

                System.out.print("Número de ecuación (1 - " + ecuaciones.length + "): ");
                int num = sc.nextInt() - 1;

                if (num >= 0 && num < ecuaciones.length) {

                    if (ecuaciones[num] != null) {

                        String resultado = ecuaciones[num].toString()
                                + " -> "
                                + ecuaciones[num].resolver();
                        System.out.println(resultado);
                        TratamientoFicheros.escribirSoluciones(resultado);
                    } else {
                        System.out.println("Ecuación inválida.");
                    }
                }
            } else if (opcion == 3) {
                if (ecuaciones == null) {
                    System.out.println("Primero debes cargar un fichero.");
                    continue;
                }

                for (int i = 0; i < ecuaciones.length; i++) {

                    if (ecuaciones[i] != null) {

                        String resultado = ecuaciones[i].toString()
                                + " -> "
                                + ecuaciones[i].resolver();

                        System.out.println(resultado);
                        TratamientoFicheros.escribirSoluciones(resultado);
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Has salido del programa.");
            } else {
                System.out.println("Opción incorrecta.");
            }
        } while (opcion != 4);
    }
}