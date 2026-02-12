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

    // Creamos un array para guardar los datos del contacto.
    String[] datos;

    // Declaramos los atributos para el fichero.
    File f = new File("UD8/fixers/agenda.txt");

    // Lectura.
    BufferedReader br = null;

    // Escritura.
    BufferedWriter bw = null;

    public void menu() {

        // Declaramos la opcion.
        int opcion;

        // Un control de error por si ponemos un caracter que no toca.
        try {
            // do-while hasta que presióne el número 4 para guardar y salir.
            do {
                // Mostramos el menú al usuario.
                System.out.println("\n" + "----------------");
                System.out.println("----- MENÚ -----");
                System.out.println("----------------" + "\n");

                System.out.println("1. Nuevo contacto. ");
                System.out.println("2. Buscar nombre. ");
                System.out.println("3. Mostrar todos. ");
                System.out.println("4. Salir. " + "\n");

                System.out.print("Selecciona una opcion: ");
                opcion = sc.nextInt(); // Guardamos la opcion seleccionada.
                sc.nextLine(); // Salto de scanner.

                if (opcion == 1) {
                    // Creamos una variable para saber cuantas veces va a introducir datos.
                    int veces;

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
                    buscarContacto(); // Llamamos al método para buscar contactos.
                } else if (opcion == 3) {
                    comparaContactos(); // Llamamos al método para ordenar por nombre.
                } else if (opcion == 4) {
                    System.out.println("Has salido del programa. ");
                    System.out.println("Ahora guardaremos el fichero.");
                }
            } while (opcion != 4);
        } catch (Exception e) {
            System.out.println("Error: "
                    + "Tienes que poner un número entero del rango del menú.");
        }
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

            // Escribimos los datos del nuevo contacto al fichero agenda.txt.
            bw.write(String.format("Nombre:    %s%nApellidos: %s%nTelefono:  %s%n%n",
                    datos[0], datos[1], datos[2]));

            // Informamos al usuario por consola que se hayan añadido los contactos.
            System.out.println("Se ha añadido un nuevo contacto al fichero. " + "\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally { // Cerramos el fichero con un control de error.
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el fichero: " + e.getMessage());
                }
            }
        }
    }

    // Método para buscar contactos en el fichero agenda.txt.
    public void buscarContacto() {
        String inicial; // Variable para guardar la inicial.

        // Pedimos al usuario la inicial para buscar.
        do {
            System.out.print("Introduzca una inicial para buscar los contactos: ");
            inicial = sc.next();
        } while (inicial.isEmpty()); // Si está vacio lo vuelve a pedir.

        // Creamos un try con recurso para leer el fichero.
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            // Declaramos las variables para leer el fichero.
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Nombre:") && linea.contains(inicial)) {
                    // Mostramos nombre
                    System.out.println(linea);

                    System.out.println(br.readLine() + "\n");

                    // Mostramos teléfono
                    System.out.println(br.readLine() + "\n");

                    encontrado = true; // Ponemos true para saber que se ha encontrado.
                }
            }

            // Si no se encuentra la inicial mostramos un mensaje.
            if (!encontrado) {
                System.out.println("No se encontraron contactos con esa inicial.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } finally { // Cerramos el fichero con un control de error.
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero: " + e.getMessage());
            }
        }
    }

    // Método para ordenar por nombre los contactos del fichero agenda.txt.
    public void comparaContactos() {

        int n = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            // Leemos el fichero con el bucle y contamos las líneas leídas.
            while (br.readLine() != null) {
                n++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        String[] lineas = new String[n];
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;

            // Recorremos el fichero con la variable creada.
            int i = 0;
            while ((linea = br.readLine()) != null) {
                lineas[i++] = linea;
            }

            // Imprimimos los contactos ordenados por nombre.
            for (String l : lineas) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
