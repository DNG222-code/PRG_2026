package ud8.ejercicio2;

// Importamos todos los métodos de util.
import java.util.*;

public class Test {

    public static void main(String[] args) {

        // Llamamos al método del menú.
        menu();

    }

    // Métodos propios de la clase.

    // Método para el menú.
    private static void menu() {

        // Declaramos el Scanner para introducir la opción.
        Scanner sc = new Scanner(System.in);

        // Variable para la opción.
        int opcion;

        // Do-while para salir en la opción 4 del menú.
        do {
            System.out.println("---- MENU ----");
            System.out.println();
            System.out.println("1 - Nueva Reserva.");
            System.out.println("2 - Ver Reservas ordenadas por número de habitación.");
            System.out.println("3 - Ver Reservas ordenadas por nombre del cliente.");
            System.out.println("4 - Salir.");
            System.out.println("Selecciona una opcion: ");
            opcion = sc.nextInt();

            // Condiciones según la opción escogida.
            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {
                System.out.println("Has salido del menú. Hasta pronto!");
            }
        } while (opcion != 4);

    }

    private Reserva[] añadirReserva(Reserva[] reservas) {
        return reservas;
    }

    private Reserva[] añadeReserva(Reserva[] reservas, Reserva nueva) {
        return reservas;
    }

    private void ordenarPorHabitacion(Reserva[] reservas) {

    }

    private void ordenarPorNombreCliente(Reserva[] reservas) {

    }
}
