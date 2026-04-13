package apunts.interficiesApiJava;

import java.util.*;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {

        // Predicate<T>
        // true, false
        // boolean test(T t)

        List<Integer> numeros = List.of(2, 3, 6, 8, 10);

//        Predicate<Integer> esPar =
//                (Integer n) -> {return n % 2 == 0;};

//        System.out.println(esPar.test(9));

//        Predicate<Integer> esPar = (numero) -> numero % 2 == 0;
//        Predicate<Integer> esMayorACinco = (numero) -> numero > 5;

//        System.out.println(esPar.test(numerosPars.get(0)));

//        for (Integer n : numerosPars) {
//            if (esPar.test(n)) {
//                System.out.println(n);
//            }
//        }

//        System.out.println();
//
//        for (Integer n : numerosPars) {
//            System.out.println(esPar.test(n));
//        }

//        for (Integer n : numeros) {
//            if (esMayorACinco.test(n)) {
//                System.out.println(n);
//            }
//        }
//
//        System.out.println();
//
//        for (Integer n : numeros) {
//            System.out.println(esMayorACinco.test(n));
//        }

        // Function<T, R>
        // Transforma dades.
        // R apply(T t)

//        Function<Integer, Integer> doble = n -> n * 2;
//
//        System.out.println(doble.apply(5));

        // ENtramos un número entre el 1 y 3, si el primero és primero,
        // si el segundo és segundo,
        // si el tercero és tercero,
        // Dependiendo del orden.
//        Function<Integer, String> orden = n -> {
//            if (n == 1) {
//                return "Primer";
//            } else if (n == 2) {
//                return "Segundo";
//            } else if  (n == 3) {
//                return "Tercer";
//            } else {
//                return "No fuera de rango.";
//            }
//        };
//
//        System.out.println(orden.apply(4));

        Integer[] dosNumeros = {2, 4};

        Function<Integer[], String> ganador = n -> {
            if (dosNumeros.length < 0) {
                return "Ha ganado el equipo 1";
            } else if (dosNumeros.length > 0) {
                return "Ha ganado el equipo 2";
            } else {
                return "Empate";
            }
        };

        System.out.println(ganador.apply(dosNumeros));

    }
}
