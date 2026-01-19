package abstraccio;

public class Spiderman extends Superheroes {

    public Spiderman(String nombre, int nivelPoder) {
        super(nombre, nivelPoder);
    }

    @Override
    public void utilizaPoder() {
        System.out.println("El Spiderman usa su poder de fuego");
    }

    @Override
    public String toString() {
        return "Spiderman{" + super.getNombre() + '}';
    }

    @Override
    public boolean equals(Object o) {
        Spiderman su = (Spiderman) o;

        return su.equals(this.getNivelPoder());
    }
}