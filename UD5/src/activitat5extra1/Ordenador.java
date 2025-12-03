package activitat5extra1;

public class Ordenador {
    // ========================================
    // Atributos.
    // ========================================
    private String modelo;
    private String procesador;
    private String placaBase;
    private String tarjetaGrafica;
    private int cantidadVRam;
    private int memoriaRam;
    private String SSD;
    private int capacidadSSD;
    private String precio;
    private boolean esDisponible;

    // ========================================
    // Constructores.
    // ========================================
    public Ordenador(String modelo, String procesador, String placaBase, String tarjetaGrafica, int cantidadVRam, int memoriaRam, String SSD, int capacidadSSD, String precio, boolean esDisponible) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.tarjetaGrafica = tarjetaGrafica;
        this.cantidadVRam = cantidadVRam;
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.capacidadSSD = capacidadSSD;
        this.precio = precio;
    }

    // ========================================
    // Getters & Setters
    // ========================================
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getCantidadVRam() {
        return cantidadVRam;
    }

    public void setCantidadVRam(int cantidadVRam) {
        this.cantidadVRam = cantidadVRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public int getCapacidadSSD() {
        return capacidadSSD;
    }

    public void setCapacidadSSD(int capacidadSSD) {
        this.capacidadSSD = capacidadSSD;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean isEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }
}