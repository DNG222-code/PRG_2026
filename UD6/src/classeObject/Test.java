package classeObject;

public class Test {

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 22, 44);
//
//        Persona p = e;
//
//        p.mostrarDades();

//        Persona p = new Persona("Juan", 22, 44);
//
//        p.mostrarDades();
//
//        p = new Empleado("Juanjo", 32, 54, 2000);
//
//        p.mostrarDades();

        Persona p2 = new Persona("Juan", 25, 44);

//        e2.mostrarDades();
//        e2.mostrarDades();
//        boolean iguals = p1.equals(p2);
        System.out.println("Son iguals? " + (p1.equals(p2) ? "Si" : "No"));

        System.out.println(p1);

    }

}