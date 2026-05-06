package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;

public class Contenidors {

    public static JFrame creaFormulari(
            String titol,
            int amplada,
            int altura,
            Component c,
            int tancament,
            boolean visible) {

        // Assignem el titol al formulari.
        JFrame frmFormulari = new JFrame(titol);

        // Assignem el layout.
//        JPanel pnlPrincipal = new JPanel(layout);

//        frmFormulari.add(pnlPrincipal);
        frmFormulari.setSize(amplada, altura);
        frmFormulari.setDefaultCloseOperation(tancament);
        frmFormulari.setLocationRelativeTo(c);
        frmFormulari.setVisible(visible);

        return frmFormulari;
    }
}
