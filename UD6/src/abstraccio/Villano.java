package abstraccio;

public class Villano {
    // Atributos
    private String nombre;
    private int nivelDanyo;

    // Constructor
    public Villano(int nivelDanyo) {
        this.setNivelDanyo(nivelDanyo);
    }

    // Método toString.
    @Override
    public String toString() {
        return "Nivel de danyo: " + this.getNivelDanyo();
    }

    // Getter & Setter
    public int getNivelDanyo() {
        return nivelDanyo;
    }

    public void setNivelDanyo(int nivelDanyo) {
        this.nivelDanyo = nivelDanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
