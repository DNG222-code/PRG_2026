package exercicis.activitat10pt3;

public class Cliente {

    // Atributs.
    private String nombre;

    // Constructor.
    public Cliente(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }

    // Getter y Setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
