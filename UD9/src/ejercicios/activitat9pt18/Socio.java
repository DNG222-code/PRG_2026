package ejercicios.activitat9pt18;

public class Socio implements Comparable<Socio> {

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
        return false;
    }

    @Override
    public int compareTo(Socio o) {
        return 0;
    }

    public void antiguedad() {

    }

    @Override
    public String toString() {
        return "Socio{" + "DNI=" + DNI + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + '}';
    }

    // Getters y setters.
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
