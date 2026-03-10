package exercicis.activitat8pt4;

import java.io.*;
import java.util.*;

public class Torneo {

    // Atributos de la clase Torneo.
    private static Equipo[] equipos = new Equipo[10];

    // Métodos obligatorios de la clase Torneo.
    static void addEquipo() throws EquipoDuplicadoException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del equipo: ");
        String nombre = sc.nextLine().trim();

        for (Equipo equipoExistente : equipos) {
            if (equipoExistente != null && equipoExistente.getNombre().equalsIgnoreCase(nombre)) {
                throw new EquipoDuplicadoException("El equipo " + nombre + " ya existe.");
            }
        }

        Equipo e = new Equipo();
        e.setNombre(nombre);

        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] == null) {
                equipos[i] = e;
                System.out.println("Equipo creado correctamente.");
                return;
            }
        }

        System.out.println("No se pueden añadir más equipos: el torneo está completo.");
    }

    void simularPartido(String nombreEquipo1, String nombreEquipo2) throws EquipoNoEncontradoException {


    }

    void mostrarCalificacion() {


    }

    // Método para guardar los datos en un fichero Binario.
    void guardarBinario(String ruta) throws IOException {

        String linea;

        // Leemos el contenido del fichero.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));

        while ((linea = ois.readLine()) != null) {
            linea = ois.readLine();
        }

        // Escribimos los datos en el fichero.
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));

        while (linea != null) {
            oos.writeObject(linea);
        }
    }

    // Método para cargar los datos de un fichero Binario.
    void cargarBinario(String ruta) throws IOException, ClassNotFoundException {
        // Leemos todo el contenido del fichero Binario.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
            int[] datos = (int[]) ois.readObject();

            while ((datos = (int[]) ois.readObject()) != null) {

                datos = (int[]) ois.readObject();
            }
    }

    void guardarTexto(String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        String linea = "";

        while (linea != null) {
            bw.write(linea);
            bw.newLine();
         }
    }

    // Getter & Setter.
    public static Equipo[] getEquipos() {
        return equipos;
    }

    public static void setEquipos(Equipo[] equipos) {
        Torneo.equipos = equipos;
    }
}
