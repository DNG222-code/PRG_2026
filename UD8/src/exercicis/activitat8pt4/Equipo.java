package exercicis.activitat8pt4;

public class Equipo implements Mostrable, Jugable {

    // Atributos de la clase Equipo.
    String nombre;
    String ciudad;
    int[] anyoFundacion;
    Jugador[] jugadores;
    int victorias;

    // Sobreescribimos los métodos de las interfaces Mostrable y Jugable.
    @Override
    public int obtenerPuntuacion() {
        return 0;
    }

    @Override
    public void mostrarDatos() {

    }
}
