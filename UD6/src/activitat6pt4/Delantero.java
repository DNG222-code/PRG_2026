package activitat6pt4;

public class Delantero extends Futbolista {

    // Atributos de la clase Delantero.
    double regate;
    int golesMarcados;

    // Generamos el constructor con los atributos heredados.
    public Delantero(String nombre, int edad, int numero) {
        super(nombre, edad, numero);
        this.regate = 0.00;
        this.golesMarcados = 2;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + " " + regate + " " + golesMarcados;
    }

    // Sobreescribimos el método equals.
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}