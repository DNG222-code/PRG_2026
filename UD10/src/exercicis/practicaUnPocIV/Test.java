package exercicis.practicaUnPocIV;

import java.util.*;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {

        Double[] original = {1.0, 6.0, 3.0, 4.0, 5.0};
        Integer[] transf = new Integer[5];

        transformar(original, transf, x -> (int) Math.round(Calculs.raiz3(x)));

        System.out.println(Arrays.toString(transf));

    }

    static <T, V> V[] transformar(T[] original, V [] transf, Function<T, V> f) {
        return Arrays.stream(original).map(f).toArray(size -> transf);
    }
}
