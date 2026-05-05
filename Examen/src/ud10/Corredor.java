package ud10;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Corredor implements Animo {
    // Atributos encapsulados.
    private String nombre;
    private int dorsal;
    private String categoria;
    private double distanciaRecorrida;

    // Constructor para la clase Corredor.
    public Corredor(String nombre, int dorsal, String categoria, double distanciaRecorrida) {
        this.setNombre(nombre);
        this.setDorsal(dorsal);
        this.setCategoria(categoria);
        this.setDistanciaRecorrida(distanciaRecorrida);
    }

// 1)
    // Implementamos método animar.
    @Override
    public String animar() {
        return "Ánimo que tú puedes: " + this.getNombre();
    }

// 2)
    // Método obligatorio del ejercicio: maximo().
    static <T> T maximo(T[] array, Comparator<T> comparador) {
        // Devolveremos el máximo del array que pasaremos por parámetro con el Collections.max().
        return Collections.max(Arrays.asList(array), comparador);
    }

// 4)
    // Método para guardar corredores en fichero de texto.
    static void guardarCorredores(Corredor[] corredores) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("cdc.txt"))) {

            // Array de Corredores para guardar en el fichero.
            corredores = new Corredor[] {
                    new Corredor("Corredor1", 10, "Elite", 20),
                    new Corredor("Corredor2", 6, "Elite", 32),
                    new Corredor("Corredor3", 1, "Elite", 13)
            };

        // a)
            // Stream del array de corredores.
            Stream<Corredor> masDeVeinte = Stream.of(corredores); /* Stream.of para convertir array a Stream */

            // Filtramos por las distancias que sean mayores de 20.
            masDeVeinte.filter(c -> c.getDistanciaRecorrida() > 20);

        // b)
            // Stream para ordenar por distancia.
            Stream<Corredor> ordenaPorRecorrido = Stream.of(corredores); /* Stream.of para convertir array a Stream */

            // Ordenamos por recorrido con el sorted().
            ordenaPorRecorrido.sorted().forEach(System.out::println);

        // c)
            // Stream con los nombres de los corredores.
            Stream<Corredor> nombreCorredores = Stream.of(corredores); /* Stream.of para convertir array a Stream */

            // Listamos los nombres de los corredores.
            nombreCorredores.sorted().forEach(System.out::println);

        // d)
            // Stream con la distancia media recorrida por los corredores.
            Stream<Corredor> distanciaMediaCorredores = Stream.of(corredores); /* Stream.of para convertir array a Stream */

            // Sumamos todas las distancias y dividimos entre las distancias que hay para hacer la media.
            distanciaMediaCorredores
                    .filter(c -> c.getDistanciaRecorrida() + c.getDistanciaRecorrida() % c.getDistanciaRecorrida() == 0);

        }
    }

    // Método toString() de Corredor.
    @Override
    public String toString() {
        return "Corredor {" +
                "Nombre: " + this.getNombre() +
                ", Dorsal: " + this.getDorsal() +
                ", Categoria: " + this.getCategoria() +
                '}';
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
}
