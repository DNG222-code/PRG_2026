package repas1;

public class Piloto extends Empleado implements Volable {

    // Heredamos el constructor de la clase padre.
    public Piloto(String nombre, int idEmpleado) {
        super(nombre, idEmpleado);
    }

    // Implementamos los métodos.
    @Override
    void trabajar() {
        System.out.println("Está volando un avión.");
    }

    @Override
    public void volar() {
        System.out.println("El piloto vuela.");
    }
}
