package corregits.practicaUnPoc1;

public class Client {

    private String nom;
    private int edat;

    public Client(String nom, int edat) {
        this.setNom(nom);
        this.setEdat(edat);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

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
