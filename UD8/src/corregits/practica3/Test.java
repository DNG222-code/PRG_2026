package corregits.practica3;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] lista1 = GestionFicheros.leerLista("UD8/fixers/llista1.txt");
        int[] lista2 = GestionFicheros.leerLista("UD8/fixers/llista2.txt");

        Arrays.sort(lista1);
        Arrays.sort(lista2);

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));

        int[] listaUnica = new int[lista1.length + lista2.length];

        for (int i = 0; i < lista1.length; i++) {
            listaUnica[i] = lista1[i];
        }

        int j = 0;
        for (int i = lista1.length; i < listaUnica.length; i++) {
            listaUnica[i] = lista2[j];
            j++;
        }

        Arrays.sort(listaUnica);
        System.out.println(Arrays.toString(listaUnica));

        if (GestionFicheros.escribe(listaUnica, "listaUnica.txt", true)) {
            System.out.println("El fichero se ha escrito correctamente.");
        }
    }
}
