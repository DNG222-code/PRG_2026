package activitat7pt3;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Hacemos instancia del compEdad.
        Comparator<Futbolista> compEdad = new ComparaEdad();

        // Array de futbolistas.
        Futbolista[] futbolistas = new Futbolista[5];

        // Instanciamos todos los futbolistas.
        futbolistas[0] = new Futbolista("4398439A", "Messi", 38, 600);
        futbolistas[1] = new Futbolista("4837483F", "Ronaldo", 38, 800);
        futbolistas[2] = new Futbolista("4398439A", "Neymar", 38, 500);
        futbolistas[3] = new Futbolista("4837483F", "Ronaldinho", 38, 700);
        futbolistas[4] = new Futbolista("4398439A", "Coutinho", 38, 400);

        // Ordenamos por orden de edad y si son iguales por nombre.
        Arrays.sort(futbolistas, compEdad);
        System.out.println(Arrays.toString(futbolistas));

    }
}
