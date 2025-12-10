package abstraccio;

public class Joker extends Villano {

    // Atributos
    int debilidad;

    // Constructor
    public Joker(int nivelDanyo, int debilidad) {
        super(nivelDanyo);
        this.debilidad = debilidad;
    }

    // Sobreescribimos los métodos de object.
    @Override
    public String toString() {
        return super.toString() + ", Debilidad del villano" + debilidad;
    }

    @Override
    public boolean equals(Object o) {
        Joker j = (Joker) o;

        boolean esIgual;

        return esIgual = j.equals(this.getNivelDanyo());
    }
}