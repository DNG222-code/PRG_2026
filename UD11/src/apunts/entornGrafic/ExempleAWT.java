package apunts.entornGrafic;

import java.awt.*;

public class ExempleAWT {

    public static void dibuixar() {

        Frame frmPrincipal = new Frame("Exemple AWT");

        Button boto = new Button("Fes click");

        frmPrincipal.add(boto);

        frmPrincipal.setSize(300, 200);

        frmPrincipal.setVisible(true);

    }
}
