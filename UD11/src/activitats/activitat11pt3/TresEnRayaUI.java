package activitats.activitat11pt3;

// Imports de clases de mis proyectos y de java.

import javax.swing.*;

import static eventos.GestionEventos.turnoJugadores;
import static interfaces.MetodosUtiles.*;

public class TresEnRayaUI {

    public static String nombreJugador = "X";

    // Método para introducir el nombre del jugador al Juego.
    public static void introducirNombreJugador() {
    // Pedimos el nombre del jugador por InputDialog y lo guardamos en nombreJugador.
    nombreJugador = JOptionPane.showInputDialog("Introduce el jugador que empieza: X/O");

    if (nombreJugador == null || nombreJugador.isBlank()) {
        nombreJugador = "X";
    } else {
        nombreJugador = nombreJugador.toUpperCase();
    }

    if (!"X".equals(nombreJugador) && !"O".equals(nombreJugador)) {
        nombreJugador = "X";
    }
}

    // Método para cambiar el turno del jugador.
    public static void cambiarTurnoJugador() {
    if ("X".equals(nombreJugador)) {
        nombreJugador = "O";
    } else if ("O".equals(nombreJugador)) {
        nombreJugador = "X";
    }
}

    public static void EjecutarPrograma() {

        // Introducimos el nombre del jugador.
        introducirNombreJugador();

        // Llamamos los métodos de la librería.
        crearFrame("Tres en Raya", 500, 500);

        // Paneles con control
        panelControlesSuperior();
        panelControlesInferior(nombreJugador, 3, 3, 9);

        // Llamamos métodos para los ActionListener.
        turnoJugadores(nombreJugador);

    }
}
