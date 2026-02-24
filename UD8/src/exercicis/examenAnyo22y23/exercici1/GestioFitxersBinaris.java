package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

public class GestioFitxersBinaris {

    // Variables amb la ruta dels fitxers binaris.
    static String fitxer1 = "/UD8/fitxersBinaris/fitxer1.dat";
    static String fitxer2 = "/UD8/fitxersBinaris/fitxer2.dat";

    static String nomFitxer = "/UD8/fitxersBinaris/fusio.dat";

    public static void llegirFitxerBinari() {

        // Llegir el primer fitxer binari
        try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(fitxer1))) {
            int[] numeros1 = (int[]) ois1.readObject();

            // Recorremos el fitxer y anem llegint.
            while (true) {
                int numero1 = ois1.readInt();
                System.out.println(numero1);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: El fitxers no conté la clase especificada." + e.getMessage());
        }

        // Llegir el segon fitxer binari
        try (ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(fitxer2))) {
            int[] numeros2 = (int[]) ois2.readObject();

            // Recorremos el fitxer y anem llegint.
            while (true) {
                int numero2 = ois2.readInt();
                System.out.println(numero2);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: El fitxer no conté la clase especificada." + e.getMessage());
        }
    }

    // Método de Integer per fusionar els fitxers.
    static Integer[] fusionar(String fitxer1, String fitxer2) {
        llegirFitxerBinari(); // Cridem el mètode de llegir els fitxers binaris.

        // Array amb el contingut dels fitxers.
        Integer[] fitxers = new Integer[] {};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFitxer))) {


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return fitxers;
    }
}
