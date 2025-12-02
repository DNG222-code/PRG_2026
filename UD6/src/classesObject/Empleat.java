package classesObject;

public class Empleat extends Persona {
    // Atributs.
    private double salari;

    // Constructors.
    public Empleat (String nom, int edat, double pes, double salari) {
        super(nom, edat, pes);
        this.salari = salari;
    }

    // Funcions.
    @Override
    public void mostrarDades() {
        super.mostrarDades();
        System.out.println("Salari: " + this.salari + "€.");
    }

    @Override
    public boolean equals(Object o) {
        Empleat other = (Empleat) o;

        return (
            super.equals(other) &&
            this.getSalari() == other.getSalari()
        );
    }

    @Override
    public String toString() {
        return (
                super.toString() + "\n" +
                "Salari: " + this.getSalari()
        );
    }

    // Getters & setters.
    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }
}
