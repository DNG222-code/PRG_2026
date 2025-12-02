package herencia;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante(int curso) {
        super("Aragorn", 120); // Llamada obligatoria al constructor del padre
        this.setCurso(curso);
        // Ya no necesitas setNombre ni setEdad aquí porque se pasan al super
    }

    public void estudiar() {
        System.out.println(this.getNombre() + "está estudiando " + this.getCurso());
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + this.getNombre());
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

}