package ejercicios.activitat9pt11;

import java.util.*;
// Importem el paquet del stream.
import java.util.stream.*;

public class Test {

    public static void main(String[] args) {

        // Atributos.
        Collection<Integer> aleatorios = new ArrayList<>();

        // Vamos guardando números aleatorios a las dos colecciónes por separado.
        for (int i = 0; i < 40; i++) {
            aleatorios.add((int) (1 + Math.random() * 40));
        }

        // Mostrar la colección original.
        System.out.println("COLECCION ORIGINAL: ");
        System.out.println(aleatorios);
        System.out.println();

        // Creem una nova col·lecció amb els nombres múltiples de 4.
        Collection<Integer> multiplosDeCuatro = new ArrayList<>();

        multiplosDeCuatro = aleatorios.stream()
                .filter(n -> n % 4 == 0)
                .toList();

        // Creem una altra col·lecció amb els nombres majors que 20.
        Collection<Integer> multiplesDe20 = aleatorios.stream()
                .filter(n -> n % 20 == 0)
                .toList();

        // Creem una tercera col·lecció amb els nombres que són múltiples de 4 i majors que 20.
        Collection<Integer> multiplosDeCuatroY20 = aleatorios.stream()
                .filter(n -> n % 4 == 0 && n > 20)
                .collect(Collectors.toList());

        // Comprovem si tots els elements de la tercera col·lecció es troben dins la col·lecció de múltiples de 4.
        multiplosDeCuatroY20.retainAll(multiplosDeCuatro);

        // Creem una nova col·lecció que sigui la unió dels múltiples de 4 i els majors que 20.
        Collection<Integer> multiplosDeCuatroY20Unidos = new ArrayList<>();
        multiplosDeCuatroY20Unidos.addAll(multiplosDeCuatro);
        multiplosDeCuatroY20Unidos.addAll(multiplesDe20);

        // Eliminem d’aquesta col·lecció tots els elements que també apareixen a la tercera col·lecció.
        multiplosDeCuatroY20Unidos.removeAll(multiplosDeCuatroY20);

        // Mostrem la col·lecció final i el seu nombre d’elements.
        System.out.println("Colecció final: ");
        System.out.println(multiplosDeCuatroY20Unidos + "\n");
        System.out.println("¿Cuantos número hay?" + "\n" + multiplosDeCuatroY20Unidos.size());

    }
}
