package activitat6pt3;

public class Test {

    public static void main(String[] args) {

        // ============================================================================
        // Instanciem 2 objectes d'HoraExacta, per a poder comparar-los.
        // ============================================================================
        HoraExacta hE1 = new HoraExacta(10, 23, 4);
        HoraExacta hE2 = new HoraExacta(10, 23, 4);

        // ============================================================================
        // Mostrem el resultat del mètode equals.
        // ============================================================================
        System.out.println(hE1.equals(hE2));

    }

}