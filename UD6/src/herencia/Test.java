package herencia;

public class Test {

    public static void main(String[] args) {
        // Herencia

        // Clase padre (superclase) -> Clase hija (subclase)

        Persona p1 = new Persona("Gandalf", 2000);

        p1.saludar();

        Estudiante e1 = new Estudiante(1);

        e1.estudiar();

        Profesor pr1 = new Profesor("Juan", 22, "Mates");

        p1.saludar();

    }

}