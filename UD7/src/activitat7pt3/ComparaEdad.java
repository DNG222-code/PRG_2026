package activitat7pt3;

import java.util.*;

public class ComparaEdad implements Comparator<Futbolista> {

    // Implementamos el método de la interface Comparator.
    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        // Comparamos por edad
        int resultadoEdad = Integer.compare(f1.edad, f2.edad);

        // Si el resultado no es 0, significa que las edades son diferentes
        if (resultadoEdad != 0) {
            return resultadoEdad;
        }

        // En el caso de que las edades sean iguales, comparamos por nombre
        return f1.nombre.compareTo(f2.nombre);
    }
}
