package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;

// BorderLayout
// 5 zones

//          NORTH
//  WEST    CENTER     EAST
//          SOUTH

// NORTH: Van dalt y ocupen tota s'amplaria.
// SOUTH: Baix y tota s'amplaria.
// EAST: Dret y ocupa tota la alçada que pugi.
// WEST: Lo mateix pero a la esquerra.
// CENTER: Ocupa tot s'espai que els altres han deixat. Es el protagonista.

// Només podem posar un component per zona.
// Hi ha que posar un panel per que es pugin posar dos.

public class ExempleBorderLayout {

    public ExempleBorderLayout() {

//        JFrame frmPrincipal = new JFrame("Exemple Border Layout");
        String titol = "Exemple BorderLayout";
        JFrame frmPrincipal = Contenidors.creaFormulari(titol, 400, 300, null, JFrame.EXIT_ON_CLOSE, true);
        JPanel pnlPrincipal = new JPanel(new BorderLayout());

        pnlPrincipal.add(new JButton("NORD"), BorderLayout.NORTH);
        pnlPrincipal.add(new JButton("SUD"), BorderLayout.SOUTH);
        pnlPrincipal.add(new JButton("EAST"), BorderLayout.EAST);
        pnlPrincipal.add(new JButton("WEST"), BorderLayout.WEST);
        pnlPrincipal.add(new JButton("CENTER"), BorderLayout.CENTER);

        frmPrincipal.add(pnlPrincipal);

        frmPrincipal.setVisible(true);
    }
}
