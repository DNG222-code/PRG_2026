package activitat5pt1pt7;

public class BarcoPirata extends Pirata {

    private String nombreBarco;
    private Pirata[] tripulacion;
    private final int capacidadTripulacion;
    private int contadorPiratas = 0;
    private double tesoroTotal = 0;
    private static int contadorBarcoPirata = 0;
    private String capitanBarcoPirata;

    // ============================================================
    // nuevo atributo privado
    // ============================================================
    private tiposBarcos tipoBarco;

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
        System.out.println("Cantidad de barcos en La Flota de Monkey Island: " + contadorBarcoPirata + "\n");
    }

    // ============================================================
    // 2. Constructor con nombre, capacidad por defecto
    // ============================================================
    public BarcoPirata(String nombreBarco) {
        this(nombreBarco, 5); // capacidad por defecto
    }

    // ============================================================
    // Constructor con parámetro tipoBarco
    // ============================================================
    public BarcoPirata(String nombreBarco, String tipoBarco, int capacidadTripulacion) {
        this("Barco sin nombre");
        setTipoBarco(tipoBarco);
    }

    // ============================================================
    // Creamos el enum con nombres
    // ============================================================
    public enum tiposBarcos {
        Galeon,
        Fragata,
        Brigantin,
        Goleta,
        Corsario,
        Balandro,
        Remos
    }

    // ============================================================
    // Constructor que solicite un enum
    // ============================================================
    public BarcoPirata(tiposBarcos tipoBarco, int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
        this.setTipoBarco(tipoBarco);
    }

    // ============================================================
    // Switch para asignar valor
    // ============================================================
    int valor;

    public void setTipoBarco(String tipoBarco) {
        switch (tipoBarco) {
            case "Galeon": valor = 20; break;
            case "Fragata": valor = 15; break;
            case "Brigantin": valor = 12; break;
            case "Goleta": valor = 10; break;
            case "Corsario": valor = 8; break;
            case "Balandro": valor = 4; break;
            case "Remos": valor = 2; break;
            default: valor = 0; break;
        }

        System.out.println("Barco creado con tipo: " + tipoBarco
                + " y valor: " + valor);
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

    // ============================================================
    // Getter y Setter del tipoBarco
    // ============================================================
    public tiposBarcos getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(tiposBarcos tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    // ==========================================================
    // Método para imprimir los datos del barco pirata.
    // ==========================================================
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
                System.out.println(p + " aporta: " + getCantidadTesoro() + " doblones.");
            } else {
                System.out.println("No hay piratas en el barco");
            }
        }
        System.out.println();
        System.out.println("Tesoro total: " + tesoroTotal + " doblones.");
    }

    // Método reclutar piratas
    public void reclutarPiratas(Pirata pirata) {
        // ==========================================================
        // 1. Comprobar si hay espacio
        // ==========================================================
        if (contadorPiratas >= capacidadTripulacion) {
            System.out.println(pirata.getNombre() + " no puede ser reclutado, en "
                    + nombreBarco + " no caben más piratas");
            return;
        }

        // ==========================================================
        // 2. Añadir pirata a la tripulación
        // ==========================================================
        tripulacion[contadorPiratas] = pirata;
        contadorPiratas++;

        // ==========================================================
        // 3. Cambiar el barco del pirata
        // ==========================================================
        pirata.setNombreBarco(nombreBarco);

        // ==========================================================
        // 4. Sumar tesoro del pirata al barco
        // ==========================================================
        tesoroTotal += pirata.getCantidadTesoro();

        // ==========================================================
        // 5. El primer pirata es el capitán
        // ==========================================================
        if (contadorPiratas == 1) {
            pirata.setEsCapitan(true);
            capitanBarcoPirata = pirata.getNombre();
        } else {
            pirata.setEsCapitan(false);
        }

        // ==========================================================
        // 6. Mensaje de reclutamiento
        // ==========================================================
        System.out.println(pirata.getNombre() + " ha sido reclutado en " + nombreBarco);
    }

    // ==========================================================
    // Método buscar pirata en barco
    // ==========================================================
    public static void buscarPirataEnBarco(String nombrePirata, BarcoPirata barco) {
        for (int i = 0; i < barco.contadorPiratas; i++) {
            Pirata p = barco.tripulacion[i];

            if (p.getNombre().equalsIgnoreCase(nombrePirata)) {
                System.out.println(nombrePirata + " se encuentra en la posición "
                        + i + " de la tripulación de " + barco.nombreBarco);
                return;
            }
        }

        System.out.println(nombrePirata + " NO se encuentra en " + barco.nombreBarco);
    }
}