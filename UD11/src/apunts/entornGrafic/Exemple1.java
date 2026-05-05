package apunts.entornGrafic;

import javax.swing.*;

public class Exemple1 {

    // FORMULARI PRINCIPAL
    static JFrame frmPrincipal = new JFrame("Gili Formulari");

    // BOTTO
    // JButton
    static JButton btnBoto = new JButton("Fes click");

    // JRadioButton
    static JRadioButton rbtOption = new JRadioButton("Radio Button");

    // ETIQUETA
    // JLabel
    static JLabel lblEtiqueta = new JLabel("Etiqueta: ");

    // TEXTS
    // JTextField
    static JTextField txtText = new JTextField(20);

    // JTextArea
    static JTextArea txtArea = new JTextArea(5, 20);

    // JPasswordField
    static JPasswordField txpPass = new JPasswordField(20);

    // BOXS
    // JCheckBox
    static JCheckBox chkBox = new JCheckBox("Validació");

    // JComboBox
    static JComboBox<String> cmbBox = new JComboBox<>(
            new String[] {"Maó", "Ciutadella","Es Castell"}
    );

    // JList
    static JList lstLista = new JList<String>(
            new String[] {"Maó", "Ciutadella","Es Castell"}
    );

    public static void dibuixa() {

//        btnBoto.addActionListener(e ->
//                JOptionPane.showMessageDialog(null, "Boquepasa!"));
//
//        btnBoto.addActionListener(e -> System.out.println("Boquepasa!"));

//        btnBoto.addActionListener(e -> System.out.println(frmPrincipal.getWidth()));

//        btnBoto.addActionListener(e -> mostrarAltura());

        // Afegim els controls al formulari principal.

        // BOTTO
        frmPrincipal.add(btnBoto);

        frmPrincipal.add(rbtOption);

        // ETIQUETA
        frmPrincipal.add(lblEtiqueta);

        // TEXTS
        frmPrincipal.add(txtText);

        frmPrincipal.add(txtArea);

        frmPrincipal.add(txpPass);

        // BOXS
        frmPrincipal.add(chkBox);
        frmPrincipal.add(cmbBox);

        // JList
        frmPrincipal.add(lstLista);

// ---------------------------------------------------------------------------------

        // Ajustem els controls.
        frmPrincipal.setSize(300, 200);

        frmPrincipal.setLocationRelativeTo(null);

        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmPrincipal.setVisible(true);

    }

//    public static void mostrarMensaje() {
//        JOptionPane.showMessageDialog(null, "Has fet click!");
//    }

    public static void mostrarAltura() {
        System.out.println("Altura: " + frmPrincipal.getWidth());
    }
}
