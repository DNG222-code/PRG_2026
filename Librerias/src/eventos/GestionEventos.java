package eventos;

import javax.swing.*;
import static interfaces.MetodosUtiles.*;

public class GestionEventos {

    public static void turnoJugadores(String nombreJugador) {

        // Declaramos el OptionPane para mostrar el mensaje.
        JOptionPane jop = new JOptionPane();

        // Mostramos el mensaje de que ha empezado el jugador con el ActionListener.
        btnNuevaPartida.addActionListener(
                e -> jop.showMessageDialog(
                        null, "Empieza el Jugador " + nombreJugador)
        );
    }
}
