package classesObject;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("A", 42, 75.0);
        Empleat e1 = new Empleat("B", 45, 70.0, 1750.00);

        System.out.println(p1);
        System.out.println();
        System.out.println(e1);
    }
}
