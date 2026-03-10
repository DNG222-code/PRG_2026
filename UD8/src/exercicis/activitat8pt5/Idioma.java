package exercicis.activitat8pt5;

public enum Idioma {
    CASTELLA, CATALA;

    String getCodi() {
        if (this.equals(CASTELLA)) {
            return "ES";
        } else if (this.equals(CATALA)) {
            return "CA";
        }

        return null;
    }
}
