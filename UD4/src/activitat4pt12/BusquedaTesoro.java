package activitat4pt12;

import java.util.Scanner; // Importamos la clase Scanner.

public class BusquedaTesoro {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);

        // Declaramos la fila y la columna.
        int fila = 0;
        int columna = 0;
        int ubicacion = 0;

        // Array de lugares
        String[] lugares =
                {
                        "Playa de la Calavera", "Rio del Cofre Azul", "Taberna del Sable Oxidado",
                        "Cueva del Kraken", "Cabo del Trueno", "Isla del Galeón Perdido", "Bahía de las Sirenas",
                        "Colina del Vigía", "Bahía de las Sombras", "Costa del Loro Burlón", "Ensenada del Esqueleto",
                        "Ciénaga de las Anclas", "Acantilado del Trueno", "Bosque del Miedo", "Faro de las Estrellas",
                        "Lago de las Perlas", "Cascada de los Susurros", "Monte de la Serpiente", "Risco del Dragón",
                        "Islote del Naufragio", "Aguja del Pirata", "Valle de las Sombras", "Cañón del Vendaval",
                        "Bahía de los Naufragios", "Mirador del Horizonte"
                };

        // Pedimos las filas al usuario:
        System.out.println("Introduzca el número de filas (2-8): ");
        fila = sc.nextInt();

        // Pedimos las columnas al usuario:
        System.out.println("Introduzca el número de columnas (2-8): ");
        columna = sc.nextInt();

        // Validamos que los números no superen 2 y 8.
        if (fila >= 2 && fila <= 8 && columna >= 2 && columna <= 8) {

            // Declaramos el array bidimensional.
            int[][] mapa = new int[fila][columna];

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    mapa[i][j] = (int) (0 + Math.random() * 2);
                    System.out.print(mapa[i][j] + " ");

                }
                System.out.println();

            }

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; i++) {
                    if (mapa[i][j] == 1) {
                        ubicacion += mapa[i][j];

                    }

                }

            }

            System.out.println("Total de tesoros: " + ubicacion);

        } else {
            System.out.println("La estructura tiene que ser de 2 a 8");

        }

    }

}