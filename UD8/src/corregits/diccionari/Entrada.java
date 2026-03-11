package corregits.diccionari;

public class Entrada implements Comparable<Entrada>{

    private String castella;
    private String catala;

    public Entrada(String castella, String catala) {
        this.setCastella(castella);
        this.setCatala(catala);
    }

    @Override
    public int compareTo(Entrada o) {
        return this.castella.toLowerCase().compareTo(o.castella);
    }

    @Override
    public String toString() {
        // Muestra el codigo y la palabra.
        return Idioma.CASTELLA.getCodi() + ": " + this.getCastella() + " -> "
                +  Idioma.CATALA + this.getCatala();
    }

    public String getCastella() {
        return castella;
    }

    private void setCastella(String castella) {
        this.castella = castella;
    }

    public String getCatala() {
        return catala;
    }

    private void setCatala(String catala) {
        this.catala = catala;
    }
}
