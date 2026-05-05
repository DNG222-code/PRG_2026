package apunts.entornGrafic;

import javax.swing.*;

public class ExempleComponents {

    static JFrame frmPrincipal = new JFrame("Exemple Components");
    static JPanel pnlPrincipal = new JPanel();

    static JPanel pnlUsuario = new JPanel();
    static JPanel pnlBotons = new JPanel();

    static JLabel lblNom = new JLabel("Nom: ");
    static JTextField txtNom = new JTextField(10);
    static JButton btnEnviar = new JButton("Enviar");
    static JButton btnCrear = new JButton("Crear Boton");

    public static void components() {

        pnlUsuario.add(lblNom);
        pnlUsuario.add(txtNom);

        pnlUsuario.add(btnEnviar);
        pnlUsuario.add(btnCrear);
        btnCrear.addActionListener(e -> {
            for (int i = 0; i < 10; i++) {
                crearBoton();
            }
        });
        btnEnviar.addActionListener(e -> enviar());
        pnlPrincipal.add(pnlBotons);

        frmPrincipal.add(pnlUsuario);

        frmPrincipal.setSize(300, 150);

        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setVisible(true);

    }

    public static void enviar() {
        System.out.println("Has enviat: " + txtNom.getText());
    }

    public static void crearBoton() {
        JButton btn = new JButton("Boton");

        pnlUsuario.add(btn);
    }
}
