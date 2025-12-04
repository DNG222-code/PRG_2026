package activitat6pt1;

public class Test {

    public static void main(String[] args) {

        // ==============================================
        // Instanciem l'objecte Hora.
        // ==============================================
        Hora h = new Hora(1, 0);

        // ==============================================
        // Cridem al métode per incrementar l'hora i minuts.
        // ==============================================
        h.inc(h.hora, h.minuts);

        // ==============================================
        // Imprimim l'hora i minuts.
        // ==============================================
        System.out.println(h);

    }

}