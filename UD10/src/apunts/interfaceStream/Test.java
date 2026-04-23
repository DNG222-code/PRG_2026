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

//        Stream<String> streamCadena = llista.stream();

        // Filtrar
        // Stream<T> filter(Predicate<? Super T> predicate)

//        Predicate<String> començaPerA = a -> a.startsWith("A");

//        Stream<String> streamA = streamCadena.filter(a -> a.startsWith("A"));

        // void forEach(Consumer<? Super T> accio)

//        Consumer<String> mostrar = System.out::println;
//        streamA.forEach(mostrar);

//        Stream<String> streamB = streamCadena.filter(b -> b.startsWith("B"));
//        streamB.forEach(mostrar);

//        streamA.forEach(System.out::println);

        // Tuberias o Pipelines.

//        llista.stream()
//                .filter(a -> a.startsWith("A"))
//                .forEach(System.out::println);

        Client[] clients = {
                new Client("11111111", "Zoe", 34),
                new Client("44444444", "Paco", 45),
                new Client("55555555", "Emilio", 4),
        };

        // Stream<Client> streamClients = Arrays.stream(clients);
//        Stream<Client> streamClients = Stream.of(clients);

//        Comparator<Client> comparaNom = (c1, c2) -> c1.getNom().compareTo(c2.getNom());
//        System.out.println();
//        Arrays.stream(clients)
//                .sorted((c1, c2) -> c1.getNom().compareTo(c2.getNom()))
//                .forEach(System.out::println);

        // map
        // Transforma
        // Stream<V> map(Function<? Super T, ? extends, V> mapper)

//        Function<Client, String> aDNI = c -> c.getDNI();

//        Arrays.stream(clients)
//            .map(c -> c.getDNI())
//            .forEach(System.out::println);

        // long count()
        // Retorna el número d'elements d'un Stream.
        long n = Arrays.stream(clients)
            .filter(c -> c.getEdat() > 22)
            .count();
//        System.out.println(n);

        // Stream<T> distinct
        // Elimina repeticions

        Stream<Integer> streamEnters = Stream.of(4, 5, 1, 10, 10, 2, 9, -1,
                2, 3, 1, 7, 4, 8, -1, 8, 10);

//        Stream.of(4, 5, 1, 10, 10, 2, 9, -1,
//                2, 3, 1, 7, 4, 8, -1, 8, 10)
//                .distinct()
//                .sorted()
//                .forEach(x -> System.out.print(x + " "));

        // Càlculs
        // sum()
        int sumarEdats = Arrays.stream(clients)
                .mapToInt(c -> c.getEdat()) // Retorna Stream d'objectes Integer
                .sum();
//        System.out.println(sumarEdats);

        // average()
        double mitjaEdats = Arrays.stream(clients)
                .mapToInt(Client::getEdat)
                .average()
                .getAsDouble();
        // System.out.println(mitjaEdats);

        // max
        int maxEdat = Arrays.stream(clients)
                .mapToInt(Client::getEdat)
                .max()
                .getAsInt();
//        System.out.println(maxEdat);

        // min
        int minEdat = Arrays.stream(clients)
                .mapToInt(Client::getEdat)
                .min()
                .getAsInt();
//        System.out.println(minEdat);

        // reduce
        // accumulador

        int accumulaEdat = Arrays.stream(clients)
                .map(Client::getEdat)
                .reduce(100, (a, b) -> a + b);
//        System.out.println(accumulaEdat);

        // concat
        Stream<Integer> mesEnters = Stream.of(101, 200, -301, 505);

//        Stream.concat(streamEnters, mesEnters)
//                .distinct()
//                .sorted()
//                .forEach(x -> System.out.print(x + " "));

        // Object[] toArray
        Object[] arrayDeStream = mesEnters
                .distinct()
                .filter(x -> x % 2 != 0)
                .toArray();
//        System.out.println(Arrays.toString(arrayDeStream));

        Integer[] arrayInteger =
                Arrays.copyOf(arrayDeStream,
                        arrayDeStream.length,
                        Integer[].class);

//        System.out.println(Arrays.toString(arrayInteger));

        Integer[] nouArrayInteger = Stream.of(101, 200, -301, 505)
                .distinct()
                .filter(x -> x % 2 != 0)
                .toArray(Integer[]::new);

//        System.out.println(nouArrayInteger[0]);

        List<Integer> llistaNumeros = Stream.of(101, 200, -301, 505)
                .collect(Collectors.toList());

        // System.out.println(llistaNumeros.get(1));

        Set<Integer> conjuntNumeros = Stream.of(101, 200, -301, 505, 101, 200)
                .collect(Collectors.toCollection(TreeSet::new));

        for (Integer num : conjuntNumeros) {
            System.out.print(num + " ");
        }

        Map<String, String> mapaClients = Stream.of(clients)
                .collect(Collectors.toMap(Client::getDNI, Client::getNom));

    }

}
