package classesAbstractes;

public abstract class Figura {

    // Atributos
    private String color;

    // Constructor
    public Figura(String color) {
        this.setColor(color);
    }

    // Métodos de la clase.
    public void muestraColor() {
        System.out.println("El color de la figura es: " + this.getColor());
    }

    // Métodos abstractos.
    public abstract double area();

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}