package apuntes;

import java.util.*;

public class ComparadorBasic implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int ordreDNI = o1.DNI.compareTo(o2.DNI);
        int ordreNom = o1.nom.compareTo(o2.nom);

        return (
            ordreDNI != 0
                ? ordreDNI
                : ordreNom
        );
    }
}
