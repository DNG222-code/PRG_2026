package activitat4pt11;

public class Tesoro {

    static void main(String[] args) {

        // Declaramos el array bidimensional.
        int[][] mapa = new int[5][5];

        System.out.println("Mapa de la isla solo (0): ");

        // Hacemos 2 for's, 1 para la fila y el otro para las columnas.
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = 0;
                System.out.print(mapa[i][j] + " ");

            }
            System.out.println();

        }



    }

}