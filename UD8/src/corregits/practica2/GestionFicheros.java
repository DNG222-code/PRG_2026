package corregits.practica2;

import java.io.*;

public class GestionFicheros {

    public static void escribe(Usuario u, boolean sobreescribir) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dades.txt"))) {
            bw.write(u.getNombre());
            bw.newLine();
            bw.write(u.getApellido());
            bw.newLine();
            bw.write(u.getEdad() + "");
            bw.newLine();
            bw.write("---------------------------");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("ERROR DE ESCRITURA: " + e.getMessage());
        }
    }
}
