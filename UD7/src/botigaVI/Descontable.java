package botigaVI;

public interface Descontable extends Vendible {
    // Declaramos método.
    double getDescuento();

    // Sobreescribimos calcularPrecioFinal.
    @Override
    default double calcularPrecioFinal() {
        return getPrecioBase() - getDescuento();
    }
}
