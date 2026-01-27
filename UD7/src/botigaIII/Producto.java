package botigaIII;

public class Producto implements Vendible {

    // Atributos encapsulados.
    private String nombre;
    private double precioBase;

    // Constructor con todos los atributos.
    public Producto(String nombre, double precioBase) {
        this.setNombre(nombre);
        this.setPrecioBase(precioBase);
    }

    // Implementamos todos los métodos de la interfaz Vendible.
    @Override
    public double getPrecioBase() {
        return 0;
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public double calcularPrecioFinal() {
        return 0;
    }

    @Override
    public String getDescripcionFiscal() {
        return Vendible.super.getDescripcionFiscal();
    }

    // toString.
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + '}';
    }

    @Override
    public boolean equals(Object o) {
        return getNombre().equals(this.getNombre());
    }

    // Getters y Setters.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
