package actividad3pt4;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaramos las variables para hacer el calculo del curso.
        double primerTrimestre;
        double segundaTrimestre;
        double tercerTrimestre;
        double mediaCurso;

        // Declaramos el Scanner, para pedir la nota al usuario.
        Scanner sc = new Scanner(System.in);

        // Pedimos todas las notas.
        System.out.println("Ingrese la nota del primer trimestre: ");
        primerTrimestre = sc.nextDouble();

        System.out.println("Ingrese la nota del segunda trimestre: ");
        segundaTrimestre = sc.nextDouble();

        System.out.println("Ingrese la nota del tercer trimestre: ");
        tercerTrimestre = sc.nextDouble();

        // Hacemos el calculo de la media del curso.
        mediaCurso = ((primerTrimestre + segundaTrimestre + tercerTrimestre) / 3);

        // Mostramos los resultados al usuario.
        System.out.println("La media final del alumno en decimales, es: " + mediaCurso);

        int mediaCursoEntro = (int) mediaCurso; // Hacemos un cast para que salga solo decimales.
        System.out.println("La media final del alumno en entro, es: " +  mediaCursoEntro);

    }

}