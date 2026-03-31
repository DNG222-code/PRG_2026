package ud8.ejercicio2;

public interface GestionReservas {

    // Métodos de la Interface de GestionReservas.
    void guardarReservas(Reserva[] reserva, String nombreFichero, boolean sobrescribir);

    Reserva[] leerReservas(String nombreFicheros);
}
