package classesAbstractes;

public class Triangulo extends FiguraBidimensional{

    // Atributos
    private double base;
    private double altura;
    private double[] lados = {base, altura};

    // Constructor
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.setBase(base);
        this.setAltura(altura);
    }

    // Sobreescribimos los métodos
    @Override
    public double perimetro() {
        for (double lado : lados) {
            lado = lado * 3;
        }

        return lados[0] + lados[1];
    }

    @Override
    public double area() {
        return this.getBase() * this.getAltura() / 2;
    }

    // Sobreescribimos el método toString
    @Override
    public String toString() {
        String salto = "\n";

        System.out.println("*** Triangulo ***" + salto);
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());

        return salto;
    }

    @Override
    public boolean equals(Object o) {
        Triangulo t1 = (Triangulo) o;
        Triangulo t2 = (Triangulo) o;

        boolean iguals;

        iguals = t1.getBase() == t2.getBase() && t1.getAltura() == t2.getAltura();

        return iguals;
    }

    // Getters and Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}