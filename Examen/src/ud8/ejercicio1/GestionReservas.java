package ud8.ejercicio1;

public interface GestionReservas {

    // Métodos de la Interface de GestionReservas.
    void guardarReserva(Reserva reserva, String nombreFichero, boolean sobrescribir);

    Reserva[] leerReservas(String nombreFicheros);
}
