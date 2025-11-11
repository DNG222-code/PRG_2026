package activitat4pt11;

public class Tesoro {

    public static void main(String[] args) {

        // Declaramos el array bidimensional.
        int[][] mapa = new int[5][5];
        int contador = 0; // Contador para los cofres.

        System.out.println("Mapa de la isla solo (0): ");

        // Hacemos 2 for's, 1 para la fila y el otro para las columnas.
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = 0;
                System.out.print(mapa[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println();

        System.out.println("Mapa de la isla: ");
        // Recorremos el array y con un metodo aleatorio (random) añadimos 1's.
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = (int) (0 + Math.random() * 2);
                System.out.print(mapa[i][j] + " ");

            }

            System.out.println();

        }

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 1) {
                    contador++;

                }

            }

        }
        System.out.println("Total de cofres encontrados: " + contador);
        System.out.println("Posiciones de los cofres: ");
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 1) {
                    System.out.println("- Fila: " + i + ", Columna: " + j);

                }

            }

        }

    }

}