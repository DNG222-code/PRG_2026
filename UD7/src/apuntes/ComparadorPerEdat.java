package apuntes;

import java.util.*;

public class ComparadorPerEdat implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return Integer.compare(o1.edat, o2.edat);
    }
}
