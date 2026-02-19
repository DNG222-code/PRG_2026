package apuntes.fitxersBinarisRecursos;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("decimals.dat"))) {
            System.out.println("Dame el número de elementos: ");
            int elementos = new Scanner(System.in).nextInt();
            double[] decimals = new double[elementos];

            for (int i = 0; i < decimals.length; i++) {
                System.out.println("Introduzca un número real: ");
                decimals[i] = new Scanner(System.in).useLocale(Locale.US).nextDouble();
            }

            oos.writeObject(decimals);
            System.out.println("Proceso finalizado con éxito!");

        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error en el formato del número: " + e.getMessage());
        }

    }
}
