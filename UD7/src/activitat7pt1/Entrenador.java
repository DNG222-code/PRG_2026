package activitat7pt1;

public interface Entrenador {
    // Métodos de la interficie.
    default String donarInstruccions(String instruccio) {
        instruccio = "Da una instrucción";

        return instruccio;
    }

    void avaluarRendiment();
    default void realitzarEntrenamentPersonalitzat() {
        System.out.println(
                "1. Sentadilla." +
                "2. Flexiones" +
                "3. Bicéps.");
    }

    public static void anunciarNouEntrenador() {
        System.out.println("Ha llegado un nuevo entrenador.");
    }

    private void realitzarSeguiment() {
        System.out.println("Realizando seguimiento.");
    }
}
