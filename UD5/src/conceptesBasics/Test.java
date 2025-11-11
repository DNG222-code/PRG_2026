package conceptesBasics;

public class Test {

    Test t = new Test(); // Con la t, se pueden usar métodos NO estáticos.

    public static void main(String[] args) {

        // PROGRAMACIÓ ORIENTADA A OBJECTES - POO

        // CLASSES

        // - Propietats -> ATRIBUTS
        // - Comportaments -> FUNCIONS -> MÈTODES

        // class Persona {
        //
         //     // Atributs
        //      String nom = "";
        //      int edat = 0;
        //      double pes;
        //      final String DNI;
        //
        // }

        Persona p = new Persona("John", 25, 75.0, "X0000000");
        Persona p2 = new Persona("Juan", 25, 75.0, "X0000000");
        Persona p3 = new Persona("Paco", 25, 75.0, "X0000000");
        Persona p4 = p; // Apuntan al mismo sitio.

        System.out.println(p4.info());

        // Apuntan al mismo sitio.
        System.out.println(p);
        System.out.println(p4);

//        p.nom = "David";
//        p.edad = 20;
//        p.pes = 65.0;
//
//        p2.nom = "Juan";
//        p2.edad = 18;
//        p2.pes = 75.0;
//
////        p.pes = 85;
//
//        p.saludar();
//        p2.saludar();
//
//        System.out.println();
//        System.out.println("Nom: " + p.nom);
//        System.out.println("Pes: " + p.pes);
//        System.out.println("En " + p.nom + " té " + p.edad + " anys.");
//        p.aniversari();
//        System.out.println("En " + p.nom + " té " + p.edad + " anys.");
//        System.out.println("Nom: " + p2.nom);
//
//        // Metodo del peso:
//        p.aumentaPes(10);
//        System.out.println(p.info());
//        System.out.println(p2.info());
//
//        Persona.contador(); // Se pone el nombre de la clase directamente para los métodos estáticos.

        System.out.println(p.info());

    }

}