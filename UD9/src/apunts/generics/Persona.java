package apunts.generics;

public class Persona<T> {

    String nom;
    int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return nom + " " + edat;
    }
}
