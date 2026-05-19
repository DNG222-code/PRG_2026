package apunts.menus;

import javax.swing.*;
import java.awt.event.*;

public class Menus {

    /*
    *   JMenuBar
    *   JMenu
    *   JMenuItem
    *   JCheckBoxMenuItem
    *   JSeparator
    */

    public Menus() {
        JFrame frmPrincipal = new JFrame("Menú");
        JPanel pnlPrincipal = new JPanel();

        // Menú
        JMenuBar mnbMenuPrincipal = new JMenuBar();

        JMenu mnuFitxer = new JMenu("Fitxer");
        JMenu mnuFitxerTipus = new JMenu("Tipus");

        pnlPrincipal.add(mnbMenuPrincipal);

        JMenuItem mniNou = new JMenuItem("Nou");
        JMenuItem mniSortir = new JMenuItem("Sortir");

        JMenuItem mniFitxerTipusBinari = new JMenuItem("Binari");
        JMenuItem mniFitxerTipusText = new JMenuItem("Text");

        mnuFitxer.add(mniNou);
        mnuFitxer.addSeparator();
        mnuFitxer.add(mniSortir);
        mnbMenuPrincipal.add(mnuFitxer);

        // Esdeveniments
        mniSortir.addActionListener(e -> System.exit(0));
        mnuFitxer.addActionListener(e -> System.out.println("Ha afegit un nou fitxer."));

        // Teclat
        mniSortir.setAccelerator(
                KeyStroke.getKeyStroke("control Q")
        );

        mniSortir.setMnemonic('S');

        mnbMenuPrincipal.add(mniSortir);
        mnbMenuPrincipal.add(mnuFitxer);

        mnuFitxerTipus.add(mniFitxerTipusText);
        mnuFitxerTipus.add(mniFitxerTipusBinari);

        frmPrincipal.setJMenuBar(mnbMenuPrincipal);
        frmPrincipal.add(pnlPrincipal);

        frmPrincipal.setSize(600, 400);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
