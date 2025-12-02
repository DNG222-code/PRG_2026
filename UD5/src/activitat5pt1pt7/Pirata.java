package activitat5pt1pt7;

/* Lo dejamos público */ public class Pirata {
    // Atributos del Pirata
    /* Lo hacemos público */ public String nombre;
    /* Lo hacemos privado */ private String nombreBarco;

    // Cambiamos el resto de atributos a privados
    private int puntosSalud;
    private int botellasGrog;
    private double cantidadTesoro;
    private boolean esCapitan;

    // Creamos métodos estáticos
    private static String nombreFlota;
    private static int cuentaPiratas;

    // Generamos Constructor
    public Pirata(String nombre, String nombreBarco, int puntosSalud, int botellasGrog, double cantidadTesoro, boolean esCapitan) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.puntosSalud = puntosSalud;
        this.botellasGrog = botellasGrog;
        this.cantidadTesoro = cantidadTesoro; // Cambiado: asignación directa
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
        this.cantidadTesoro = cantidadTesoro; // Cambiado: asignación directa
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
        this.nombreBarco = "Barco Pirata";
        this.puntosSalud = 100;
        this.botellasGrog = 10;
        this.cantidadTesoro = 0.0;
        this.esCapitan = false;
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

    // Creamos método estático para comprobar cantidad de tesoro.
    public static void comprobarTesoro(Pirata p1, Pirata p2) {
        if (p1.cantidadTesoro > p2.cantidadTesoro) {
            System.out.println(p1.nombre + " tiene " + p1.cantidadTesoro + " doblones más que " + p2.nombre);
        } else if (p1.cantidadTesoro < p2.cantidadTesoro) {
            System.out.println(p2.nombre + " tiene " + p2.cantidadTesoro + " doblones más que " + p1.nombre);
        } else {
            System.out.println(p1.nombre + " y " + p2.nombre + " tienen la misma cantidad de tesoro");
        }
    }

    // Generamos el método getter.
    public String getNombreBarco() {
        return nombreBarco;
    }

    // Generamos métodos getters y setters estáticos.
    public static String getNombreFlota() {
        return nombreFlota;
    }

    public static void setNombreFlota(String nombreFlota) {
        Pirata.nombreFlota = nombreFlota;
    }

    public static int getCuentaPiratas() {
        return cuentaPiratas;
    }

    public static void setCuentaPiratas(int cuentaPiratas) {
        Pirata.cuentaPiratas = cuentaPiratas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getBotellasGrog() {
        return botellasGrog;
    }

    public void setBotellasGrog(int botellasGrog) {
        this.botellasGrog = botellasGrog;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public double getCantidadTesoro() {
        return cantidadTesoro;
    }

    public void setCantidadTesoro(double cantidadTesoro) {
        this.cantidadTesoro = cantidadTesoro;
    }
}