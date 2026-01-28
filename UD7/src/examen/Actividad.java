package examen;

public interface Actividad {
    // Métodos de la interfaz.
    void trabajar();

    // Devuelve el método calcularRitmo.
    default int trabajarRapido(int ritmo) {
        return calcularRitmo(ritmo);
    }

    static void describirActividad() {
        System.out.println("Describiendo actividad");
    };
    private int calcularRitmo(int ritmo) {
        // Si ritmo es menor a 10, devolvemos el doble.
        if (ritmo < 10) {
            return ritmo * 2;
        } else {
            return ritmo;
        }
    };
}
