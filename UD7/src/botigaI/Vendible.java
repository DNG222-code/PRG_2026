package botigaI;

public interface Vendible {
    // Atributo.
    double IVA = 0.21;

    // Métodos de la interfaz.
    double getPrecioBase();
    String getNombre();
    double calcularPrecioFinal();
}
