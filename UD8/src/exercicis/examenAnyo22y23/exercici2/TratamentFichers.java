package exercicis.examenAnyo22y23.exercici2;

import java.io.*;
import java.util.*;

public class TratamentFichers {

    static String nombreFichero = "UD8/fixers/esportistes.txt";
    static int count = 0;

    public static void leer(String nom, int edat, double pes, double alsada, int count) {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            br.readLine(); // Saltar cabecéra (si existe)

            String linea;

            // Recorremos todo el fichero (AHORA sin saltarnos líneas)
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                System.out.println("DATOS: \n" + "[" + linea + "]" + "\n");
                if (linea.isEmpty()) continue;

                try (Scanner sc = new Scanner(linea)) {
                    // Acepta separadores tipo: ';' con/sin espacios, o cualquier cantidad de espacios
                    sc.useDelimiter("\\s*;\\s*|\\s+");

                    // Para números con coma decimal (español)
                    sc.useLocale(Locale.forLanguageTag("es-ES"));

                    if (!sc.hasNextInt()) {
                        // Si aquí falla, la línea no empieza por edad como int
                        continue;
                    }
                    edat = sc.nextInt();

                    if (!sc.hasNextDouble()) {
                        // Si aquí falla, normalmente es por decimal con punto/coma o delimitador incorrecto
                        continue;
                    }
                    pes = sc.nextDouble();

                    if (!sc.hasNextDouble()) {
                        continue;
                    }
                    alsada = sc.nextDouble();
                }

                System.out.println();

                if (count == 0) {
                    System.out.println("No se han leído registros (formato/locale/delimitador o fichero vacío).");
                    return;
                }
            }

        } catch (IOException e) {
                System.out.println( "El fichero no existe: " + nombreFichero);
        }
    }
}