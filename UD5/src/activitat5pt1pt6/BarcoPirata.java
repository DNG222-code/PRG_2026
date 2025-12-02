package activitat5pt1pt6;

import activitat5pt1pt4.Pirata;

public class BarcoPirata {

    private String nombreBarco;
    private Pirata[] tripulacion;
    private final int capacidadTripulacion;
    private int contadorPiratas = 0;
    private int tesoroTotal;
    private static int contadorBarcoPirata = 0;
    private String capitaBarcoPirata;

    // Constructores
    // 1.
    public BarcoPirata(String nombreBarco, int capacidadTripulacion) {
        this.setNombreBarco(nombreBarco);
        this.capacidadTripulacion = capacidadTripulacion;

        contadorBarcoPirata++;
        System.out.println("Nombre: " + getNombreBarco(nombreBarco));
        System.out.println("Capacidad: " + getCapacidadTripulacion(capacidadTripulacion));
    }

    // 2.
    public BarcoPirata(String nombreBarco) {
        this.setNombreBarco(nombreBarco);
        this.capacidadTripulacion = 10;

        contadorBarcoPirata++;
        System.out.println("Nombre: " + getNombreBarco(nombreBarco));
        System.out.println("Cantidad de piratas reclutados: " + contadorBarcoPirata);
    }

    // 3.
    public BarcoPirata(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }

    // Getters y Setters
    public String getNombreBarco(String nombreBarco) {
        return this.nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public Pirata[] getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(Pirata[] tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getCapacidadTripulacion(int capacidadTripulacion) {
        return this.capacidadTripulacion;
    }

    public int getContadorPiratas() {
        return contadorPiratas;
    }

    public void setContadorPiratas(int contadorPiratas) {
        this.contadorPiratas = contadorPiratas;
    }

    public int getTesoroTotal() {
        return tesoroTotal;
    }

    public void setTesoroTotal(int tesoroTotal) {
        this.tesoroTotal = tesoroTotal;
    }

    public int getContadorBarcoPirata() {
        return contadorBarcoPirata;
    }

    public void setContadorBarcoPirata(int contadorBarcoPirata) {
        this.contadorBarcoPirata = contadorBarcoPirata;
    }

    public String getCapitaBarcoPirata() {
        return capitaBarcoPirata;
    }

    public void setCapitaBarcoPirata(String capitaBarcoPirata) {
        this.capitaBarcoPirata = capitaBarcoPirata;
    }
}