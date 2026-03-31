package ud9.exercici4;

import java.util.*;

public class Exercici4 {

    public static void main(String[] args) {

        // Lista de notes
        List<Double> notes = new ArrayList<>();

        // Declarem un Scanner.
        Scanner sc = new Scanner(System.in);

        // Variable per guardar la nota
        double nota = 0;

        // Anem afegint 5 notes
        for (int i = 0; i < 5; i++) {
            System.out.println("Introdueix una nota: ");
            nota = sc.nextDouble();

            notes.add(nota); // Afegim les notes a la llista.
        }

        // Eliminem les notes duplicades
        Set<Double> notesSenseDuplicats = new HashSet<>(notes);

        System.out.print("Notes sense duplicats: " + notesSenseDuplicats + "\n");

        // Ordenem les notes de menor a major
        List<Double> notesOrdenades = new ArrayList<>(notesSenseDuplicats); // Tornem a fer-lo a llista.
        Collections.sort(notesOrdenades);

        System.out.print("Notes ordenades: " + notesOrdenades + "\n");

        // Moestrem la nota maxima y mínima.
        double max, min;
        max = Collections.max(notesOrdenades);
        min = Collections.min(notesOrdenades);

        System.out.print("Nota máxima: " + max + "\n");
        System.out.print("Nota mínima: " + min + "\n");

        // Indiquem quantes vegades apareix la nota mínima.
        System.out.println("La nota mínima apareix: " + notesOrdenades.stream()
                .filter(n -> n == min)
                .count());

    }
}
