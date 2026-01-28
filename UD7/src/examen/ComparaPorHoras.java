package examen;

import java.util.*;

public class ComparaPorHoras implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        // Usamos el Integer.compare porque son valores de Integer.
        return Integer.compare(o1.getHorasTrabajadas(), o2.getHorasTrabajadas());
    }
}
