package apunts.referencia;

public class Salutacio {

    String nom;

    public Salutacio(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Hola " + this.nom;
    }
}
