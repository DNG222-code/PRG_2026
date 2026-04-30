package exercicis.activitat10pt9;

import java.io.*;

public class Especie implements Serializable, Comparable<Especie> {

    // Atributos.
    private String nombre;
    private Tamanyo tamanyoPromedio;
    private boolean domestica;

    // Sobreescribimos el método equals().
    @Override
    public boolean equals(Object o) {
        if (o instanceof Especie) {
            Especie e = (Especie) o;
            return this.nombre.equals(e.nombre);
        }
        return false;
    }

    // Método del compareTo().
    @Override
    public int compareTo(Especie o) {
        // Ordenamos por el nombre.
        return this.getNombre().compareTo(o.getNombre());
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tamanyo getTamanyoPromedio() {
        return tamanyoPromedio;
    }

    public void setTamanyoPromedio(Tamanyo tamanyoPromedio) {
        this.tamanyoPromedio = tamanyoPromedio;
    }

    public boolean isDomestica() {
        return domestica;
    }

    public void setDomestica(boolean domestica) {
        this.domestica = domestica;
    }
}
