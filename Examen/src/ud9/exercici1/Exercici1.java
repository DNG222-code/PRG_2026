package ud9.exercici1;

import java.util.*;

public class Exercici1 {

    public static void main(String[] args) {

        // Declarem la llista on guardem els alumnes
        List<String> alumnes = new ArrayList<>();

        // Declarem una variable de tipus Scanner
        Scanner sc = new Scanner(System.in);

        // Variable per guardar el nom de l'alumne
        String nomAlumne = "";

        System.out.println("CONTROL D'ASISTENCIA");

        // Repetim és bucle fins que l'usuari introdueixí sortir.
        do {
            System.out.println("Introdueix el nom de l'alumne o (sortir) per acabar el programa: ");
            nomAlumne = sc.nextLine();

            if (!nomAlumne.equalsIgnoreCase("sortir") && !nomAlumne.equalsIgnoreCase("Sortir")) {
                // Afegim el nom de l'alumne a la llista.
                alumnes.add(nomAlumne);
            } else {
                System.out.println("Has sortit del programa!");
            }
        } while (!nomAlumne.equalsIgnoreCase("sortir") && !nomAlumne.equalsIgnoreCase("Sortir"));

        System.out.println();
        // Mostrem tots els registres introduïts.
        System.out.println("Alumnes registrats: ");
        for (String a : alumnes) {
            System.out.println(a);
        }
        System.out.println();

        // Mostrem els alumnes que han arribat tard més d'una vegada.
        // Mirem sí ni a més d'un alumne amb el mateix nom.
        alumnes.removeIf(a -> alumnes.stream()
                // Només mostrará els alumnes que han tardat més d'una vegada.
                .filter(b -> a.equalsIgnoreCase(b)) // Lleva els alumnes que només tenen una vegada el nom.
                .count() > 1);

        System.out.println("Arriben tard més d'una vegada: " + alumnes + "\n");

        // Mostrem els alumnes que només han arribat tard una vegada.
        Set<String> tardUnaVegada = new HashSet<>(alumnes);

        System.out.print("Han arribat tard una vegada: " + tardUnaVegada + "\n");

    }
}
