package exercicis.activitat8pt4;

import java.util.*;

import static exercicis.activitat8pt4.Torneo.*;

public class Equipo implements Mostrable, Jugable {

    // Atributos de la clase Equipo.
    private static String nombre;
    private static String ciudad;
    private static int[] anyoFundacion;
    private Jugador[] jugadores;
    private int victorias;

    // Constructor.
    public Equipo(String nombre, String ciudad, int[] anyoFundacion) {
        setNombre(nombre);
        setCiudad(ciudad);
        setAnyoFundacion(anyoFundacion);
    }

    public static void crearEquipo() {
        // Declaramos las variables necesarias.
        Scanner sc = new Scanner(System.in);

        // Array para los datos de tipo String.
        String[] equiposCreados;

        // Array para los años de fundación.
        int[] anyosFundacion;

        do {
            System.out.println("    --- HAY QUE INTRODUCIR 5 EQUIPOS ---     ");

            // Pedimos al usuario el nombre del equipo.
            System.out.print("Introduzca el nombre del equipo: ");
            nombre = sc.next();

            if (esDuplicado(nombre)) {
                throw new EquipoDuplicadoException("El equipo ya existe. No se puede repetir.");
            }

            // Pedimos al usuario el nombre de la ciudad.
            System.out.print("Introduzca el nombre de la ciudad de donde es el equipo: ");
            ciudad = sc.next();

            // Guardamos los datos introducidos en un array.
            equiposCreados = new String[]{nombre, ciudad};

            // Pedimos el año de fundación del equipo.
            System.out.print("Introduzca el año de fundación del equipo: ");
            anyoFundacion = new int[]{sc.nextInt()}; // Inicializamos el array con la longitud del Scanner.

            // Guardamos los años en el array.
            anyosFundacion = new int[]{anyoFundacion[sc.nextInt()]};
        } while (equiposCreados.length > 5 || anyosFundacion.length > 5);
    }

    // Método booleano para comprobar si el nombre del equipo está duplicado.
    public static boolean esDuplicado(String nombre) {
        try {
            for (Equipo e : getEquipos()) {
                if (e.getNombre().equalsIgnoreCase(nombre)) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    // Sobreescribimos los métodos de las interfaces Mostrable y Jugable.
    @Override
    public int obtenerPuntuacion() {
        return 0;
    }

    @Override
    public void mostrarDatos() {

    }

    // Getter & Setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int[] getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(int[] anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
