package actividad3pt9;

// Importamos la clase Scanner.
import java.util.Scanner;

public class AdivinaNumeros {

    public static void main(String[] args) {

        // Declaramos las variables
        int numAleatorio = (int) (1 + Math.random() * 100); // Genera un número aleatorio del 1 al 100.
        int adivinaNumeros = 0;
        String aAcertado;

        // Instanciamos el Scanner.
        Scanner sc = new Scanner(System.in);

        // Enseñamos información en la terminal para el usuario.
        System.out.println("--- BIENVENIDO AL JUEGO ---");
        System.out.println();
        System.out.println("El juego consiste en adivinar el número aleatorio, de tipo entero, tienes 4 intentos. " +
                "Buena suerte");

        System.out.println("Introduce el primer número: ");
        adivinaNumeros = sc.nextInt();

        // Comprobamos con el operador ternario da el mismo número, el introducido con el aleatorio.
        aAcertado = adivinaNumeros == numAleatorio ? "Enhorabuena, has acertado." :
                "Fallaste, prueba otra vez";

        System.out.println(aAcertado);

        System.out.println("Introduce el segundo numero: ");
        adivinaNumeros = sc.nextInt();

        System.out.println(aAcertado);

        System.out.println("Introduce el tercer numero: ");
        adivinaNumeros = sc.nextInt();

        System.out.println(aAcertado);

        System.out.println("Introduce el quarto numero: ");
        adivinaNumeros = sc.nextInt();

        System.out.println(aAcertado);
        System.out.println("Ya no tienes más intentos.");
        System.out.println("El número aleatorio era: " + numAleatorio);

    }

}