package activitat6pt6;

public class Cantante extends Personaje {

    // Atributos.
    TipoVoz voz;

    // Constructor.
    public Cantante(String nombre, int edad, TipoVoz voz) {
        super(nombre, edad);
        this.voz = voz;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + ", voz: " + voz;
    }

    // Sobreescribimos los métodos abstractos.
    @Override
    public void actuar() {
        System.out.println("Estoy cantando");
    }

    @Override
    public void ensenyar() {
        System.out.println("Enseño a cantar");
    }
}