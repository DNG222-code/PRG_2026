package activitat5pt1pt1;

public class Test {

    public static void main(String[] args) {
        // Instancia de la classe Pirata.
        Pirata p = new Pirata("Guybrush Threepwood", "El Mono de Mar", 50, 5,
                1000.0, true);

        // Llamamos la método imprimirPirata.
        p.imprimirPirata();
        System.out.println();

        // Llamamos al método lucha.
        p.luchar(50, 1000.0);
        System.out.println();

        // Llamamos al método curar.
        p.curar();

    }

}