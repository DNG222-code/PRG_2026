package classeObject;

public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, int edad, double peso, double salario) {
        super(nombre, edad, peso);
        this.setSalario(salario);
    }

    @Override
    public void mostrarDades() {
        super.mostrarDades();
        System.out.println("Salario: " + this.getSalario());
    }

    @Override
    public boolean equals(Object o) {

        Empleado empleado2 = (Empleado) o;

        boolean iguals = super.equals(empleado2);

        return iguals;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Getters and Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}