package activitat6pt6;

public class Coro extends Cantante {

    // Atributo
    int tamanyo;

    // Constructor con los atributos heredados.
    public Coro(String nombre, int edad, TipoVoz voz, int tamanyo) {
        super(nombre, edad, voz);
        this.tamanyo = tamanyo;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + ", tamanyo: " + tamanyo;
    }
}