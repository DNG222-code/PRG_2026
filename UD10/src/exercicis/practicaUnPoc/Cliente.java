package exercicis.practicaUnPoc;

public class Cliente {

    // Atributs.
    private String nombre;

    // Constructor.
    public Cliente(String nombre) {
        this.setNombre(nombre);
    }

    Saludo<Cliente> saludoCliente = cliente ->
            "Bienvenido cliente " + cliente.getNombre() + "!";

    // Getter y Setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
