package actividad3pt2;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Declaramos las variables que nos dice el enunciado.
        boolean esCaptial = true;
        int nombreDeCiutadans = 10000;
        double extensio = 50.0;

        // Hacemos la condición booleana.
        boolean esMetorpolis = (esCaptial && nombreDeCiutadans > 50000 || extensio > 100.0) ? true : false;

        // Imprimimos el valor que nos da la expresión booleana.
        System.out.println("¿Es metropolis? " + esCaptial);

    }

}