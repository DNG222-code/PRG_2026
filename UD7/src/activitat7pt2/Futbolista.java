package activitat7pt2;

import java.util.*;

public class Futbolista implements Comparator {
    // Atributos del futbolista
    String dni;
    String nombre;
    int edad;
    int numeroGoles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    // Método toString.
    public String toString() {
        return nombre + "  " + edad + "  " + numeroGoles;
    }

    // Método compare, de Comparator.
    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;

        return f1.nombre.compareTo(f2.nombre);
    }

    // Método equals.
    public boolean equals(Object o) {
        Futbolista f = (Futbolista) o;

        return f.equals(this.dni.equals(f.dni));
    }
}
