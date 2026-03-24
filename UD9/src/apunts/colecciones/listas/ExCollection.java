package apunts.colecciones.listas;

import java.util.*;

public class ExCollection {

    public static void main(String[] args) {

        // Creem una llista
        List <Integer> llista = new ArrayList<>();

        llista.add(5);
        llista.add(2);
        llista.add(8);
        llista.add(2);
        llista.add(9);

        // CERCA (IMPORTANT: primer ha d'estar ordenat)
        Collections.sort(llista);
        int pos = Collections.binarySearch(llista, 8);
        System.out.println("Posició del 8: " + pos);

        // MANIPULACIÓ
        Collections.swap(llista, 0, 1); // intercanviar posicions
        System.out.println("Swap: " + llista);

        Collections.replaceAll(llista, 2, 99);
        System.out.println("ReplaceAll: " + llista);

        List <Integer> llista2 = new ArrayList<>(llista); // canviam tota la llista per 0
        Collections.fill(llista2, 0);
        System.out.println("Lista2: " + llista2);

        // Copy
        List <Integer> desti = new ArrayList<>(Arrays.asList(0,0,0,0,0));
        Collections.copy(desti, llista);
        System.out.println("Copia: " + desti);

        // Altres
        Collections.shuffle(llista); // barreja aleatoriament
        System.out.println("Shuffle: " + llista);

        Collections.reverse(llista); // inverteix l'ordre
        System.out.println("Reverse: " + llista);

        System.out.println("Max: " + Collections.max(llista)); // maxim
        System.out.println("Min: " + Collections.min(llista)); // minim

        System.out.println("Freq: " + Collections.frequency(llista, 99));

        Collection <Integer> un = Collections.singleton(100); // un sol element
        System.out.println("Singleton: " + un);

    }
}
