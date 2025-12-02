package classeObject;

public class Persona {

    private String nombre;
    private int edad;
    private double peso;

    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDades() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nPeso: " + peso);
    }

    @Override
    public String toString() {
        String sortida = "E meu nombre, es: " + nombre +
                "Edad: " + edad + "Peso: " + peso;
        return sortida;
    }

    @Override
    public boolean equals(Object o) {
        Persona persona2 = (Persona) o; // <--- ERROR AQUÍ

        boolean iguals;

        if (this.getNombre().equals(persona2.getNombre()) && this.getEdad() == persona2.getEdad()) {
            iguals = true;
        } else {
            iguals = false;
        }

        return iguals;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}