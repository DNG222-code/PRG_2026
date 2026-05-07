package apunts.entornGrafic;


// GridLayout
// GridLayout(2, 3)


import javax.swing.*;
import java.awt.*;

public class ExempleGridLayout {

    // Constructor de la clase.
    public ExempleGridLayout() {
        String titol = "Exemple GridLayout";
        JFrame frmPrincipal = Contenidors.creaFormulari(titol, 400, 200, null, JFrame.EXIT_ON_CLOSE, true);

        JPanel pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new GridLayout(2, 3, 20, 10)); // En GridLayout se usa el método setLayout.

        for (int i = 1; i <= 6; i++) {
            pnlPrincipal.add(new JButton("btn_" + i));
        }

        frmPrincipal.add(pnlPrincipal);

        frmPrincipal.setVisible(true);
    }
}
