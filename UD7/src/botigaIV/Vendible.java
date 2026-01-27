package botigaIV;

public interface Vendible {
    // Atributo.
    double IVA = 0.21;

    // Métodos de la interfaz.
    double getPrecioBase();
    String getNombre();
    double calcularPrecioFinal();

    // Método default.
    public default String getDescripcionFiscal() {
        return "El precio base es de: " + getPrecioBase()
                + ", El IVA: " + IVA + " y el precio final es: "
                + calcularPrecioFinal();
    }

    // Método statico para redondear a dos decimal.
    public static double redondearPrecio(double precio) {
        return Math.round(precio * 100.0) / 100.0;
    }

    // Método privado.
    private double calcularIVA() {
        return IVA * getPrecioBase();
    }
}
