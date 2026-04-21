package apunts.interfaceStream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test {

    // INTERFACE STREAM.

    // Stream -> Stream (intermitja)
    // Stream -> resultat final (terminal)

    // Tubería o Pipeline.

    // A partir d'una Col·lecció -> stream() - Collection
    // Stream<T> nomStream = nomColeccio.stream();

    // A partir d'un array -> of() - Stream
    // Stream<T> nomStream = Stream.of(nomArray);

    // A partir d'un array -> stream() - Arrays
    // Stream<T> nomStream = Arrays.stream(nomArray);

    // Stream<T> nomStream = Stream.of(valor1, valor2, ...);

    public static void main(String[] args) {
        List<String> llista = new ArrayList<>();
        llista.add("Pepe");
        llista.add("Juan");
        llista.add("Ana");
        llista.add("Maria");
        llista.add("Josep");
        llista.add("Manuel");
        llista.add("Emilio");
        llista.add("David");
        llista.add("Adrian");

        Stream<String> streamCadena = llista.stream();

        // Filtrar
        // Stream<T> filter(Predicate<? Super T> predicate)

//        Predicate<String> començaPerA = a -> a.startsWith("A");

        Stream<String> streamA = streamCadena.filter(a -> a.startsWith("A"));

        // void forEach(Consumer<? Super T> accio)

        Consumer<String> mostrar = System.out::println;
//        streamA.forEach(mostrar);

        Stream<String> streamB = streamCadena.filter(b -> b.startsWith("B"));
        streamB.forEach(mostrar);
    }

}
