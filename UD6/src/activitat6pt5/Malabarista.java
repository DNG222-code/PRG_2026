package activitat6pt5;

public class Malabarista extends ArtistaCirco {
    // Atributos de la clase Malabarista.
    int numeroPelotas;

    // Constructor con los atributos heredados.
    public Malabarista(String nombre, int edad, TipoActuacion tipoActuacion, int numeroPelotas) {
        super(nombre, edad, tipoActuacion);
        this.numeroPelotas = numeroPelotas;
    }

    // Sobreescribimos el método abstracto de la clase padre.
    @Override
    public void realizarActuacion() {
        System.out.println(getNombre() + ": " + "realiza una actuación de " + getTipoActuacion());
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + " " + numeroPelotas;
    }
}