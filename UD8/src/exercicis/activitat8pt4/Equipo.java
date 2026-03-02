package exercicis.activitat8pt4;

import java.util.*;

public class Equipo implements Mostrable, Jugable {

    // Atributos de la clase Equipo.
    private String nombre;
    private String ciudad;
    private int[] anyoFundacion;
    private Jugador[] jugadores;
    private int victorias;

    // Constructor.
    public Equipo(String nombre, String ciudad) {
        setNombre(nombre);
        setCiudad(ciudad);
    }

    // Pedimos al usuario el nombre del equipo.
    public static void crearEquipo(Torneo torneo) {
        // Declaramos las variables necesarias.
        Scanner sc = new Scanner(System.in);


    }

    // Sobreescribimos los métodos de las interfaces Mostrable y Jugable.
    @Override
    public int obtenerPuntuacion() {
        return 0;
    }

    @Override
    public void mostrarDatos() {

    }

    // Getter & Setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int[] getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(int[] anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
