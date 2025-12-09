package activitat6pt4;

public class Test {

    public static void main(String[] args) {
        // Instanciamos las clases con valores.
        Futbolista f = new Futbolista("Gandalf", 2000, 10);
        Delantero d = new Delantero("Ronaldo", 45, 9);
        Portero p = new Portero("Oblack", 41, 1);

        // Imprimimos la información con el método toString por defecto.
        System.out.println(f);
        System.out.println(d);
        System.out.println(p);
        System.out.println("--------------------------------------------");

        // Comprobamos si son iguales con el método equals.
        System.out.println(f.equals(d));
        System.out.println(f.equals(p));
    }
}