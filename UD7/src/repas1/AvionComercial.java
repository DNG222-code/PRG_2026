package repas1;

public class AvionComercial extends Aeronave implements Volable, Transportable, Mantenible {

    // Heredamos el constructor de la clase padre.
    public AvionComercial(String modelo) {
        super(modelo);
    }

    // Heredamos y implementamos todos los métodos de las clases padre y de las interficies.
    @Override
    void mostrarInfo() {
        System.out.println("Un avión comercial");
    }

    @Override
    public void hacerMantenimiento() {

    }

    @Override
    public void mantenimineto() {
        Mantenible.super.mantenimineto();
    }

    @Override
    public void transportar() {

    }

    @Override
    public void volar() {

    }
}
