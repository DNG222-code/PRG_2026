package activitat5pt1pt6;

public class BarcoPirata extends Pirata {

    private String nombreBarco;
    private Pirata[] tripulacion;
    private final int capacidadTripulacion;
    private int contadorPiratas = 0;
    private double tesoroTotal = 0;
    private static int contadorBarcoPirata = 0;
    private String capitanBarcoPirata;

    // ============================================================
    // 1. Constructor con nombre y capacidad
    // ============================================================
    public BarcoPirata(String nombreBarco, int capacidadTripulacion) {
        this.nombreBarco = nombreBarco;
        this.capacidadTripulacion = capacidadTripulacion;
        this.tripulacion = new Pirata[capacidadTripulacion];

        contadorBarcoPirata++;

        System.out.println("Barco instanciado:");
        System.out.println("El Barco Pirata " + nombreBarco +
                ", con capacidad para " + capacidadTripulacion + " piratas, está disponible");
        System.out.println("Cantidad de barcos en La Flota de Monkey Island: " + contadorBarcoPirata);
    }

    // ============================================================
    // 2. Constructor con nombre, capacidad por defecto
    // ============================================================
    public BarcoPirata(String nombreBarco) {
        this(nombreBarco, 5); // capacidad por defecto
    }

    // ============================================================
    // 3. Constructor por defecto sin parámetros
    // ============================================================
    public BarcoPirata() {
        this("Barco sin nombre", 3);
    }

    // ============================================================
    // GETTERS y SETTERS
    // ============================================================
    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public Pirata[] getTripulacion() {
        return tripulacion;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getContadorPiratas() {
        return contadorPiratas;
    }

    public double getTesoroTotal() {
        return tesoroTotal;
    }

    public static int getContadorBarcoPirata() {
        return contadorBarcoPirata;
    }

    public String getCapitanBarcoPirata() {
        return capitanBarcoPirata;
    }

    public void imprimirPirata() {
        System.out.println("***** DATOS DEL BARCO PIRATA *****");
        System.out.println();
        System.out.println("Nombre: " + nombreBarco);
        System.out.println("Capacidad: " + capacidadTripulacion);
        System.out.println("Cantidad de Piratas reclutados: " + contadorPiratas);
        System.out.println("El capitán es: " + capitanBarcoPirata + "\n");
        System.out.println("Tripulación: " + "\n");
        System.out.println(capitanBarcoPirata + " aporta: " + tesoroTotal + " doblones.");
        for (Pirata p : tripulacion) {
            if (p != null) {
                System.out.println(p + " aporta: " + cantidadTesoro + " doblones.");
            } else {
                System.out.println("No hay piratas en el barco");
            }
        }
        System.out.println();
        System.out.println("Tesoro total: " + tesoroTotal + " doblones.");
    }
}