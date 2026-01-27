package botigaV;

public abstract class ProductoRegalo implements Vendible {
    // Atributos encapsulados.
    private String nombre;
    private double preuBase;
    private String destinatario;

    // Constructor.
    public ProductoRegalo(String nombre, double preuBase, String destinatario) {
        this.setNombre(nombre);
        this.setPreuBase(preuBase);
        this.setDestinatario(destinatario);
    }

    // Getters y setters.
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
