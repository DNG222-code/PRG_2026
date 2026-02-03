package apuntes.provesWriter;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        FileWriter fw = null;

        String path = "UD8/fixers/prova2.txt";
        String salt = "\n";

        try {
            fw = new FileWriter(path, true); //Con el true, no se quita lo anterior

//            fw.write("Primera línea...");
//            fw.write(salt);
//            fw.write("Segona línea...");
//            fw.write(salt);
//            fw.write("Tercera línea...");
//            fw.write(salt);
//            fw.write("Final del fitxer!");

            fw.write(salt + "jejeje pues no! una más!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error tancant el fitxer: " + e.getMessage());
                }
            }
        }

    }
}
