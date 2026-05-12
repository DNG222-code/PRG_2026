package interfaces;

// Imports de clases de mis proyectos y de java.
import activitats.activitat11pt2.TresEnRayaUI;
import javax.swing.*;
import java.awt.*;
import java.util.stream.*;

public class MetodosUtiles {

    // Frame principal para toda la clase.
    public static JFrame frmPrincipal = new JFrame();

    // Botónes del panel superior.
    public static JButton btnNuevaPartida = new JButton("Nueva Partida");
    public static JButton btnReiniciarPartida = new JButton("Reiniciar Partida");
    public static JButton btnSalir = new JButton("Salir");

    // Variables globales.
    public static String nombreJugador;

    public static JFrame crearFrame(String titulo, int anchura, int altura) {
        // Frame principal con el título por parámetro.
        frmPrincipal = new JFrame(titulo);

        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setSize(anchura, altura);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setLayout(new BorderLayout());

        return frmPrincipal;
    }

    // Paneles de controles de Programas básicos.
    public static JPanel panelControlesSuperior() {
        // Panel superior.
        JPanel pnlControles = new JPanel(new FlowLayout());

        // Añadimos los botones al panel Controles.
        Stream.of(
                    btnNuevaPartida,
                    btnReiniciarPartida,
                    btnSalir
                )
                .forEach(pnlControles::add);

        // Añadir el panel de Controles al frame principal.
        frmPrincipal.add(pnlControles, BorderLayout.NORTH);

        return pnlControles;
    }

    public static JPanel panelControlesInferior(String nombreJugador, int row, int column, int numBotones) {
        // Panel inferior.
        JPanel pnlJuego = new JPanel(new BorderLayout());

        // Etiqueta del panel inferior.
        JLabel lblTurno = new JLabel("Turno de: " + "Jugador " + TresEnRayaUI.nombreJugador, JLabel.CENTER);
        JLabel lblInfo = new JLabel("Esperando jugadores...", JLabel.CENTER);
        JLabel lblJugadorX = new JLabel("Jugador X", JLabel.CENTER);
        JLabel lblJugadorO = new JLabel("Jugador O", JLabel.CENTER);

        // Declaramos el panel del tablero.
        JPanel pnlTablero = new JPanel(new GridLayout(row, column));

        // Botones del panel pnlTablero.
        for (int i = 1; i <= numBotones; i++) {
            // Declaramos nuevo botón para ir añadiendo uno por uno, cada uno diferente.
            JButton botonTablero = new JButton();

            // ActionListener para poder pulsar los botones.
            botonTablero.addActionListener(e -> {
                JButton botonPulsado = (JButton) e.getSource();

                // Al pulsar un botón, se marca con el jugador actual.
                botonPulsado.setText(TresEnRayaUI.nombreJugador);

                // Dejamos el botón desactivado para que no se pueda volver a pulsar.
                botonPulsado.setEnabled(false);

                // Cambiamos automáticamente el turno al siguiente jugador.
                TresEnRayaUI.cambiarTurnoJugador();

                // Actualizamos la etiqueta del turno.
                lblTurno.setText("Turno de: Jugador " + TresEnRayaUI.nombreJugador);
            });

            // Añadimos los botones del tablero al panel.
            pnlTablero.add(botonTablero);
        }

        // BorderLayout's de los paneles.
        // Añadimos cada elemento en su posición.
        pnlJuego.add(lblTurno, BorderLayout.NORTH);
        pnlJuego.add(lblInfo, BorderLayout.SOUTH);
        pnlJuego.add(lblJugadorO, BorderLayout.WEST);
        pnlJuego.add(lblJugadorX, BorderLayout.EAST);
        pnlJuego.add(pnlTablero, BorderLayout.CENTER);

        // Añadir el panel de Controles al frame principal.
        frmPrincipal.add(pnlJuego, BorderLayout.CENTER);

        frmPrincipal.revalidate();
        frmPrincipal.repaint();
        frmPrincipal.setVisible(true);

        return pnlJuego;
    }
}
