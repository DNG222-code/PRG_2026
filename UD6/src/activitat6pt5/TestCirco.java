package activitat6pt5;

public class TestCirco {

    public static void main(String[] args) {
        // Instanciamos los objetos.
        Acrobata a = new Acrobata("Hommer", 22, TipoActuacion.ACROBACIA,
                "Payaso");
        Malabarista m = new Malabarista("Bob", 44, TipoActuacion.MALABARES,
                5);
        PayasoMalabarista pm = new PayasoMalabarista("Juan", 25, TipoActuacion.MALABARES,
                10, "Malvado");

    }

}