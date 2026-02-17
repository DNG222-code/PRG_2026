package corregits.practica2;

public class Usuario {

    private String nombre;
    private String apellido;
    private int edad;

    public Usuario(String nombre, String apellido, String edad) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(Integer.parseInt(edad));
    }

    // Métodes Object
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + " || Apellido: " + this.getApellido()
                + " || Edad: " + this.getEdad() + " años.";
    }

    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
