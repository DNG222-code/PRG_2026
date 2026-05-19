package apunts.entornGrafic;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Esdeveniments {

    public Esdeveniments() {

        JFrame frmPrincipal = new JFrame("Selector - Esdeveniments");
        JPanel pnlPrincipal = new JPanel();

        /*
        *   ActionListener
        *   MouseListener
        *   KeyListener
        *   KeyListener
        *   WindowListener
        *   ItemListener
        */
        JButton btnAcceptar = new JButton("Acceptar");
        JButton btnCancelar = new JButton("Cancelar");

        btnAcceptar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Clic!");
                    }
        });

        pnlPrincipal.add(btnAcceptar);
        pnlPrincipal.add(btnCancelar);
//        pnlPrincipal.addMouseListener(
//                new MouseAdapter() {
//                    @Override
//                    public void mouseClicked(MouseEvent e) {
//                        System.out.println(e.getX() + ", " + e.getY());
//                    }
//                }
//        );

        JTextField txtNom = new JTextField(20);
        pnlPrincipal.add(txtNom);

//        txtNom.addKeyListener(
//                new KeyAdapter() {
//                    @Override
//                    public void keyReleased(KeyEvent e) {
//                        txtNom.getText();
//                        System.out.println(txtNom.getText());
//                    }
//                }
//        );

        JCheckBox chkValidacio = new JCheckBox();

        chkValidacio.addItemListener(e -> System.out.println(chkValidacio.isSelected()));

        pnlPrincipal.add(chkValidacio);

        frmPrincipal.add(pnlPrincipal);

        frmPrincipal.setSize(300, 200);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
