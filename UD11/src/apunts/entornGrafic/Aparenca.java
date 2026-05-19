package apunts.entornGrafic;

import javax.swing.*;
import java.awt.*;

public class Aparenca {
    public Aparenca() {

        // LOOK & FEEL

        // UIManager

        // UIManager.setLookAndFeel();

        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.getSystemLookAndFeelClassName();

            String motif = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";

            UIManager.setLookAndFeel(motif);

            UIManager.put("Button.background", Color.CYAN);
            UIManager.put("Button.font", new Font("Arial", Font.BOLD, 18));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        JFrame frmPrincipal = new JFrame();
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setVisible(true);

        JFrame frmSecundari = new JFrame();
        JPanel pnlPrincipal = new JPanel();

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
        box.add(btnTercer);
    }

    public static void mostraLAndF() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getClassName());
        }
    }
}
