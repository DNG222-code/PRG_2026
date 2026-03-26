package ejercicios.activitat9pt18;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        // Lista de los socios.
        List<Socio> listaSocios = new ArrayList<>();

        // Llamámos los métodos.
        TratamientoFicheros.leerFichero();
        menu(listaSocios);
    }

    // Método para el menú.
    public static void menu(List<Socio> listaSocios) {
        // Declaramos el Scanner.
        Scanner sc = new Scanner(System.in);

        // Guardamos la opción escogida.
        int opcion;

        // Declaramos el socio para poder modificarlo.
        Socio s = new Socio("", "", "");

        do {
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
            opcion = sc.nextInt();

            // Condiciones del menú, según la opción.
            if (opcion == 1) {
                // Pedimos al usuario datos del socio para dar de alta.
                System.out.println("A continuación deberá introducir los datos del socio " +
                        "(DNI, Nombre y fecha de alta.): " + "\n");

                System.out.print("DNI: ");
                s.setDNI(sc.next());

                System.out.print("Nombre: ");
                s.setNombre(sc.next());

                System.out.print("Fecha de alta: ");
                s.setFechaAlta(sc.next());

                // Agregamos los datos a la lista de socios.
                listaSocios.add(s);

                System.out.println("Socio dado de alta correctamente!" + "\n");
            } else if (opcion == 2) {
                // Pedimos al usuario el DNI, Nombre y Fecha de alta. Del socio que se quiere dar de baja.
                System.out.print("Introduce el DNI del socio que quieres dar de baja: ");
                s.setDNI(sc.next());

                System.out.println("Introduce el nombre del socio que quieres dar de baja:");
                s.setNombre(sc.next());

                System.out.println("Introduce la fecha de alta que quiere dar de baja: ");
                s.setFechaAlta(sc.next());

                // Eliminamos el socio de la lista.
                listaSocios.remove(s);

                System.out.println("Socio dado de baja correctamente!" + "\n");
            } else if (opcion == 3) {
                // Modificamos la lista de socios.
                System.out.println("Introduce el DNI del socio que quieres modificar: ");
                s.setDNI(sc.next());

                System.out.println("Introduce el nombre del socio que quieres modificar: ");
                s.setNombre(sc.next());

                System.out.println("Introduce la fecha de alta que quieres modificar: ");
                s.setFechaAlta(sc.next());

                // Borramos y luego añadimos el socio modificado.
                listaSocios.remove(s);
                listaSocios.add(s);

                System.out.println("Socio modificado correctamente!" + "\n");
            } else if (opcion == 4) {
                // Ordenamos con el Collections.sort().
                Collections.sort(listaSocios);

                // Mostramos el listado por DNI.
                for (Socio socio : listaSocios) {
                    System.out.println(socio.getDNI() + " - "
                            + socio.getNombre() + " - "
                            + socio.getFechaAlta());
                }
            } else if (opcion == 5) {
                // Variable para la fecha de antiguedad.
                String fechaAntiguedad = s.getFechaAlta();

                Socio.antiguedad(fechaAntiguedad); // Llamamos el método de antiguedad.
            } else if (opcion == 6) {
                System.out.println("Has salido del programa!");

                // Guardamos el fichero al salir.
                TratamientoFicheros.guardarFichero(listaSocios);
            }
        } while (opcion != 6);
    }
}
