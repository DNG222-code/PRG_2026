package examen;

import java.util.*;

public class ComparaPorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        // Hacemos la comparación de los 2 objetos para saber el orden del nombre, con el compareTo().
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
