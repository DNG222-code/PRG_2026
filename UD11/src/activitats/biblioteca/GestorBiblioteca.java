package activitats.biblioteca;

import java.util.*;

public class GestorBiblioteca implements Guardable {

    // Atributs.
    private ArrayList<Llibre> llibres;
    private final String NOM_FITXER = "biblioteca.dat";

    // Constructor.
    public GestorBiblioteca() {
        this.llibres = new ArrayList<>();
    }

    // Mètode de la clase.
    public void afegirLlibre(Llibre llibre) {
        // Afegim un llibre a llibres.
        this.llibres.add(llibre);
    }

    // Mètodes implementats de la interfície.
    @Override
    public void guardar() {
        System.out.println("Guardant la biblioteca...");
    }

    @Override
    public void carregar() {
        System.out.println("Carregant la biblioteca...");
    }

    // Getters i setters.
    public ArrayList<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(ArrayList<Llibre> llibres) {
        this.llibres = llibres;
    }

    public String getNOM_FITXER() {
        return NOM_FITXER;
    }
}
