package apunts.entornGrafic;

import javax.swing.*;
import java.util.*;

public class Selector {

    public Selector() {
        JFrame frmPrincipal = new JFrame();
        JPanel pnlPrincipal = new JPanel();

//        cboilles.addItem("Menorca");
//        cboilles.addItem("Ibiza");
//        cboilles.addItem("Mallorca");
//        cboilles.addItem("Formentera");

        // String[] illes = {"Menorca", "Ibiza", "Mallorca", "Formentera"};

        List<String> illes = List.of("Menorca", "Ibiza", "Mallorca", "Formentera");

//        JList<String> lista = new JList<>();
        JComboBox<String> cboilles = new JComboBox<>();

        for (String illa : illes) {
            cboilles.addItem(illa);
        }

        String illa = (String) cboilles.getSelectedItem();

        cboilles.addActionListener(e -> {
            cboilles.getSelectedItem();
        });

        pnlPrincipal.add(cboilles);

        frmPrincipal.add(pnlPrincipal);

        frmPrincipal.setSize(300, 200);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
