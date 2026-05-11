package activitats.activitat11pt2;

import static eventos.GestionEventos.*;
import static interfaces.MetodosUtiles.*;

public class TresEnRayaUI {

    public static void EjecutarPrograma() {

        // Llamamos los métodos de la librería.
        crearFrame("Tres en Raya", 500, 500);

        // Paneles con control
        panelControlesSuperior();
        panelControlesInferior(" X", 3, 3, 9);

        // Llamamos métodos para los ActionListener.
        turnoJugadores("X");

    }
}
