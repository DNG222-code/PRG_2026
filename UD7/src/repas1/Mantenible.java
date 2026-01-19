package repas1;

public interface Mantenible {
    // Métodos de la interfaz.
    void hacerMantenimiento();
    default void mantenimineto() {
        System.out.println("Mantenimiento realizado");
    }
}
