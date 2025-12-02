package classesAbstractes;

public class Cuadrado extends Figura {

    // Atributos
    private double lado;

    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.setLado(lado);
    }

    // Método sobreescrito
    @Override
    public double area() {
        return this.getLado() * this.getLado();
    }

    // Getters and Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}