package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

public class Test {

    String fitxer1 = "/UD8/fitxersBinaris/fitxer1.dat.dat";
    String fitxer2 = "/UD8/fitxersBinaris/fitxer2.dat.dat";

    Integer[] fusionar(String fitxer1, String fitxer2) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fitxer1))) {


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return null;
    }
}
