package classesAbstractes;

// Si que deja hereda u
public abstract class FiguraBidimensional extends Figura {

    // Constructor
    public FiguraBidimensional(String color) {
        super(color);
    }

    // Método abstracto
    public abstract double perimetro();
}