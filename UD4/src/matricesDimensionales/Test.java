package matricesDimensionales;

public class Test {

    public static void main(String[] args) {

        // Arrays BIDIMENSIONALES

        int[] numeros0 = {2, 5, 7, 0, 3};
        int[] numeros1 = {6, 0, -1, 4, 8, 3, 2};

//        int[][] numeros = {
//                {2, 5, 7, 0, 3},
//                {6, 0, -1, 4, 8}
//        };

        int[][] numeros = {numeros0, numeros1};

        // Posición de memoria.
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros);

//        numeros = new int[3][4];

//        numeros[0][0] = 2;
//        numeros[0][1] = 5;
//        numeros[0][2] = 7;
//        numeros[1][3] = 4;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("numeros[" + i + "][" + j + "] = " + numeros[i][j]);

            }

        }

        // For-each
        for (int[] fila : numeros) {
            for (int valor : fila) {
                System.out.println("Valor: " + valor);

            }

        }

    }

}