package apunts.generics;

public class ArrayNumeric <T extends Number> {

    T[] array;

    public ArrayNumeric(T[] array) {
        this.array = array;
    }
    
    public void posicion(int posicion) {
        System.out.println(array[posicion]);
    }
}
