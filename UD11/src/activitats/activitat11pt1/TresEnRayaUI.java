package activitats.activitat11pt1;

// Importamos la clase de la librería.
import static apunts.entornGrafic.MetodosUtiles.*;

public class TresEnRayaUI {

    public static void EjecutarPrograma() {

        // Llamamos los métodos de la librería.
        crearFrame("Tres en Raya", 500, 500);

        // Paneles con control
        panelControlesSuperior();
        panelControlesInferior("Jugador X", 3, 3, 9);

    }
}
