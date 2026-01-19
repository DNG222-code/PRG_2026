package repas1;

public class TecnicoMantenimiento extends Empleado implements Mantenible {

    // Heredamos el constructor de la clase padre.
    public TecnicoMantenimiento(String nombre, int idEmpleado) {
        super(nombre, idEmpleado);
    }

    // Implementamos los métodos.
    @Override
    void trabajar() {
        System.out.println("El tecnico trabaja");
    }

    @Override
    public void hacerMantenimiento() {
        System.out.println("El tecnico realiza un mantenimiento");
    }

    @Override
    public void mantenimineto() {
        Mantenible.super.mantenimineto();
    }
}
