package activitat6pt2;

public class Test {

    public static void main(String[] args) {

        // ==============================================
        // Instanciem l'objecte HoraExacta.
        // ==============================================
        HoraExacta hE = new HoraExacta(10, 23, 4);

        // ==============================================
        // Cridem el métode per incrementar l'hora, minuts i segons.
        // ==============================================
        hE.inc(hE.hora, hE.minuts, hE.segons);

        // ==============================================
        // Mostrem el toString sobreescrit y amb els segons.
        // ==============================================
        System.out.println(hE);

    }

}