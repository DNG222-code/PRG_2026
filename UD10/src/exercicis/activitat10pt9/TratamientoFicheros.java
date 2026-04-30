package exercicis.activitat10pt9;

import java.io.*;

public class TratamientoFicheros {

    public static void leerFicheros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("especies.dat"))) {

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
