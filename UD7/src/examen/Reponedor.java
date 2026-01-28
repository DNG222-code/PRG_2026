package examen;

public class Reponedor extends Cajero {
    // Atributo encapsulado.
    private int productosRepuestos;

    // Implementamos el constructor de la subclase.
    public Reponedor(int tickets, int velocidad, int productosRepuestos) {
        super(tickets, velocidad);
        this.setProductosRepuestos(productosRepuestos);
    }

    // Método de la clase Reponedor.
    void reponer() {
        System.out.println("Está reponiendo.");
    }

    // Sobreescribimos el método toString().
    @Override
    public String toString() {
        return "Tickets: " + getTickets() + "\n" +
                "Productos Repuestos: " + getProductosRepuestos();
    }

    // Sobreescribimos el método habilidadEspecial.
    @Override
    void habilidadEspecial() {
        System.out.println("Aumenta su eficiencia y suma 3 productos repuestos.");
    }

    // Getter y Setter
    public int getProductosRepuestos() {
        return productosRepuestos;
    }

    public void setProductosRepuestos(int productosRepuestos) {
        this.productosRepuestos = productosRepuestos;
    }
}
