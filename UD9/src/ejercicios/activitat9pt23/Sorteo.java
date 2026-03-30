package ejercicios.activitat9pt23;

import java.util.*;

public class Sorteo<T> {

    // Conjunto de elementos.
    private Set<T> elementos;

    // Constructor.
    public Sorteo() {
        elementos = new HashSet<>();
    }

    // Métodos obligatorios.

    // Añadir elemento
    public boolean add(T element) {
        return elementos.add(element); // ya controla duplicados
    }

    // Generar premiados
    public Set<T> premiados(int numPremiados) {
        if (numPremiados > elementos.size()) {
            throw new IllegalArgumentException("No hay suficientes elementos");
        }

        List<T> lista = new ArrayList<>(elementos);
        Collections.shuffle(lista);

        Set<T> resultado = new HashSet<>();
        for (int i = 0; i < numPremiados; i++) {
            resultado.add(lista.get(i));
        }

        return resultado;
    }
}