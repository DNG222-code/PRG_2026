package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

public class LlegirFusio {

    public static void main(String[] args) {

        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("fusio.dat"));

            while (true) {

                Integer num = (Integer) in.readObject();
                System.out.println(num);
            }

        } catch (IOException e) {
            System.out.println("Fi del fitxer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}