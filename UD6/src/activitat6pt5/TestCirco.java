package activitat6pt5;

import java.util.*; // Importamos todos los métodos de util.

public class TestCirco {

    public static void main(String[] args) {
        // Instanciamos los objetos.
        Acrobata a = new Acrobata("Hommer", 22, TipoActuacion.ACROBACIA, "Payaso");
        Malabarista m = new Malabarista("Bob", 44, TipoActuacion.MALABARES, 5);
        PayasoMalabarista pm = new PayasoMalabarista("Juan", 25, TipoActuacion.MALABARES, 10, "Malvado");

        // Mostramos información con el método toString (De prueba).
        System.out.println(a);
        System.out.println(m);
        System.out.println(pm);

        // Array de objetos
        ArtistaCirco[] artistas = {a, m, pm};

        // Array de Días de la semana
        DiasSemana[] diasSemana = DiasSemana.values();

        // Array de calendario semanal: filas -> artistas, columnas -> días
        String[][] calendario = new String[artistas.length][diasSemana.length];

        // Imprimir el calendario
        System.out.println();
        for (DiasSemana dia : diasSemana) {
            System.out.printf("%-12s", dia);
        }
        System.out.println();

        // Llenamos el calendario de forma aleatoria y también lo imprimimos por pantalla.
        Random rand = new Random();
        for (int i = 0; i < artistas.length; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                // Asignamos el nombre del artista a días aleatorios
                if (rand.nextBoolean()) { // 50% de probabilidad de actuar ese día
                    calendario[i][j] = artistas[i].getNombre();
                    // Con el método printf lo tabulamos de una forma interesante, en comparación con println.
                    System.out.printf("%-12s", artistas[i].getNombre());
                } else {
                    calendario[i][j] = "-";
                    System.out.printf("%-12s", calendario[i][j]);
                }
            }
            System.out.println();
        }
    }
}