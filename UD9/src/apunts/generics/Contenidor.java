package apunts.generics;

public class Contenidor<T> {

    private T objecte;

    public void guardar(T nou) {
        this.objecte = nou;
    }

    public T extreure() {
        T resultat = this.objecte;
        this.objecte = null;

        return resultat;
    }

    static <U> int comptarNulls(U[] arrayU) {
        int comptador = 0;

        for (U element : arrayU) {
            if (element == null) {
                comptador++;
            }
        }

        return comptador;
    }

    public T[] arrayGeneric(ArrayNumeric[] array) {

        for (int i = 0; i < array.length; i++) {

        }

        return null;
    }
}
