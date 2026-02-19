package exercicis.provaFicherBinari;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prueba.dat", true))) {

            String cadena = "Hola mundo";
            int numero = 1;
            char letra = 'c';

            oos.writeObject(cadena);
            oos.writeInt(numero);
            oos.writeChar(letra);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
