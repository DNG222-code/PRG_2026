package exercicis.practicaUnPoc;

public class Test {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pepe");

        Saludo<String> saludoNombre = nombre -> "Hola " + nombre + "!";
        saludoNombre.saludar("Juan");


    }
}
