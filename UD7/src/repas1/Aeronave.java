package repas1;

public abstract class Aeronave {
    // Atributo privado.
    private String modelo;

    // Constructor.
    public Aeronave(String modelo) {
        this.modelo = modelo;
    }

    // Método abstracto.
    abstract void mostrarInfo();

    // Getter y setter.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}