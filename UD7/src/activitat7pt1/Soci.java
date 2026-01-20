package activitat7pt1;

public interface Soci {
    // Métodos.
    void registrarAssistencia();
    default String realitzarExercici(String exercici) {
        exercici = "Pesas";

        return exercici;
    }

    default String obtenirNom() {
        return "Soci1";
    }
}
