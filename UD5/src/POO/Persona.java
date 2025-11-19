package POO;

public class Persona {

    /*
        ACCESO A ATRIBUTOS, MÉTODOS Y CLASES

            Modificador     Clase   Package     Subclase       Todo

            public          SÍ      SÍ          SÍ              SÍ
            protected       SÍ      SÍ          SÍ              NO
            Sin Modificador SÍ      SÍ          NO              NO
            private         SÍ      NO          NO              NO

     */

    // Atributs
    private String nom;
    private int edad;
    private double pes;
    //    final String DNI;
    private boolean enferma;

    // Constructors
//    public Persona(String nom, int edad, double pes) {
//        this.nom = nom;
//        this.edad = edad;
//        this.pes = pes;
//
//    }
    public Persona() {
//        this("Pere");
//        this.edad = 25;
//        this.pes = 75.0;
        this(true);

    }

    public Persona(boolean enferma) {
        this.nom = "John Doe";
        this.edad = 25;
        this.pes = 75.0;
        this.enferma = enferma;

    }

    public Persona(String nom) {
        this.nom = nom;
        this.edad = 25;
        this.pes = 75.0;
        this.enferma = false;

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
        return "Nom: " + this.aCapitals() + ", Edad: " + this.edad + ", Pes: " + this.pes +
                (this.enferma ? ", Enferma" : "");

    }

    // Metodo para poner el nombre en mayúscula.
    private String aCapitals() {
        return this.nom.toUpperCase();

    }

    public static void contador() {
        System.out.println("Aquest mètode és estàtic!");

    }

    // GETTERS Y SETTERS
    // Para lectura
    public double getPes() {
        return this.pes;

    }

    // Para escritura
    public void setPes(double pes) {
        this.pes = pes;

    }

    public String getNom() {
        return nom;

    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    public boolean isEnferma() {
        return enferma;

    }

    public void setEnferma(boolean enferma) {
        this.enferma = enferma;

    }

}