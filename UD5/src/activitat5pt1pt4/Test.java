package activitat5pt1pt4;

public class Test {

    public static void main(String[] args) {
        // Constructor Original
        Pirata p1 = new Pirata("Guybrush Threepwood", "El Mono de Mar", 50, 5, 1000.0, true);

        // a.
        Pirata p2 = new Pirata("Pirata1", "Barco Pirata1", true);

        // b.
        Pirata p3 = new Pirata("Pirata2", "Barco Pirata2", 1000.0);

        // c.
        Pirata p4 = new Pirata("Pirata3", "Barco Pirata3", 5);

        // d.
        Pirata p5 = new Pirata("Pirata4");

        // Llamamos la método imprimirPirata.
        p1.imprimirPirata();
        System.out.println();
        p2.imprimirPirata();
        System.out.println();
        p3.imprimirPirata();
        System.out.println();
        p4.imprimirPirata();
        System.out.println();
        p5.imprimirPirata();
        System.out.println();

        // Llamamos al método lucha.
        p1.luchar(50, 1000.0);
        System.out.println();

        // Llamamos al método curar.
        p1.curar();
        System.out.println();

        // Llamamos al método estático (comprobarTesoro).
        Pirata.comprobarTesoro(p1, p2);

    }

}