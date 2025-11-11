package conceptesBasics;

public class Persona {

    // Atributs
    String nom;
    int edad;
    double pes;
    final String DNI;

    // Constructors
    public Persona(String nom, int edad, double pes, String DNI) {
        this.nom = nom;
        this.edad = edad;
        this.pes = pes;
        this.DNI = DNI;

    }


    public void saludar() {
        System.out.println("Hola " + this.nom);

    }

    public void aniversari() {
        edad++; // Aumenta edad.

    }

    public void aumentaPes(double pes) {
        this.pes += pes; // this sirve para referirse al objeto.

        System.out.println("Aumenta el pes de " + this.pes + " a " + this.pes);

    }

    public String info() {
        return "Nom: " + this.aCapitals() + ", Edad: " + this.edad + ", Pes: " + this.pes + ", DNI: " + this.DNI;

    }

    // Metodo para poner el nombre en mayúscula.
    private String aCapitals() {
        return this.nom.toUpperCase();

    }

    public static void contador() {
        System.out.println("Aquest mètode és estàtic!");

    }

}