package examen;

public class Cajero extends Empleado implements Actividad {
    // Atributos encapsulados.
    private int tickets;
    private int velocidad;

    // Constructor
    public Cajero(int tickets, int velocidad) {
        this.tickets = tickets;
        this.velocidad = velocidad;
    }

    // Método de la clase Cajero.
    void cobrar() {
        tickets++; // Incrementa número de tickets.
    }

    // Sobreescribimos el método toString().
    @Override
    public String toString() {
        return "Tickets: " + getTickets() + "\n" +
                "Velocidad: " + this.velocidad;
    }

    // Implementamos y heredamos los métodos.
    @Override
    public void trabajar() {
        System.out.println("El cajero está trabajando.");
    }

    @Override
    public int trabajarRapido(int ritmo) {
        return Actividad.super.trabajarRapido(ritmo);
    }

    @Override
    void habilidadEspecial() {
        System.out.println("Recupera energía y suma 5 hores.");
    }

    @Override
    public void descripcion() {
        System.out.println("El cajero está ocupado.");
    }

    // Getter de Tickets.
    public int getTickets() {
        return tickets;
    }

    // Setter de velocidad
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
