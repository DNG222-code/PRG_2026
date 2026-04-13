package apunts.deZero;

public class Client {

    private String nom;
    private int edat;
    private double pes;

    public Client(String nom, int edat, double pes) {
        this.setNom(nom);
        this.setEdat(edat);
        this.setPes(pes);
    }

    @Override
    public String toString() {
        return "Nom: " + this.getNom() + ", Edat: " + this.getEdat() + " anys" + ", Pes: " + this.getPes() + "\n";
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

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
}
