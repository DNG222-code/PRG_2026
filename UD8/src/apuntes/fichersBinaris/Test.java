package apuntes.fichersBinaris;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        int[] numeros = {1, 4, 5, 6, 8, 14};

        String cadena = "Hola mundo!" + "\n" + "Como está usted?" + "\t";

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("datos3.dat"));

            for (int num : numeros) {
                oos.writeInt(num);
            }

            oos.writeObject(numeros);

            oos.writeObject(cadena);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error tancant el fitxer: " + e.getMessage());
                }
            }
        }

    }
}
