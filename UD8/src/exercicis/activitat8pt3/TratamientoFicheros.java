package exercicis.activitat8pt3;

import java.io.*;

public class TratamientoFicheros {

    // Método para leer el fichero
    public static Equacion[] leerFichero(String path) {

        Equacion[] equaciones = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Primera línea = número de ecuaciones
            int numEcuaciones = Integer.parseInt(br.readLine());

            equaciones = new Equacion[numEcuaciones];

            String linea;

            // Leemos tantas líneas como indique el número
            for (int i = 0; i < numEcuaciones && (linea = br.readLine()) != null; i++) {
                String[] partes = linea.split(" ");

                int a = Integer.parseInt(partes[0]);
                int b = Integer.parseInt(partes[1]);
                int c = Integer.parseInt(partes[2]);

                try {
                    equaciones[i] = new Equacion(a, b, c);

                } catch (EquacionInvalidaExcepcion e) {
                    System.out.println("Error en ecuación "
                            + (i + 1) + ": "
                            + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        }

        return equaciones;
    }

    // Método para escribir soluciones
    public static void escribirSoluciones(String solucion) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("soluciones.txt", true))) {

            bw.write(solucion);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error escribiendo en el fichero: " + e.getMessage());
        }
    }
}