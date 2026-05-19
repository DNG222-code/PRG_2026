package apunts.entornGrafic;

import apunts.menus.Menus;

import javax.swing.*;
import javax.swing.SwingUtilities;

public class Test {

    public static void main(String[] args) {

        // ENTORN GRÀFIC

        // GUI
        // GRAPHICAL USER INTERFACE

        // COMPONENTS
        // - CONTROLS
        // - CONTENIDORS

        // LLIBRERIES
        // - AWT : versió antiga.
        // - Swing : És més modern y és compatible en cualsevol sistema.
        // - JavaX

        // AWT: Abstract Window Toolkit

        // Repàs de Contenidors
        //  - JFrame frmNom
        //  - JPanel pnlNom
        //  - JScrollPane spnNom
        //  - JTabbedPane tbpNom
        //  - JDialog dlgNom

        // Layouts
        // Gestor de disseny

        // FlowLayout
        // BorderLayout
        // GridLayout

//        new ExempleFlowLayout();

//        SwingUtilities.invokeLater(() -> new ExempleBorderLayout());
//        SwingUtilities.invokeLater(() -> new ExempleGridLayout());

//        Exemple1.dibuixa();

//        ExempleComponents.components();

//        ExempleAWT.dibuixar();

//        SwingUtilities.invokeLater(() -> new ExempleBoxLayout());

//        Aparenca.mostraLAndF();

//        SwingUtilities.invokeLater(() -> new Selector());

//        SwingUtilities.invokeLater(() -> {
//            new Esdeveniments();
//        });

        SwingUtilities.invokeLater(() -> {
            new Menus();
        });
    }
}
