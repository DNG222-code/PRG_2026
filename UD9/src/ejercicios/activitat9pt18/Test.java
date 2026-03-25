package ejercicios.activitat9pt18;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        // Lista de los socios.
        List<Socio> listaSocios = new ArrayList<>();

        // Llamámos los métodos.
        TratamientoFicheros.leerFichero();
        menu(listaSocios);
        TratamientoFicheros.guardarFichero(listaSocios);
    }

    private static void menu(List<Socio> listaSocios) {
        // Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        // Mostramos el menú.
        System.out.println("====================");
        System.out.println("        MENÚ        ");
        System.out.println("====================" + "\n");

        System.out.println("====================" + "\n");
        System.out.println("1. Alta.");
        System.out.println("2. Baja.");
        System.out.println("3. Modificación.");
        System.out.println("4. Listado por DNI.");
        System.out.println("5. Listado por antiguedad.");
        System.out.println("6. Salir." + "\n");
        System.out.print("Selecciona una opción: ");
        int opcion = sc.nextInt();

        // Condiciones del menú, según la opción.
        if (opcion == 1) {
            // Pedimos al usuario datos del socio para dar de alta.
            System.out.println("A continuación deberá introducir los datos del socio " +
                    "(DNI, Nombre y fecha de alta.): " + "\n");
            System.out.print("DNI: ");

            System.out.print("Nombre: ");

            System.out.print("Fecha de alta: ");
        } else if (opcion == 2) {

        } else if (opcion == 3) {

        } else if (opcion == 4) {

        } else if (opcion == 5) {

        } else if (opcion == 6) {
            System.out.println("Has salido del programa.");
        }
    }
}
