package abstraccio;

public class Superman extends Superheroes {

    // Constructor
    public Superman(String nombre, int nivelPoder) {
        super(nombre, nivelPoder);
    }

    // Método de la clase padre
    @Override
    public void utilizaPoder() {
        System.out.println("Puedo volar.");
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return "Superman{" + super.toString() + '}';
    }
}