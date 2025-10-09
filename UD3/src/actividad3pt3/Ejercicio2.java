package actividad3pt3;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Declararemos las variables.
        String barco = "Programación en DAM";
        int nudos = 20;
        int distancia = 900;
        double tiempoTotal;

        // Calculamos el tiempo que tardará en recorer esas millas y lo guardaremos en tiempoTotal.
        tiempoTotal = distancia / nudos;

        // Imprimimos el resultado final, con el mensaje completo.
        System.out.println("Para navegar " + distancia + " millas náuticas a " +
                nudos + " nudos, el " + barco + " tardará " + tiempoTotal + " horas");

    }

}