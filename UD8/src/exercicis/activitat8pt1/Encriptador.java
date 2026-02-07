package exercicis.activitat8pt1;

import java.io.*;

public class Encriptador {

    // Declaramos los ficheros con la ruta.
    File f1 = new File("UD8/fixers/codec.txt");
    File f2 = new File("UD8/fixers/mensaje.txt");
    File f3 = new File("UD8/fixers/secreto.txt");

    // Declaramos el lector de ficheros.
    BufferedReader br = null;
    // Declaramos el escritor de ficheros.
    BufferedWriter bw = null;

    // Declaramos las variables para guardar información.
    String linea = "";
    String[] texto = new String[100];

    // Método principal.
    public void tratamientoFicheros() {
        leerFicheroCodec(texto); // Llamamos el método para leer el fichero.
        escribirFicheroMensaje(); // Llamamos el método para escribir el fichero mensaje.txt.
    }

    // Método para leer el fichero.
    public void leerFicheroCodec(String[] texto) {
            if (f1.exists()) {
                try {
                    br = new BufferedReader(new FileReader(f1));

                    // Recorremos el fichero con la variable línea.
                    while (linea != null) {
                        linea = br.readLine();
                    }

                    System.out.println("Se ha leído el fichero correctamente.");
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("El fichero no existe. Crearemos uno nuevo." + "\n");
                escribirFicheroCodec(); // Llamamos al método de escribirFicheroCodec() para crearlo, si no existe.
            }
    }

    public void escribirFicheroCodec() {
        try {
            bw = new BufferedWriter(new FileWriter(f1));

            // Escribimos el mensaje al fichero codec.txt.
            bw.write("a b c d e f g h i j k l m n o p q r s t o v w x i z\n");
            bw.write("e m s r c i j n f x i w t a k o z d l q v b h o p g");

            System.out.println("Se ha escrito correctamente el fichero.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Comprobamos que se haya escrito correctamente.
            if (bw != null) {
                // Cerramos el fichero codec.txt.
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error cerrando el fichero: " + e.getMessage());
                }
            }
        }
    }

    public void leerFicheroMensaje() {
        // Comprobamos que el fichero existe.
        if (f2.exists()) {
            try {
                br = new BufferedReader(new FileReader(f2));

                // Recorremos el fichero con la variable línea.
                while (linea != null) {
                    linea = br.readLine();
                }

                System.out.println("Se ha leído el fichero mensaje.txt correctamente." + "\n");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void escribirFicheroMensaje() {
        try {
            bw = new BufferedWriter(new FileWriter(f2));

            bw.write(linea);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error cerrando el fichero: " + e.getMessage());
                }
            }
        }
    }
}
