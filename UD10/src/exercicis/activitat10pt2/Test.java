package exercicis.activitat10pt2;

import java.util.function.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Integer[] original = {1, 6, 3, 4, 5};
        Integer[] transf = new Integer[5];

        transformar(original, transf, (x) -> x * 2);

        System.out.println(Arrays.toString(transf));

    }

    static <T, V> V[] transformar(T[] original, V [] transf, Function<T, V> f) {
        return Arrays.stream(original).map(f).toArray(size -> transf);
    }
}
