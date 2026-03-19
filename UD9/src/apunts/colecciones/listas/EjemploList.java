package apunts.colecciones.listas;

import java.util.*;

public class EjemploList {

    public static void main(String[] args) {

        // Creem una llista
        List <Integer> llista = new ArrayList<>();

        // add()
        llista.add(5);
        llista.add(2);
        llista.add(8);
        llista.add(2);

        System.out.println("Llista inicial: " + llista);

        // get():: obtenir elements per posició
        System.out.println("Element a la posició 1: " + llista.get(1));

        // set(): modificar un element
        llista.set(2, 10);
        System.out.println("Amb set: " + llista);

        // add(index, element): inserir a posició
        llista.add(1, 99);
        System.out.println("Inserir el 99: " + llista);

        // remove(index): eliminar per index
        llista.remove(1);
        System.out.println("Eliminar posició 0: " + llista);

        // indexOf(): elimina posició
        System.out.println("Primera posició del 2: " + llista.indexOf(2));

        // lastIndexOf(): ultima posició
        System.out.println("Ultima posició del 2: " + llista.lastIndexOf(2));

        // equals(): compara llistes
        List <Integer> copia = new ArrayList<>(llista);
        System.out.println("Les llistes son iguals? " + llista.equals(copia));

        // sort(): ordena de menor a mayor
        Collections.sort(llista);
        System.out.println("Orden ascendente: " + llista);

        // reverseOrder(): ordena de mayor a menor
        Collections.sort(llista, Collections.reverseOrder());
        System.out.println("Orden descendente: " + llista);
    }
}
