package apunts.referencia;

import java.util.function.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        // Referència a mètodes.

//        Function<Double, Double> arrel = x -> Math.sqrt(x);
        Function<Double, Double> arrel = Math::sqrt;

        Double x = arrel.apply(16.);

//        System.out.println(x);

        Function<Integer, Integer> f1 = Calculs::cub;

//        System.out.println(f1.apply(2));

//        Function<Integer, Integer> f2 = Calculs::quadrat;

        // Es fa aixines, pq es static.
        Calculs calc = new Calculs();
        Function<Integer, Integer> f2 = calc::quadrat;

//        System.out.println(f2.apply(3));

        Function<Enter, Enter> seguentEnter = Enter::seguent;
//        System.out.println(seguentEnter.apply(new Enter(9)));

        Integer[] t = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(t));
        aplicar(t, f2);
//        System.out.println(Arrays.toString(t));

        Function<String, Salutacio> generaSalutacio = Salutacio::new;
        Salutacio s = generaSalutacio.apply("Anna");

        System.out.println(s);
    }

    static <T> void aplicar(T[] arrayT, Function<T, T> m) {
        for (int i = 0; i < arrayT.length; i++) {
            arrayT[i] = m.apply(arrayT[i]);
        }
    }
}
