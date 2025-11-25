package activitat5pt1pt3;

/* Lo dejamos público */ public class Pirata {
    // Atributos del Pirata
    /* Lo hacemos público */ public String nombre;
    /* Lo hacemos privado */ private String nombreBarco;

    // Cambiamos el resto de atributos a privados
    private int puntosSalud;
    private int botellasGrog;
    private double cantidadTesoro;
    private boolean esCapitan;

    // Generamos Constructor
    public Pirata(String nombre, String nombreBarco, int puntosSalud, int botellasGrog, double cantidadTesoro, boolean esCapitan) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.puntosSalud = puntosSalud;
        this.botellasGrog = botellasGrog;
        this.cantidadTesoro = cantidadTesoro;
        this.esCapitan = esCapitan;
    }

    // a.
    public Pirata(String nombre, String nombreBarco, boolean esCapitan) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.esCapitan = esCapitan;
    }

    // b.
    public Pirata(String nombre, String nombreBarco, double cantidadTesoro) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.cantidadTesoro = cantidadTesoro;
    }

    // c.
    public Pirata(String nombre, String nombreBarco, int botellasGrog) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.botellasGrog = botellasGrog;
    }

    // d.
    public Pirata(String nombre) {
        this.nombre = nombre;
        String nombreBarco = "Barco Pirata";
        int puntosSalud = 100;
        int botellasGrog = 10;
        double cantidadTesoro = 0.0;
        boolean esCapitan = false;
    }

    // Constructor vacio
    public Pirata() {}

    // Método para imprimir los atributos del Pirata
    public void imprimirPirata() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Barco: " + nombreBarco);
        System.out.println("Salud: " + puntosSalud);
        System.out.println("Botellas de Grog: " + botellasGrog);
        System.out.println("Tesoro: " + cantidadTesoro);
        // Comprobamos si es capitan
        if (esCapitan) {
            System.out.println(nombre + " es el capitán de " + nombreBarco);
        }

    }

    // Metodo para luchar
    public void luchar(int perdidaSalud, double doblones) {
        // Declaramos variables, para hacer la modificación.
        doblones = 200.0;
        perdidaSalud = 7;

        // Mostramos los resultados por pantalla.
        System.out.println("**** ¡Batalla! ****");
        System.out.println(nombre + " ha ganado " + doblones +
                " doblones, pero ha perdido " + perdidaSalud + " puntos de salud!");
        // Calculamos la salud y el tesoro.
        this.puntosSalud -= perdidaSalud;
        cantidadTesoro += doblones;
        System.out.println("Salud actual: " + puntosSalud);
        System.out.println("Tesoro actual: " + cantidadTesoro + " doblones");

    }

    // Metodo para curar
    public void curar() {
        // Declaramos una variable.
        int saludCurada = 5;

        // Mostramos los resultados por pantalla.
        System.out.println("**** ¡Curación! ****");
        System.out.println(nombre + " usa una botella de Grog. Se cura " + saludCurada + " puntos de salud");
        System.out.println("Salud actual: " + (this.puntosSalud += saludCurada));
        System.out.println("Botellas de Grog actuales: " + (botellasGrog - 1));

    }

    // Generamos el método getter.
    public String getNombreBarco() {
        return nombreBarco;
    }

}