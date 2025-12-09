package activitat6pt5;

public class Acrobata extends ArtistaCirco {
    // Atributos de la clase Acrobata.
    String especialidad;

    // Constructor con los atributos heredados.
    public Acrobata(String nombre, int edad, TipoActuacion tipoActuacion, String especialidad) {
        super(nombre, edad, tipoActuacion);
        this.especialidad = especialidad;
    }

    // Sobreescribimos el método abstracto.
    @Override
    public void realizarActuacion() {
        System.out.println(getNombre() + ": " +
                "realiza una actuacion de: " + getTipoActuacion() + " con especialidad de: "
                + especialidad);
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + " " + especialidad;
    }
}