package ud9.exercici2;

import java.util.*;

public class Exercici2 {

    public static void main(String[] args) {
        // Declarem les dues llistes.
        List<String> llistaProductes1 = new ArrayList<>();
        List<String> llistaProductes2 = new ArrayList<>();

        // Afegim els productes a les llistes.
        // 1
        llistaProductes1.add("Pá");
        llistaProductes1.add("Gelat");
        llistaProductes1.add("Ensalada");

        // 2
        llistaProductes2.add("Aigua");
        llistaProductes2.add("Gelat");
        llistaProductes2.add("Carn");

        // Mostrem els productes que tenen en comú.

        // Declarem una llista per als comuns.
        List<String> comu = new ArrayList<>(llistaProductes1);
        comu.retainAll(llistaProductes2); // RetainAll() retorna els elements que coincideixen.

        System.out.println("Comuns: " + comu + "\n");

        // Mostrem els productes que només ha comprat la primera persona.

        // Declarem una llista per només a la primera persona.
        List<String> nomesPrimeraPersona = new ArrayList<>(llistaProductes1);
        nomesPrimeraPersona.removeAll(llistaProductes2); // removeALl() borra tots els elements que coincideixen.

        System.out.println("Només de la primera persona: " + nomesPrimeraPersona + "\n");

        // Mostrem els productes totals (sense repetir).
        Set<String> productesSenseRepetir = new HashSet<>(llistaProductes1);
        productesSenseRepetir.addAll(llistaProductes2); // Afegim els productes de la segona llista al Set.
        System.out.println("Productes sense repetir: " + productesSenseRepetir);

        // Indiquem si les dues persones han comprat exactament el mateix.
        System.out.println("Compren exactament el mateix? (true/false) " + llistaProductes1.equals(llistaProductes2));
    }

}
