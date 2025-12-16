package activitat6pt6;

public class Director extends Personaje {

    // Atributos.
    String estilo;

    // Constructor.
    public Director(String nombre, int edad, String estilo) {
        super(nombre, edad);
        this.estilo = estilo;
    }

    // Métodos.
    public void instrucciones() {
        System.out.println("Instrucciones del director.");
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + ", estilo: " + estilo;
    }

    // Sobreescribimos los métodos abstractos.
    @Override
    public void actuar() {
        System.out.println("Dirijo música.");
    }

    @Override
    public void ensenyar() {
        System.out.println("Ensenyo a los cantantes.");
    }
}