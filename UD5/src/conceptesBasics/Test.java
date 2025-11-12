package conceptesBasics;

public class Test {

    public static void main(String[] args) {

        Test t = new Test(); // Con la t, se pueden usar métodos NO estáticos.

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

        Persona p = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = p; // Apuntan al mismo sitio.

        Persona p5 = new Persona(true);
        Persona p6 = new Persona("Juan");

//        System.out.println(p4.info());

        // Apuntan al mismo sitio.
//        System.out.println(p);
//        System.out.println(p4);
//        System.out.println(p5.enferma);
//        System.out.println(p6.nom);

        System.out.println(p.info());

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

//        System.out.println(p.info());
        System.out.println(p.getPes()); // Solo puedo leerlo.
        p.setPes(90); // Puedo modificarlo.
        System.out.println(p.getPes());

        System.out.println(p.getNom());
        p.setNom("David");
        System.out.println("Se ha modificado el nombre a: ");
        System.out.println(p.getNom());

//        p.saludar();

        t.hola();

    }

    public void hola() {
        System.out.println("Hola");

    }

}