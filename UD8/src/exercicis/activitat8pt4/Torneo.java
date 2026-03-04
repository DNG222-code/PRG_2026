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

    void guardarBinario(String ruta) throws IOException {


    }

    void cargarBinario(String ruta) throws IOException, ClassNotFoundException {


    }

    void guardarTexto(String ruta) throws IOException {


    }

    // Getter & Setter.
    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
}
