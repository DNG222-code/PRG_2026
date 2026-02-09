package exercicis.activitat8pt2;

import java.io.*;
import java.util.*;

public class Agenda {

    // Declaramos los atributs.
    Scanner sc = new Scanner(System.in); // Scanner para el menú y para toda la clase.

    // Declaramos los atributos para el fichero.
    File f = new File("UD8/fixers/agenda.txt");

    // Lectura.
    BufferedReader br = null;
    FileReader fr = null;

    // Escritura.
    BufferedWriter bw = null;
    FileWriter fw = null;

    public void menu() {

        // Declaramos la opcion.
        int opcion;

        // Declaramos variables para pedir al usuario.
        String nombre;
        String apellidos;
        int telefono;

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
                // Pedimos al usuario los datos del nuevo contacto.
                System.out.print("Introduce el nombre: ");
                nombre = sc.next();

                System.out.print("Introduce los apellidos: ");
                apellidos = sc.next();

                System.out.print("Introduce el telefono: ");
                telefono = sc.nextInt();

                // Llamamos al método para leer el fichero y le pasamos los atributos.
                leerFichero(nombre, apellidos, telefono);
            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {
                System.out.println("Has salido del programa. " + "\n");
            }
        } while (opcion != 4);
    }

    public void leerFichero(String nombre, String apellidos, int telefono) {

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

            // Mostramos al usuario que se háya leído bien el fichero.
            System.out.println("Se ha leído el fichero correctamente. " + "\n");

            // Creamos un array para guardar los datos del contacto.
            String[] datos = {nombre, apellidos, Integer.toString(telefono)};

            System.out.println("Se ha añadido un nuevo contacto al fichero. " + "\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()
                    + "\n"
                    + "Crea el fichero agenda.txt para que vaya el código.");
        }
    }
}
