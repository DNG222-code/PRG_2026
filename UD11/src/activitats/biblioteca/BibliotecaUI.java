package activitats.biblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BibliotecaUI {

    // Atributs.
    private JFrame frmPrincipal;
    private JPanel pnlPrincipal;
    private JTextField txtTitol;
    private JTextField txtAutor;
    private JTextField txtAny;
    private JCheckBox chkNovella;
    private JCheckBox chkCiencia;
    private JCheckBox chkHistoria;
    private JCheckBox chkInformatica;
    private JComboBox<String> cboDisponible;
    private ArrayList<Llibre> colLlibres;
    private JList<Llibre> lstLlibres;
    private JLabel lblEstat;
    private GestorBiblioteca gestor;
    private int contadorId = 1;

    // Constructor.
    public BibliotecaUI(ArrayList<Llibre> colLlibres) {
        this.colLlibres = colLlibres;
        this.gestor = new GestorBiblioteca();
    }

    // Mètodes de la clase.
    private void configurarLookAndFeel() {

    }

    private void crearInterficie() {
        frmPrincipal = new JFrame("Biblioteca");
        pnlPrincipal = new JPanel();
        frmPrincipal.setContentPane(pnlPrincipal);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.pack();
        frmPrincipal.setVisible(true);
    }

    private void crearMenu() {

    }

    private void afegirLlibre() {
        JButton btnAfegir = new JButton("Afegir Llibre");
        pnlPrincipal.add(btnAfegir, BorderLayout.NORTH);
    }

    private String obtenirCategoria() {
        return null;
    }

    private void actualitzarLlista() {

    }

    private void eliminarLlibre() {

    }

    private void netejarFormulari() {

    }

    private void refrescarJList() {
        lstLlibres.setListData(colLlibres.toArray(new Llibre[0]));
    }

    // Getters i setters.
    public JFrame getFrmPrincipal() {
        return frmPrincipal;
    }

    public void setFrmPrincipal(JFrame frmPrincipal) {
        this.frmPrincipal = frmPrincipal;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void setPnlPrincipal(JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
    }

    public JTextField getTxtTitol() {
        return txtTitol;
    }

    public void setTxtTitol(JTextField txtTitol) {
        this.txtTitol = txtTitol;
    }

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JTextField getTxtAny() {
        return txtAny;
    }

    public void setTxtAny(JTextField txtAny) {
        this.txtAny = txtAny;
    }

    public JCheckBox getChkNovella() {
        return chkNovella;
    }

    public void setChkNovella(JCheckBox chkNovella) {
        this.chkNovella = chkNovella;
    }

    public JCheckBox getChkCiencia() {
        return chkCiencia;
    }

    public void setChkCiencia(JCheckBox chkCiencia) {
        this.chkCiencia = chkCiencia;
    }

    public JCheckBox getChkHistoria() {
        return chkHistoria;
    }

    public void setChkHistoria(JCheckBox chkHistoria) {
        this.chkHistoria = chkHistoria;
    }

    public JCheckBox getChkInformatica() {
        return chkInformatica;
    }

    public void setChkInformatica(JCheckBox chkInformatica) {
        this.chkInformatica = chkInformatica;
    }

    public JComboBox<String> getCboDisponible() {
        return cboDisponible;
    }

    public void setCboDisponible(JComboBox<String> cboDisponible) {
        this.cboDisponible = cboDisponible;
    }

    public JList<Llibre> getLstLlibres() {
        return lstLlibres;
    }

    public void setLstLlibres(JList<Llibre> lstLlibres) {
        this.lstLlibres = lstLlibres;
    }

    public JLabel getLblEstat() {
        return lblEstat;
    }

    public void setLblEstat(JLabel lblEstat) {
        this.lblEstat = lblEstat;
    }

    public GestorBiblioteca getGestor() {
        return gestor;
    }

    public void setGestor(GestorBiblioteca gestor) {
        this.gestor = gestor;
    }

    public int getContadorId() {
        return contadorId;
    }

    public void setContadorId(int contadorId) {
        this.contadorId = contadorId;
    }

    public ArrayList<Llibre> getColLlibres() {
        return colLlibres;
    }

    public void setColLlibres(ArrayList<Llibre> colLlibres) {
        this.colLlibres = colLlibres;
    }
}
