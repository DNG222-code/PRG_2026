package apuntes;

public class Persona implements Comparable<Persona> {
    public String nom;
    public int edat;
    public final String DNI;

    public Persona(String nom, int edat, String DNI) {
        this.nom = nom;
        this.edat = edat;
        this.DNI = DNI;
    }

//    @Override
//    public int compareTo(Persona p) {
//        int cDNI = this.DNI.compareTo(p.DNI);
//        int cNom = this.nom.compareTo(p.nom);
//
//        return (
//            cDNI != 0
//                ? cDNI
//                : cNom
//        );
//    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(this.edat, p.edat);
    }

    @Override
    public String toString() {
        return (
            "{ " +
            "Nom: " + this.nom + ", " +
            "Edat: " + this.edat + ", " +
            "DNI: " + this.DNI +
            " }"
        );
    }
}
