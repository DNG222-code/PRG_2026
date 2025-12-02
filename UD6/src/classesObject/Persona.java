package classesObject;

public class Persona {
    // Atributs
    private String nom;
    private int edat;
    private double pes;

    // Constructors
    public Persona(String nom, int edat, double pes) {
        this.nom = nom;
        this.edat = edat;
        this.pes = pes;
    }

    // Funcions
    public void mostrarDades() {
        System.out.println("Nom: " + this.nom + ";");
        System.out.println("Edat: " + this.edat + " anys;");
        System.out.println("Pes: " + this.pes + " kg.");
    }

    @Override
    public boolean equals(Object o) {
        Persona other = (Persona) o;

        return (
            this.getNom().equals(other.getNom()) &&
            this.getPes() == other.getPes()
        );
    }

    @Override
    public String toString() {
        return (
                "Nom: " + this.getNom() + "\n" +
                "Edat: " + this.getEdat() + "\n" +
                "Pes: " + this.getPes()
        );
    }

    // Getters & setters
    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
}
