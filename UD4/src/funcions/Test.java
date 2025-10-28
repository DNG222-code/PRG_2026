package funcions;

public class Test {
    // Variables globals. Si no es posa 'static' no funcionarà.
    static int numGlobal = 15;

    // Mètode main().
    static void main(String[] args) {
        // El mètode main() crida al mètode f(x), que definim davall, amb un paràmetre.
        System.out.println(f(7));

        a();
    }

    static int f(int x) {
        // Retorna el valor del polinomi f(x) = 2x^2 - 4x - 4.
        return 2 * x * x - 4 * x - 4;
    }

    static void a() {
        // Es crida una funció que rep un valor global.
        System.out.println("El nombre global és " + numGlobal + ".");
    }

}