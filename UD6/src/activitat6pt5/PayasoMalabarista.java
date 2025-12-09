package activitat6pt5;

public class PayasoMalabarista extends Malabarista {
    // Atributos de la clase PayasoMalabarista.
    String tipoPayaso;

    // Constructor con los atributos heredados.
    public PayasoMalabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numeroPelotas, String tipoPayaso) {
        super(nombre, edad, tipoActuacion, numeroPelotas);
        this.tipoPayaso = tipoPayaso;
    }

    // Método para el payaso.
    public void realizarBroma() {
        System.out.println(getNombre() + ": " + "realiza un broma de " + getTipoActuacion());
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + " tipoPayaso: " + tipoPayaso;
    }
}