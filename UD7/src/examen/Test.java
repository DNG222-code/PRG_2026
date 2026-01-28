package examen;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Instanciamos las clases.
        Cajero c = new Cajero(10, 100);
        Reponedor r = new Reponedor(2, 50, 100);
        ResponsableSecion rS = new ResponsableSecion("Dulces", 10);

        // Comprobamos que vaya en método toString() y el equals() de las clases.
        System.out.println(c);
        System.out.println();
        System.out.println(r);
        System.out.println();
        System.out.println(rS);
        System.out.println();

        // Comprobamos que vayan los métodos descripcion(), trabajar(), trabajarRapido() de cada clase.
        c.descripcion();
        c.trabajar();
        c.trabajarRapido(150); // Le ponemos un ritmo.
        System.out.println();

        r.descripcion();
        r.trabajar();
        r.trabajarRapido(5);
        System.out.println();

        rS.descripcion();
        rS.trabajar();
        rS.trabajarRapido(20);
        System.out.println();

        // Hacemos que el cajero cobre.
        c.cobrar();
        System.out.println();

        // Hacemos que el reponedor reponga.
        r.reponer();
        System.out.println();

        // Hacemos que el responsable atienda.
        rS.atender(c); // Atiende a la clase Cajero.
        System.out.println();

        // Mostramos las habilidades especiales de cada clase.
        c.habilidadEspecial();
        System.out.println();

        r.habilidadEspecial();
        System.out.println();

        rS.habilidadEspecial();
        System.out.println();

        // Creamos un array de Empleados.
        Empleado[] empleados = new Empleado[5];

        // Mostramos los empleados por consola de forma de orden natural.
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // Mostramos el orden por nombre.
        // Tenemos que instanciar la interfaz Comparator con el ComparaPorNombre,
        // para que pueda funcionar en el test.
        Comparator<Empleado> compNombre = new ComparaPorNombre();

        // Mostramos de forma ordenada.
        Arrays.sort(empleados, compNombre);
        System.out.println(Arrays.toString(empleados));

        System.out.println();

        // Mostramos el orden por horas.
        Comparator<Empleado> compHoras = new ComparaPorHoras();

        // Mostramos de forma ordenada.
        Arrays.sort(empleados, compHoras);
        System.out.println(Arrays.toString(empleados));

        // Creamos 2 reponedores nuevos.
        Reponedor r2 = new Reponedor(2, 50, 100);
        Reponedor r3 = new Reponedor(4, 70, 150);

        // Mostramos la información ordenada.
        System.out.println(r2);
        System.out.println();
        System.out.println(r3);

    }
}
