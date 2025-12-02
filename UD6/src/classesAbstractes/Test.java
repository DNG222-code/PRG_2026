package classesAbstractes;

public class Test {

    public static void main(String[] args) {

//        Figura f = new Figura();

        Cuadrado c = new Cuadrado("rojo", 10);

        double area = c.area();

        System.out.println("El área es: " + area + " m2");

        Triangulo t = new Triangulo("Verde", 15, 2);
        Triangulo t2 = new Triangulo("Azul", 10, 3);

        System.out.println(t);

        t.equals(t2);

    }

}