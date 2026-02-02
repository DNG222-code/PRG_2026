package provaBufferedWriter;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        String path = "UD8/fixers/prova3.txt";
        String salt = "\n";

        try {
            fw = new FileWriter(path, true); //Con el true, no se quita lo anterior
            bw = new BufferedWriter(fw);

            bw.write("Línea 1...");
            bw.newLine();
            bw.write("Línea 2...");
            bw.newLine();
            bw.write("Línea 3...");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error tancant el fitxer: " + e.getMessage());
                }
            }
        }
    }
}
