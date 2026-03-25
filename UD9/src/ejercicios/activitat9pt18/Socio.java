package ejercicios.activitat9pt18;

import java.io.*;

// Implementamos la interfaz Comparable y Serializable.
public class Socio implements Comparable<Socio>, Serializable {

    // Atributos.
    String DNI;
    String nombre;
    String fechaAlta;

    // Constructor.
    public Socio(String DNI, String nombre, String fechaAlta) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    // Métodos obligatorios.
    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int compareTo(Socio o) {
        return 0;
    }

    public void antiguedad() {

    }

    // Método por defecto.
    @Override
    public String toString() {
        return "Socio{" + "DNI=" + DNI + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + '}';
    }
}
