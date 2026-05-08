package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;
import java.util.stream.*;

public class MetodosUtiles {

    // Frame principal para toda la clase.
    static JFrame frmPrincipal = new JFrame();

    public static JFrame crearFrame(String titulo, int anchura, int altura) {
        // Frame principal con el titulo por parametro.
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

        // Botónes del panel superior.
        JButton btnNuevaPartida = new JButton("Nueva Partida");
        JButton btnReiniciarPartida = new JButton("Reiniciar Partida");
        JButton btnSalir = new JButton("Salir");

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
        JLabel lblTurno = new JLabel("Turno de: " + "Jugador " + nombreJugador, JLabel.CENTER);
        JLabel lblInfo = new JLabel("Esperando juegadores...", JLabel.CENTER);
        JLabel lblJugadorX = new JLabel("Jugador X", JLabel.CENTER);
        JLabel lblJugadorO = new JLabel("Jugador O", JLabel.CENTER);

        JPanel pnlTablero = new JPanel(new GridLayout(row, column));

        // Botones del pnlTablero.
        JButton btnS = new JButton();

        // Botones del panel pnlTablero.
        for (int i = 1; i <= numBotones; i++) {
            btnS = new JButton(" ");
            pnlTablero.add(btnS);
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
