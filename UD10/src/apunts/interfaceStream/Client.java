package apunts.interfaceStream;

public class Client implements Comparable<Client> {

    private final String DNI;
    private String nom;
    private int edat;

    public Client(String dni, String nom, int edat) {
        this.DNI = dni;
        this.setNom(nom);
        this.setEdat(edat);
    }

    @Override
    public String toString() {
        return "DNI: " + this.DNI + "Nom: " + this.getNom() + ", Edat: " + this.getEdat() + " anys" + "\n";
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

    @Override
    public int compareTo(Client o) {
        return this.DNI.toUpperCase().compareTo(o.DNI.toUpperCase());
    }
}
