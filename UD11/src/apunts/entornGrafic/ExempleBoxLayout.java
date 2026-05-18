package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;

public class ExempleBoxLayout {

    // BOX LAYOUT

    public ExempleBoxLayout() {

        // BoxLayout.X_AXIS - Horitzontal
        // BoxLayout.Y_AXIS - Vertical

        JFrame frmPrincipal = new JFrame("Exemple Box Layout");
        JPanel pnlPrincipal = new JPanel();
//        pnlPrincipal.setLayout(
//                new BoxLayout(pnlPrincipal, BoxLayout.X_AXIS)
//        );
        JButton btnPrimer = new JButton("Botó 1");
        JButton btnSegon = new JButton("Botó 2");
        JButton btnTercer = new JButton("Botó 3");

        Component vs0 = Box.createVerticalStrut(10);
        Component vs1 = Box.createVerticalStrut(10);
        Component vs2 = Box.createVerticalStrut(10);

        Component hs1 = Box.createHorizontalStrut(20);

        Box box = Box.createVerticalBox();
        box.add(btnPrimer);
        box.add(btnSegon);

//        pnlPrincipal.add(vs0);
//        pnlPrincipal.add(btnPrimer);
//        pnlPrincipal.add(Box.createHorizontalGlue());
//        pnlPrincipal.add(vs1);
//        pnlPrincipal.add(btnSegon);
//        pnlPrincipal.add(hs1);
//        pnlPrincipal.add(vs2);
//        pnlPrincipal.add(btnTercer);

        frmPrincipal.add(pnlPrincipal);
        frmPrincipal.setSize(300, 300);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
    }
}
