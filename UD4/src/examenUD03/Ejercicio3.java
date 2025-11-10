package examenUD03;

import java.util.Scanner; // Importamos la clase Scanner.

public class Ejercicio3 {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        // Variables para el input.
        String puerta;

        // Declaramos una variable para guardar la respuesta ternaria, para saber si a hacertado o no.
        String opcion;
        String esCorrecto;

        // Declaramos la variable para el número aleatorio para luego
        // escoger una palabra con el operador ternario.
        int numAleatorio;

        // Usamos la funcion de Math.random para generar
        // números aleatorios enteros.
        numAleatorio = (int) ((double) 1 + Math.random() * 2);

        // Variable para escoger una opción aleatoria.
        String opcionAleatoria;

        // Pedimos al usuario que puerta quiere abrir.
        System.out.println("Tienes que escoger una puerta: dorada o plateada?");
        puerta = sc.nextLine(); // Guardamos la respuesta en la variable puerta.

        // Vemos si el usuario ha hacertado alguna de las 2 opciones y guardamos el resultado en la variable opcion.
        opcion = puerta.charAt(0) == 'd' ?
                "Has abierto la puerta dorada. Descubres un tesoro antiguo" :
                "Has abierto la puerta plateada. Te encuentras en una habitación misteriosa sin salida.";

        // Hacemos el operador ternario para que escoga la opción el número aleatorio.
        opcionAleatoria = numAleatorio == 1 ? "dorada" : "plateada";

        // Hacemos un ternario para el caso de que no sea correcta la respuesta.
        esCorrecto = puerta != "dorada" || puerta != "plateada" ?
                "No has elegido correctamente. La decisión será aleatoria." : "Has abierto la puerta " + puerta;

        // Mostramos resultado por pantalla.
        System.out.println(opcion);
        System.out.println(esCorrecto);
        System.out.println("Has abierto la puerta " + opcionAleatoria +
                ". Te encuentras en una habitación misteriosa sin salida.");

    }

}