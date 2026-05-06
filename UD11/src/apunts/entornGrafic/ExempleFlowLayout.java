package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;

public class ExempleFlowLayout {

    // esquerra a dreta
    // salt de linea
    // centrat

    public ExempleFlowLayout() {

        JFrame frmPrincipal = new JFrame("Exemple FlowLayout");
        JPanel pnlPrincipal = new JPanel(new FlowLayout());

        pnlPrincipal.add(new JButton("Uno"));
        pnlPrincipal.add(new JButton("Dos"));
        pnlPrincipal.add(new JButton("Tres"));
        pnlPrincipal.add(new JButton("Quatre"));
        pnlPrincipal.add(new JButton("Cinc"));
        pnlPrincipal.add(new JButton("Sis"));

        frmPrincipal.add(pnlPrincipal);
        frmPrincipal.setSize(300, 200);
        frmPrincipal.setVisible(true);
    }
}
