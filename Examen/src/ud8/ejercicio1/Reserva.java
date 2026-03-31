package ud8.ejercicio1;

public class Reserva {

    // Atributos encapsulados
    private String nombreCliente;
    private int numeroHabitacion;
    private int noches;
    private TipoHabitacion tipoHabitacion;
    double precioNoche;

    // Constructor
    public Reserva(String nombreCliente, int numeroHabitacion, int noches, TipoHabitacion tipoHabitacion,
        double precioNoche){
        this.setNombreCliente(nombreCliente);
        this.setNumeroHabitacion(numeroHabitacion);
        this.setNoches(noches);
        this.setTipoHabitacion(tipoHabitacion);
        this.setPrecioNoche(precioNoche);

        // Condición para verificar si cumple la condición de reserva.
        if (noches < 0 || precioNoche < 0) {
            // Si no cumple saltará nuestra propia excepción.
            throw new ReservaInvalidaException("Error: Los datos de la reserva no son válidos: ");
        }
    }

    // Métodos de la propia clase
    double calcularImporteTotal() {
        // Calculamos el importe total.
        return this.getNoches() * this.getPrecioNoche();
    }

    // Sobreescribimos el método toString()
    @Override
    public String toString() {
        return "Cliente: " + this.getNombreCliente() + " \nHabitación: " + this.getNumeroHabitacion() +
                " \nNoches: " + this.getNoches() + " \nTipo: " + this.getTipoHabitacion() +
                " \nPrecio noche: " + this.getPrecioNoche() + " \nImporte total: ";
    }

    // Getters y (Setters privados)
    public String getNombreCliente() {
        return nombreCliente;
    }

    private void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    private void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNoches() {
        return noches;
    }

    private void setNoches(int noches) {
        this.noches = noches;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    private void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    private void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
}
