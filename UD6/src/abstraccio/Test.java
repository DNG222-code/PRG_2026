package abstraccio;

public class Test {

    public static void main(String[] args) {

        // No se pueden intanciar clases abstractas.

        Superman s = new Superman("Superman", 1000);

        Spiderman sp = new Spiderman("Spiderman", 10);

        Joker j = new Joker(20, 34);

        // Mostrar información con el método toString por defecto.
        System.out.println(j);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println(sp);
        System.out.println();
    }
}
