package abstraccio;

public abstract class Superheroes {

    // Atributos
    private String nombre;
    private int nivelPoder;

    // Constructor
    public Superheroes(String nombre, int nivelPoder) {
        this.setNombre(nombre);
        this.setNivelPoder(nivelPoder);
    }

    // Mètode abstracte
    public abstract void utilizaPoder();

//    public void mostraInfo() {
//        System.out.println("Nombre: " + this.getNombre() + " || Nivel Poder: " + this.getNivelPoder());
//    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
}