package encapsular;

public class Persona {

    // Atribtos
    private String nom;
    private int edat;

    // Constructor
    public Persona(String nom, int edat) {
        this.setNom(nom);
        this.setEdat(edat);
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" + "nom='" + nom + '\'' + ", edat=" + edat + '}';
    }

    // Getters y Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}