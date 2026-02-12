package exercicis.activitat8pt3;

public class EquacionInvalidaExcepcion extends Exception {

    // Hacemos un constructor que herede de Exception y muestre el mensaje de error.
    public EquacionInvalidaExcepcion(String missatge) {
        super(missatge);
    }
}
