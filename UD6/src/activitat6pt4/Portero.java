package activitat6pt4;

public class Portero extends Futbolista {

    // Atributos de la clase Portero.
    int paradasRealizadas;

    // Generamos el constructor con los atributos heredados.
    public Portero(String nombre, int edad, int numero) {
        super(nombre, edad, numero);
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + " " + paradasRealizadas;
    }

    // Sobreescribimos el método equals.
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}