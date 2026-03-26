package ejercicios.activitat9pt18;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

// Implementamos la interfaz Comparable y Serializable.
public class Socio implements Comparable<Socio>, Serializable {

    // Atributos.
    private String DNI;
    private String nombre;
    private String fechaAlta;

    // Constructor.
    public Socio(String DNI, String nombre, String fechaAlta) {
        this.setDNI(DNI);
        this.setNombre(nombre);
        this.setFechaAlta(fechaAlta);
    }

    // Métodos obligatorios.
    @Override
    public boolean equals(Object o) {
        // Ordenamos por Nombre por defecto.
        return this.getNombre().equals(((Socio) o).getNombre());
    }

    @Override
    public int compareTo(Socio o) {
        return this.DNI.compareTo(o.DNI); // Ordenamos por DNI.
    }

    // Método para enseñar los años de antiguedad.
    public static void antiguedad(String fechaAlta) {
        // Formateamos la fecha de alta.
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaAltaDate = LocalDate.parse(fechaAlta, formato);
        LocalDate hoy = LocalDate.now(); // Sacamos la fecha actual.

        // Calculamos la diferencia entre la fecha de alta y la actual.
        Period antiguedad = Period.between(fechaAltaDate, hoy);

        // Enseñamos los años de diferencia entre la fecha de alta y la actual.
        System.out.println("Antigüedad: "
                + antiguedad.getYears() + " años, "
                + antiguedad.getMonths() + " meses y "
                + antiguedad.getDays() + " días.");
    }

    // Getter's y Setter's
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
