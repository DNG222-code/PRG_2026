package exercicis.activitat8pt4;

import java.io.*;

public class Torneo {

    // Atributos de la clase Torneo.
    private Equipo[] equipos;

    // Métodos obligatorios de la clase Torneo.
    void addEquipo(Equipo e) throws EquipoDuplicadoException {

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
    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
}
