package exercicis.practicaUnPocV;

public class Calculs {

    Integer quadrat(Integer a) {
        return a * a;
    }

    static Integer cub(Integer a) {
        return a * a * a;
    }

    static Double raiz3(Double x) {
        return Math.cbrt(x);
    }

    static Double raizN(Double base, Integer n) {
        return Math.pow(base, 1.0 / n);
    }
}
