package activitat6pt6;

public abstract class Personaje {

    // Atributos.
    String nombre;
    int edad;

    // Constructor.
    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos abstractos.
    public abstract void actuar();

    public abstract void ensenyar();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", edad: " + edad;
    }
}