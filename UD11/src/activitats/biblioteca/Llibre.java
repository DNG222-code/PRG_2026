package activitats.biblioteca;

public class Llibre extends Material {

    private String autor;
    private int any;
    private boolean disponible;
    private String categoria;

    // Constructor.
    public Llibre (String autor, int any, boolean disponible, String categoria, String titol) {
        this.setAutor(autor);
        this.setAny(any);
        this.setDisponible(disponible);
        this.setCategoria(categoria);
        this.setTitol(titol);
    }

    // toString
    @Override
    public String toString() {
        return "Titol: " + this.getTitol() + "\n" + "Autor: " + this.getAutor();
    }

    // Getters i setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
