package exercicis.activitat8pt2;

import java.io.*;
import java.util.*;

public class Agenda {

    // Declaramos los atributs.
    Scanner sc = new Scanner(System.in); // Scanner para el menú y para toda la clase.

    // Declaramos variables para pedir al usuario.
    String nombre;
    String apellidos;
    int telefono;


    // Declaramos los atributos para el fichero.
    File f = new File("UD8/fixers/agenda.txt");

    // Lectura.
    BufferedReader br = null;

    // Escritura.
    BufferedWriter bw = null;

    public void menu() {

        // Declaramos la opcion.
        int opcion;

        // do-while hasta que presióne el número 4 para guardar y salir.
        do {
            // Mostramos el menú al usuario.
            System.out.println("----------------");
            System.out.println("----- MENÚ -----");
            System.out.println("----------------" + "\n");

            System.out.println("1. Nuevo contacto. ");
            System.out.println("2. Buscar nombre. ");
            System.out.println("3. Mostrar todos. ");
            System.out.println("4. Salir. " + "\n");

            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt(); // Guardamos la opcion seleccionada.

            if (opcion == 1) {
                // Creamos una variable para saber cuantas veces va a introducir datos.
                int veces;

                // Creamos un array para guardar los datos del contacto.
                String[] datos;

                do {
                    System.out.println("Introduzca las veces que desea introducir datos: ");
                    veces = sc.nextInt();

                } while (veces <= 0 && veces >= 20);

                for (int i = 0; i < veces; i++) {
                    // Pedimos al usuario los datos del nuevo contacto.
                    System.out.print("Introduce el nombre: ");
                    nombre = sc.next();

                    System.out.print("Introduce los apellidos: ");
                    apellidos = sc.next();

                    System.out.print("Introduce el telefono: ");
                    telefono = sc.nextInt();
                    System.out.println();

                    datos = new String[]{nombre, apellidos, Integer.toString(telefono)};

                    // Llamamos al método para leer el fichero y le pasamos los atributos.
                    tratarFichero(datos);
                }

            } else if (opcion == 2) {


            } else if (opcion == 3) {

            } else if (opcion == 4) {
                System.out.println("Has salido del programa. " + "\n");
            }
        } while (opcion != 4);
    }

    // Método para leer el fichero.
    public void tratarFichero(String[] datos) {

        // Hacemos el tratamiento de error.
        try {
            // Inicializamos los atributos para leer y escribir en el fichero.
            br = new BufferedReader(new FileReader(f));

            // Declaramos la variable para leer el fichero.
            String linea = "";

            // Recorremos el fichero con la variable creada.
            while (linea != null) {
                linea = br.readLine();
            }

            escribirFichero(datos);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()
                    + "\n"
                    + "Crea el fichero agenda.txt para que vaya el código.");
        }
    }

    public void escribirFichero(String[] datos) {

        try {
            // Escribimos en el fichero.
            bw = new BufferedWriter(new FileWriter(f, true));

            // Mostramos al usuario que se háya leído bien el fichero.
            System.out.println("Se ha leído el fichero correctamente. " + "\n");

            bw.write(String.format("Nombre:    %s%nApellidos: %s%nTelefono:  %s%n%n",
                    datos[0], datos[1], datos[2]));

            System.out.println("Se ha añadido un nuevo contacto al fichero. " + "\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el fichero: " + e.getMessage());
                }
            }
        }
    }
}
