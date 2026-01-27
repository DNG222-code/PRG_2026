package botigaVI;

public class TazaPersonalizada extends ProductoRegalo implements Descontable {

    // Atributos.
    private String mensaje;
    private double descuentoFijo = 0.1;

    // Constructor implementado.
    public TazaPersonalizada(String nombre, double preuBase, String destinatario) {
        super(nombre, preuBase, destinatario);
    }

    // Implementamos todos los métodos y los heredamos.
    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public double calcularPrecioFinal() {
        return Descontable.super.calcularPrecioFinal();
    }

    @Override
    public String getDescripcionFiscal() {
        return super.getDescripcionFiscal();
    }

    @Override
    public double getPrecioBase() {
        return 0;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + ", mensaje: " + mensaje;
    }

    // Sobreescribimos el método equals.
    @Override
    public boolean equals(Object o) {
        return mensaje.equals(this.getNombre());
    }

    // Getters y setters.
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getDescuentoFijo() {
        return descuentoFijo;
    }

    public void setDescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }
}
