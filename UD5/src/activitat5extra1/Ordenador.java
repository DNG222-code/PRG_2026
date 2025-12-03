package activitat5extra1;

public class Ordenador {
    // ========================================
    // Atributos.
    // ========================================
    private String modelo;
    private String procesador;
    private String placaBase;
    private String tarjetaGrafica;
    private String cantidadVRam;
    private String memoriaRam;
    private String cantidadRam;
    private String SSD;
    private String capacidadSSD;
    private double precio;
    private boolean esDisponible;

    // ========================================
    // Constructores.
    // ========================================

    public Ordenador(String modelo, String procesador, String placaBase,
                     String tarjetaGrafica, String memoriaRam, String SSD,
                     double precio, boolean esDisponible) {

        this.modelo = modelo;
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.tarjetaGrafica = tarjetaGrafica;
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.precio = precio;
        this.esDisponible = esDisponible;
    }

    public Ordenador(String cantidadVRam, String cantidadRam, String capacidadSSD) {
        this.setCantidadVRam(cantidadVRam);
        this.setCantidadRam(cantidadRam);
        this.setCapacidadSSD(capacidadSSD);
    }

    // ========================================
    // Getters & Setters
    // ========================================
    public String getModelo() {
        return modelo;
    }

    // ========================================
    // Método estático que almacene los 3 Objetos.
    // ========================================
    public static void mostrarOrdenadores(Ordenador o1, Ordenador o2, Ordenador o3) {
        Ordenador[] ordenadores = {o1, o2, o3};

        for (Ordenador o : ordenadores) {
            if (o1.isEsDisponible()) {
                System.out.println(o.getModelo());
            } else if (o2.isEsDisponible()) {
                System.out.println(o.getModelo());
            } else if (o3.isEsDisponible()) {
                System.out.println(o.getModelo());
            } else {
                System.out.println("Lo sentimos, no está disponible.");
            }
        }
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

    public String getCantidadVRam() {
        return cantidadVRam;
    }

    public void setCantidadVRam(String cantidadVRam) {
        this.cantidadVRam = cantidadVRam;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(String cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getCapacidadSSD() {
        return capacidadSSD;
    }

    public void setCapacidadSSD(String capacidadSSD) {
        this.capacidadSSD = capacidadSSD;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }
}