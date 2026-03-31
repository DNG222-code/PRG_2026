package ud8.ejercicio1;

public class Test {

    public static void main(String[] args) {

        Reserva[] reservas = new Reserva[3];

        // Instanciamos 3 Reservas.
        Reserva r1 = new Reserva("Juan", 120, 2, TipoHabitacion.SUI, 300);
        Reserva r2 = new Reserva("David", 200, 1, TipoHabitacion.IND, 150);
        Reserva r3 = new Reserva("Carlos", 50, 4, TipoHabitacion.DBL, 200);

        // Instanciamos la clase FicherosReserva para poder usar sus métodos en el main statico.
        FicherosReserva fr = new FicherosReserva();

        // Pasamos las 3 reservas a la instancia para guradar las Reservas al fichero corespondiente.
        fr.guardarReserva(r1, "reserva1.txt", true);
        fr.guardarReserva(r2, "reserva2.txt", false);
        fr.guardarReserva(r3, "reserva3.txt", true);

        // Guardamos las 3 reservas en un array.
        reservas[0] = r1;
        reservas[1] = r2;
        reservas[2] = r3;

        // Mostramos los datos de reserva con un for-each.
        for (Reserva r : reservas) {
            System.out.println(r);
        }

    }
}
