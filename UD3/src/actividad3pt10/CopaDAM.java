package actividad3pt10;

// Importamos la clase del Scanner.
import java.util.Scanner;

public class CopaDAM {

    public static void main(String[] args) {

        // Declaramos las variables.
        String nombreEquipo1;
        String nombreEquipo2;
        String nombreEquipo3;
        String nombreEquipo4;
        String partido1;
        String partido2;
        String resultados;
        String resultadoFinal;
        int numeroAleatorio1 = 0;
        int numeroAleatorio2 = 0;

        // Generamos los número aleatorios para que eliga los equipos.
        numeroAleatorio1 = (int) (1 + Math.random() * 4);
        numeroAleatorio2 = (int) (1 + Math.random() * 4);

        // Hacemos una instancia de la clase Scanner.
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario los nombre de los equipos. Son 4.
        System.out.println("Introduce el nombre del primer equipo: ");
        nombreEquipo1 = sc.nextLine();

        System.out.println("Introduce el nombre del segundo equipo: ");
        nombreEquipo2 = sc.nextLine();

        System.out.println("Introduce el nombre del tercer equipo: ");
        nombreEquipo3 = sc.nextLine();

        System.out.println("Introduce el nombre del cuarto equipo: ");
        nombreEquipo4 = sc.nextLine();

        // Decidimos las semis de forma aleatoria segun el orden del equipo, por numeros.
        partido1 = numeroAleatorio1 == 1 ? "Local: " + nombreEquipo1 + " vs Visitante: " + nombreEquipo2 :
                    "Local: " + nombreEquipo3 + " vs Visitante: " + nombreEquipo4;

        partido2 = numeroAleatorio2 == 2 ? "Local: " + nombreEquipo1 + " vs Visitante: " + nombreEquipo2 :
                "Local: " + nombreEquipo3 + " vs Visitante: " + nombreEquipo4;

//        resultados = partidos;

        System.out.println(partido1 + "\n " + partido2);

        System.out.println(numeroAleatorio1);
        System.out.println(numeroAleatorio2);

    }

}