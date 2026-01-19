package repas1;

public abstract class Empleado {
    // Atributos privados.
    private String nombre;
    private int idEmpleado;

    // Constructor.
    public Empleado(String nombre, int idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    // Métodos de la clase.
    abstract void trabajar();
    void fichar() {
        System.out.println("Fichar");
    };

    // Getter y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
