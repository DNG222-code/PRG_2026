package exercicis.examenAnyo22y23.exercici1;

import java.io.*;

public class Fusio implements Comparable<Integer> {

    static Integer[] fusio;

    public static Integer[] fusionar(String fitxer1, String fitxer2) {

        Integer[] a1 = llegirFitxer(fitxer1);
        Integer[] a2 = llegirFitxer(fitxer2);

        fusio = new Integer[a1.length + a2.length];

        // Copiar primer array
        for (int i = 0; i < a1.length; i++) {
            fusio[i] = a1[i];
        }

        // Copiar segundo array
        for (int i = 0; i < a2.length; i++) {
            fusio[a1.length + i] = a2[i];
        }

        // Imprimir array ordenado
        for (int i = 0; i < fusio.length; i++) {
            fusio[i] = fusio[i].compareTo(fusio[0]);
            System.out.println(fusio[i]);
        }

        return fusio;
    }

    public static Integer[] llegirFitxer(String nomFitxer) {

        Integer[] array = new Integer[100]; // tamaño máximo
        int contador = 0;

        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(nomFitxer));

            while (true) {
                array[contador] = (Integer) in.readObject();
                contador++;
            }

        } catch (IOException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear array del tamaño exacto
        Integer[] resultat = new Integer[contador];

        for (int i = 0; i < contador; i++) {
            resultat[i] = array[i];
        }

        return resultat;
    }

    // Ordenar array
    @Override
    public int compareTo(Integer o) {

        return fusio[o].compareTo(fusio[0]);
    }

    public static void guardar(Integer[] array) {

        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("fusio.dat"));

            for (int i = 0; i < array.length; i++) {
                out.writeObject(array[i]);
            }

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}