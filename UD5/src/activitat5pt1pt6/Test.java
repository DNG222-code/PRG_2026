package activitat5pt1pt6;

public class Test {

    public static void main(String[] args) {

        // 1. Instanciamos un barco usando el constructor principal
        BarcoPirata b = new BarcoPirata("El Mono de Mar", 5);

        System.out.println("Barco instanciado:");
        System.out.println("El Barco Pirata " + b.getNombre() +
                ", con capacidad para " + b.getCapacidadTripulacion() +
                " piratas, está disponible");
        System.out.println("Cantidad de barcos en La Flota de Monkey Island: "
                + BarcoPirata.getContadorBarcoPirata());
        System.out.println();

        // 2. Reclutamos piratas (6 en total)
        System.out.println("Llamadas a reclutarPiratas:");
        b.reclutarPiratas(new Pirata("Guybrush Threepwood"));
        b.reclutarPiratas(new Pirata("Murray"));
        b.reclutarPiratas(new Pirata("Hermann Toothrot"));
        b.reclutarPiratas(new Pirata("Elaine Marley"));
        b.reclutarPiratas(new Pirata("Meethook"));
        b.reclutarPiratas(new Pirata("Stan S. Stanman")); // Este no cabe
        System.out.println();

        // 3. Imprimir b
        System.out.println("Llamada a imprimirBarco:");
        b.imprimirPirata();
        System.out.println();

        // 4. Buscar piratas
        System.out.println("Llamadas a buscarPirataEnBarco");

        System.out.println("¿Está Elaine Marley en " + b.getNombre() + "?");
        b.buscarPirataEnBarco("Elaine Marley", b);

        System.out.println("¿Está LeChuck en " + b.getNombre() + "?");
        b.buscarPirataEnBarco("LeChuck", b);
    }
}