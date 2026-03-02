package exercicis.activitat8pt4;

public class Jugador extends Persona implements Mostrable {

    // Atributos de la clase Jugador.
    private String posicion;
    private int dorsal;
    private double puntosMedios;

    // Sobreescribimos el método de Mostrable.
    @Override
    public void mostrarDatos() {

    }

    // Getter & Setter.
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getPuntosMedios() {
        return puntosMedios;
    }

    public void setPuntosMedios(double puntosMedios) {
        this.puntosMedios = puntosMedios;
    }
}
