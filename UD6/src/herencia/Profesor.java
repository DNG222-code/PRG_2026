package herencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.setAsignatura(asignatura);
    }

    public void ensenyar() {
        System.out.println(this.getNombre());
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy " + this.getNombre() + " y soy profesor de " + this.getAsignatura());
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}