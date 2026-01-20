package activitat7pt2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // Array de futbolistas.
        Futbolista[] futbolistas = new Futbolista[5];
        futbolistas[0] = new Futbolista("4398439A", "Messi", 38, 600);
        futbolistas[1] = new Futbolista("4837483F", "Ronaldo", 41, 800);
        futbolistas[2] = new Futbolista("4398439A", "Neymar", 35, 500);
        futbolistas[3] = new Futbolista("4837483F", "Ronaldinho", 37, 700);
        futbolistas[4] = new Futbolista("4398439A", "Coutinho", 32, 400);

        // Ahora esto funcionará porque Futbolista implementa Comparable
        Arrays.sort(futbolistas);

        // Imprimimos todos los fútbolistas ordenados.
        for( int i = 0; i < futbolistas.length; i++ ) {
            System.out.println((futbolistas[i]));
        }
    }
}
