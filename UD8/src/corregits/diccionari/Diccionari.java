package corregits.diccionari;

import java.io.*;
import java.util.*;

public class Diccionari implements Traductor, Serializable {

    private Entrada[] entrades;

    public Diccionari() {
        this.setEntrades(new Entrada[0]);
    }

    public void afegir(String castella, String catala) {
        Entrada nova = new Entrada(castella, catala);

        Entrada[] nou = new Entrada[this.getEntrades().length + 1];

        for (int i = 0; i < this.getEntrades().length; i++) {
            nou[i] = this.getEntrades()[i];
        }

        nou[this.getEntrades().length] = nova;
    }

    public void llistar() {
        Arrays.sort(this.getEntrades());

        for (Entrada entrada : this.getEntrades()) {
            System.out.println(entrada);
        }
    }

    private int cercar(String paraula) {

        for (int i = 0; i < this.getEntrades().length; i++) {
            if (this.getEntrades()[i].getCastella().equals(paraula.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String traduir(String paraula) {

        int posicio = this.cercar(paraula);

        if (posicio == -1) {
            return null;
        }

        return this.getEntrades()[posicio].getCatala();
    }

    // Getter & Setter
    private Entrada[] getEntrades() {
        return entrades;
    }

    private void setEntrades(Entrada[] entrades) {
        this.entrades = entrades;
    }
}
