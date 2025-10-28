package actividad3pt12;

import java.util.Scanner; // Importamos la clase Scanner.

public class AdivinaParaula {

    public static void main(String[] args) {

        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        int numAleatorio;
        String palabra;
        String palabraAleatoria;

        // Generamos los número aleatorios y los asociamos con cada palabra.
        numAleatorio = (int) (Math.random() * 4);
        System.out.println(numAleatorio);
        palabraAleatoria = numAleatorio == 0 ? "pato" : numAleatorio == 1 ? "pata" :
                numAleatorio == 2 ? "gato" : numAleatorio == 3 ? "gata" : "nada";

        // Mostramos la interfaz al usuario.
        System.out.println("Bienvenidos al juego de adivinar palabras.");
        System.out.println("Adivina la palabra secreta (pato, pata, gato o gata): ");

    }

}