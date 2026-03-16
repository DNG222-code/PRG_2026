package apunts.colecciones;

public class Cliente {
    String dni;
    String nombre;
    String fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre
                + ", Fecha de nacimiento: " + fechaNacimiento;
    }

}
