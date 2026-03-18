package correciones.colecciones.ejercicio7;

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Collection <Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 25; i++) { // generem els 25 numeros aleatoris
            numeros.add((int) (Math.random() * 15) + 1);
        }

        System.out.println("Original: " + numeros);

        Collection <Integer> repetits = new ArrayList<>();
        Collection <Integer> unics = new ArrayList<>();

        for (Integer numero : numeros) {
            int contador = 0;
            for (Integer m : numeros) {
                if (numero.equals(m)) {
                    contador++;
                }
            }

            if (contador > 1) {
                if (!repetits.contains(numero)) {
                    repetits.add(numero);
                }
            } else {
                unics.add(numero);
            }
        }

        // Mostrem resultats
        System.out.println("Nombres repetits: " + repetits);
        System.out.println("Nombres únics: " + unics);

        System.out.println("Total original: " + numeros.size());
        System.out.println("Total repetits: " + repetits.size());

        System.out.println("Total unics: " + unics.size());
    }
}
