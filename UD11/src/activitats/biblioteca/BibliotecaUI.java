package activitats.biblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BibliotecaUI {

    // Atributs de sa clase.
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
    private JLabel lblEstat = new JLabel("Sistema preparat");
    private GestorBiblioteca gestor;
    private int contadorId = 1;

    // Constructor.
    public BibliotecaUI(ArrayList<Llibre> colLlibres) {
        this.colLlibres = colLlibres;
        this.gestor = new GestorBiblioteca();
        crearInterficie();
    }

    // Mètodes de la clase.
    private void configurarLookAndFeel() {

    }

    private void crearInterficie() {
        // Cridem el mètodo de initzalitzarComponents.
        initzialitzarComponents();

        // Declarem el Frame i el Panel principal.
        frmPrincipal = new JFrame("Biblioteca");
        pnlPrincipal = new JPanel();

        // Creem panels per cada part del programa, perquè no hi hagi remplaços.
        JPanel pnlNorth = new JPanel();
        JPanel pnlWest = new JPanel();
        JPanel pnlCenter = new JPanel();
        JPanel pnlSouth = new JPanel();

        // Botó per a afegir un llibre.
        JButton btnAfegir = new JButton("Afegir Llibre");

        // Cridem els mètodes amb els botons de la part North.
        afegirLlibre(pnlNorth, btnAfegir);
        eliminarLlibre(pnlNorth);

        // Botons principals de la part de dalt.
        JButton btnGuardar = new JButton("Guardar");
        pnlNorth.add(btnGuardar, BorderLayout.NORTH);

        JButton btnCarregar = new JButton("Carregar");
        pnlNorth.add(btnCarregar, BorderLayout.NORTH);

        // Categories per BorderLayout WEST.
        pnlWest.add(this.getChkNovella(), BorderLayout.WEST);
        pnlWest.add(this.getChkCiencia(), BorderLayout.WEST);
        pnlWest.add(this.getChkHistoria(), BorderLayout.WEST);
        pnlWest.add(this.getChkInformatica(), BorderLayout.WEST);

        // Cridem el mètode per a crear el formulari y posarlo al centre.
        netejarFormulari(pnlCenter, btnAfegir);

        // Categories per BorderLayout SOUTH.
        pnlSouth.add(this.getLblEstat(), BorderLayout.SOUTH);

        // Afegim els panels al panel principal.
        pnlPrincipal.add(pnlNorth, BorderLayout.NORTH);
        pnlPrincipal.add(pnlWest, BorderLayout.WEST);
        pnlPrincipal.add(pnlCenter, BorderLayout.CENTER);
        pnlPrincipal.add(pnlSouth, BorderLayout.SOUTH);

        // Afegim el panel principal al frame principal.
        frmPrincipal.add(pnlPrincipal);

        // Funcionalitats bàsiques del frame principal.
        frmPrincipal.setSize(600, 400);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrincipal.setVisible(true);
    }

    private void initzialitzarComponents() {
        // Asignem valors als components per a que no doni error de null.
        txtTitol = new JTextField(20);
        txtAutor = new JTextField(20);
        txtAny = new JTextField(6);

        chkNovella = new JCheckBox("Novel·la");
        chkCiencia = new JCheckBox("Ciència");
        chkHistoria = new JCheckBox("Història");
        chkInformatica = new JCheckBox("Informàtica");

        cboDisponible = new JComboBox<>(new String[]{"Disponible", "No disponible"});

        // Declarem la llista de llibres.
        lstLlibres = new JList<>();

        // Refrescar la llista de llibres.
        refrescarJList();
    }

    private void crearMenu() {

    }

    private void afegirLlibre(JPanel pnlNorth, JButton btnAfegir) {
        // Afegim el botó d'afegir llibre al North.
        pnlNorth.add(btnAfegir, BorderLayout.NORTH);
    }

    private String obtenirCategoria() {
        return null;
    }

    private void actualitzarLlista() {

    }

    private void eliminarLlibre(JPanel pnlNorth) {
        // Botó per a eliminar un llibre.
        JButton btnEliminar = new JButton("Eliminar Llibre");
        pnlNorth.add(btnEliminar, BorderLayout.NORTH);
    }

    private void netejarFormulari(JPanel pnlCenter, JButton btnAfegir) {
        // Creem un GridLayout per al Formulari.
        GridLayout gridFormulari = new GridLayout(3, 2);
        pnlPrincipal.setLayout(gridFormulari);

        // Afegim els components al Formulari a sa part central.
        pnlCenter.add(this.getTxtTitol(), BorderLayout.CENTER);
        pnlCenter.add(this.getTxtAutor(), BorderLayout.CENTER);
        pnlCenter.add(this.getTxtAny(), BorderLayout.CENTER);
        pnlCenter.add(this.getCboDisponible(), BorderLayout.CENTER);
        pnlCenter.add(this.getLstLlibres(), BorderLayout.CENTER);
        pnlCenter.add(btnAfegir, BorderLayout.CENTER);
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
