package ejercicios.activitat9pt28;

import java.util.*;

public class ControlAccesos {

    public static void main(String[] args) {

        // Declaramos variables
        Scanner sc = new Scanner(System.in);

        String nombres = "";

        // Declaramos una Coleccion tipo Set.
        Set<String> nombresSinDuplicados = new HashSet<>();

        System.out.println("    CONTROL DE ACCESOS  " + "\n");

        do {
            System.out.println("Introduce un nombre o pon (salir) para cerrar el control: ");
            nombres = sc.nextLine();

            if (nombres.equalsIgnoreCase("salir") || nombres.equalsIgnoreCase("Salir")) {
                System.out.println("Saliendo del control de acceso...");
            } else {
                // Añadimos el nombre o nombres al Set.
                nombresSinDuplicados.add(nombres);
            }
        } while (!nombres.equalsIgnoreCase("salir") &&
                !nombres.equalsIgnoreCase("Salir"));

        // Mostramos las personas que han entrado.
        System.out.print("Personas que han entrado: " + nombresSinDuplicados + "\n");

        // Número total de accesos únicos.
        System.out.print("Número total de accesos únicos: ");
        System.out.println(nombresSinDuplicados.size());

    }
}
