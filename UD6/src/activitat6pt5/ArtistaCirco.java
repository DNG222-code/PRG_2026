package activitat6pt5;

public class ArtistaCirco {
    // Atributos
    private String nombre;
    private int edad;
    private TipoActuacion tipoActuacion;

    // Constructor
    public ArtistaCirco(String nombre, int edad, TipoActuacion tipoActuacion) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTipoActuacion(tipoActuacion);
    }

    // Método abstracto.
    public void realizarActuacion() {}

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return this.getNombre() + ": " + this.getEdad();
    }

    // Sobreescribimos el método equals.
    @Override
    public boolean equals(Object o) {
        ArtistaCirco a = (ArtistaCirco) o;
        boolean esIgual;

        // Comparamos el nombre y la edad.
        return esIgual = a.getNombre().equals(this.getNombre()) &&
                a.getEdad() == this.getEdad();
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoActuacion getTipoActuacion() {
        return tipoActuacion;
    }

    public void setTipoActuacion(TipoActuacion tipoActuacion) {
        this.tipoActuacion = tipoActuacion;
    }
}