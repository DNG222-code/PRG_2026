package activitat5pt1pt1;

public class Pirata {
    // Atributos del Pirata
    String nombre;
    String nombreBarco;
    int puntosSalud;
    int botellasGrog;
    double cantidadTesoro;
    boolean esCapitan;

    // Generamos Constructor
    public Pirata(String nombre, String nombreBarco, int puntosSalud, int botellasGrog, double cantidadTesoro, boolean esCapitan) {
        this.nombre = nombre;
        this.nombreBarco = nombreBarco;
        this.puntosSalud = puntosSalud;
        this.botellasGrog = botellasGrog;
        this.cantidadTesoro = cantidadTesoro;
        this.esCapitan = esCapitan;
    }

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

}