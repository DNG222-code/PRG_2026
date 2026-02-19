package apuntes.lecturaFitxerosBinarios;

import java.io.*;

public class TestString {

    public static void main(String[] args) {

        String cadena;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos3.dat"))) {


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
