package activitat4pt10;

public class Tesoro {

    static void main(String[] args) {

        // Declaramos el array.
        int[] cofres = {50, 120, 75, 200, 90};

        // Declaramos la variable de las sumas.
        int suma = 0;

        System.out.println("Contenido de cada cofre: ");
        for (int i = 0; i < cofres.length; i++) {
            suma += cofres[i];
            System.out.println("Cofre " + (i + 1) + ": " + cofres[i] + " monedas de oro.");

        }

        System.out.println("Total de monedas de oro obtenidas: " + suma);

    }

}