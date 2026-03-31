package ejercicios.activitat9pt24;

import java.io.*;
import java.time.*;
import java.util.*;

public class Temperatura implements Serializable /* Implementamos Serializable. */ {

    // Atributos.
    private LocalTime hora;
    private LocalDate fecha;
    private double temperatura;

    // Constructor para poder modificar datos.
    public Temperatura(LocalTime hora, LocalDate fecha, double temperatura) {
        this.setHora(hora);
        this.setFecha(fecha);
        this.setTemperatura(temperatura);
    }

    // Método de menú.
    public static void menu(List<Temperatura> temperaturas) {
        // Declaramos variables.
        Scanner sc = new Scanner(System.in);

        // Instanciamos Temperatura para poder modificar los atributos.
        Temperatura t = new Temperatura(null, null, 0);

        int opcion = 0;

        do {
            System.out.println(" ============== ");
            System.out.println("     MENU       ");
            System.out.println(" ============== " + "\n");

            System.out.println("1 - Nuevo registro.");
            System.out.println("2 - Listar registros.");
            System.out.println("3 - Mostrar estadísticas.");
            System.out.println("4 - Salir." + "\n");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            // Condiciones según la opción.
            if (opcion == 1) {
                System.out.print("Introduzca la hora actual: ");
                String horaTexto = sc.next().trim();
                LocalTime hora  = LocalTime.parse(horaTexto);

                System.out.print("Introduzca la fecha actual (yyyy-mm-dd): ");
                String fechaTexto = sc.next().trim();
                LocalDate fecha = LocalDate.parse(fechaTexto);

                System.out.print("Introduzca la temperatura actual: ");
                double temperatura = sc.nextDouble();

                System.out.println();

                // Guardamos los datos a la lista temperaturas.
                temperaturas.add(new Temperatura(hora, fecha, temperatura));
            } else if (opcion == 2) {
                // Listamos los registros.
                for (Temperatura temp : temperaturas) {
                    System.out.println("Lista de registros: " + temp.toString());
                }

                System.out.println();
            } else if (opcion == 3) {
                // Variables para almacenar los valores max, min, medio.
                Temperatura max, min;

                // Con el collections.max o collections.min la lista donde están las temperaturas
                // Y el Comparator.comparingDouble sacamos el máximo o mínimo de las temperaturas
                // Y la guardamos en la variable.
                max = (Collections.max(temperaturas, Comparator.comparingDouble(Temperatura::getTemperatura)));
                min = (Collections.min(temperaturas, Comparator.comparingDouble(Temperatura::getTemperatura)));

                // Mostramos estadísticas (con valores máximo, mínimo y medio de las temperaturas
                // registradas hasta el momento desde la primera lectura del día).
                System.out.print("Valores máximos: " + max.toString());
                System.out.print("Valores mínimos: " + min.toString() + "\n");
                System.out.print("Temperatura media: " + (max.getTemperatura() + min.getTemperatura()) / 2);

                System.out.println();
            } else if (opcion == 4) {
                System.out.println("Has salido del programa!");
                // Llamamos al método para grabar el fichero binario con los datos de la lista.
                TratamientoFicheros.grabarFichero(temperaturas);
            }
        } while (opcion != 4);
    }

    // Método toString.
    @Override
    public String toString() {
        return "Temperatura{" + "hora=" + hora + ", fecha=" + fecha + ", temperatura=" + temperatura + '}';
    }

    // Getter y setter.
    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
