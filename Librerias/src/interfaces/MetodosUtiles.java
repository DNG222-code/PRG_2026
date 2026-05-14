package interfaces;

// Imports de clases de mis proyectos y de java.
import activitats.activitat11pt3.TresEnRayaUI;
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

    // Declaramos nuevo botón para ir añadiendo uno por uno, cada uno diferente.
    public static JButton botonTablero;
    public static JButton botonPulsado;

    // Array para guardar los botones del tablero.
    public static JButton[][] botonesTablero = new JButton[3][3];

    // Variables globales.
    public static String nombreJugador;

    // Array para los cuadrados de la tabla.
    public static String[][] cuadrados;

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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // Declaramos nuevo botón para ir añadiendo uno por uno, cada uno diferente.
                botonTablero = new JButton();

                // Guardamos el botón dentro del array.
                botonesTablero[i][j] = botonTablero;

                // ActionListener para poder pulsar los botones.
                botonTablero.addActionListener(e -> {
                    botonPulsado = (JButton) e.getSource();

                    // Al pulsar un botón, se marca con el jugador actual.
                    botonPulsado.setText(TresEnRayaUI.nombreJugador);

                    // Dejamos el botón desactivado para que no se pueda volver a pulsar.
                    botonPulsado.setEnabled(false);

                    // Comprobamos si hay ganador.
                    if (comprobarGanador()) {
                        lblInfo.setText("Ha ganado el jugador " + TresEnRayaUI.nombreJugador);
                        lblTurno.setText("Partida finalizada");
                        bloquearTablero();
                    } else {
                        // Cambiamos automáticamente el turno al siguiente jugador.
                        TresEnRayaUI.cambiarTurnoJugador();

                        // Actualizamos la etiqueta del turno.
                        lblTurno.setText("Turno de: Jugador " + TresEnRayaUI.nombreJugador);
                    }
                });

                // Añadimos los botones del tablero al panel.
                pnlTablero.add(botonTablero);
            }
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

    public static boolean comprobarGanador() {
        // Comprobar filas.
        for (int i = 0; i < 3; i++) {
            if (!botonesTablero[i][0].getText().isEmpty()
                    && botonesTablero[i][0].getText().equals(botonesTablero[i][1].getText())
                    && botonesTablero[i][0].getText().equals(botonesTablero[i][2].getText())) {
                return true;
            }
        }

        // Comprobar columnas.
        for (int i = 0; i < 3; i++) {
            if (!botonesTablero[0][i].getText().isEmpty()
                    && botonesTablero[0][i].getText().equals(botonesTablero[1][i].getText())
                    && botonesTablero[0][i].getText().equals(botonesTablero[2][i].getText())) {
                return true;
            }
        }

        // Comprobar diagonal principal.
        if (!botonesTablero[0][0].getText().isEmpty()
                && botonesTablero[0][0].getText().equals(botonesTablero[1][1].getText())
                && botonesTablero[0][0].getText().equals(botonesTablero[2][2].getText())) {
            return true;
        }

        // Comprobar diagonal secundaria.
        if (!botonesTablero[0][2].getText().isEmpty()
                && botonesTablero[0][2].getText().equals(botonesTablero[1][1].getText())
                && botonesTablero[0][2].getText().equals(botonesTablero[2][0].getText())) {
            return true;
        }

        return false;
    }

    // Método para dejar marcado los botones al ganar la partida.
    private static void bloquearTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesTablero[i][j].setEnabled(false);
            }
        }
    }
}
