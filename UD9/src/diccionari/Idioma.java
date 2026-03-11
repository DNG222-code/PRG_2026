package diccionari;

public enum Idioma {

    CASTELLA, CATALA;

    public String getCodi() {
        return
                switch (this) {
                    case CATALA -> "CA";
                    case CASTELLA -> "ES";
                };
    }
}
