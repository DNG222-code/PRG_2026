package apuntes.lecturaFitxerosBinarios;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos2.dat"))) {

            // int[] numeros = new int[6];

            int[] numeros = (int[]) ois.readObject();

            while (true) {
                int numero = ois.readInt();
                System.out.println(numero);

            }

//            for (int i = 0; i < numeros.length; i++) {
//                numeros[i] = ois.readInt();
//            }

//            System.out.println(Arrays.toString(numeros));

        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("El fichero no contiene la clase especificada" + e);
        }

    }
}
