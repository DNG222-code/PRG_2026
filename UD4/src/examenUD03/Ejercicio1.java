package examenUD03;

import java.util.Scanner; // importamos la clase Scanner.

public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaramos las variables.
        Scanner sc = new Scanner(System.in);

        // Variables de input.
        int temperatura;
        int memoria;
        String ruido;
        boolean seApaga;

        // Variables para los ternarios.
        String problemaCPU;
        String problemaRAM;
        String problemaRuido;
        String problemaApagado;

        // Pedimos al usuario la temperatura de la CPU.
        System.out.println("Temperatura CPU: ");
        temperatura = sc.nextInt(); // Se guarda la respuesta en la variables temperatura.

        // Hacemos el operador ternario para la CPU que el resultado se guardará en la variable problemaCPu.
        problemaCPU = temperatura > 80 ? "Problema: La temperatura de la CPU es demasiado alta." :
                "Todo funciona correctamente. ¡El ordenador está en buen estado!";

        // Mostramos el resultado del ternario.
        System.out.println(problemaCPU);

        // Pedimos al usuario la RAM disponible.
        System.out.println("RAM disponible: ");
        memoria = sc.nextInt(); // Guardamos la RAM que tiene en la variable memoria.

        // Hacemos el operador ternario para la RAM que el resultado se guardará en la variable problemaRAM.
        problemaRAM = memoria < 4 ? "Problema: No hay bastante memoria RAM." :
                "Todo funciona correctamente. ¡El ordenador está en buen estado!";

        // Mostramos el resultado del ternario.
        System.out.println(problemaRAM);

        // Pedimos al usuario si el ventilador hace ruido.
        System.out.println("Ventilador ruidoso? (S/s o N/n) ");
        ruido = sc.next(); // Guardamos la respuesta en la variable ruido.

        // Hacemos el operador ternario para el ruido del ordenador, que el resultado se guardara en la variable problemaCPu.
        problemaRuido = ruido != "N" || ruido != "n" ? "Problema: El ventilador hace ruidos extraños." :
                "Todo funciona correctamente. ¡El ordenador está en buen estado!";

        // Mostramos el resultado del ternario.
        System.out.println(problemaRuido);

        // Pedimos al usuario si se apaga solo.
        System.out.println("Se apaga solo? (true/false)");
        seApaga = sc.nextBoolean(); // Se guarda la respuesta en la variable seApaga.

        // Hacemos el operador ternario para saber si se apaga el ordenador o no, el resultado se guardará en la variable,
        // problemaApagado.
        problemaApagado = seApaga == true ? "Problema: El ordenador se apaga de forma inesperada." :
                "Todo funciona correctamente. ¡El ordenador está en buen estado!";

        // Mostramos el resultado del ternario.
        System.out.println(problemaApagado);

    }

}