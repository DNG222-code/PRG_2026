package examenU03;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String pastilla = "azul";
        String pastillaIntroducida;
        String pastillaRoja = "rojo";
        String pastillaAleatoria;
        String pastillaDefinitiva;

        int numAleatorio = (int) (1 + Math.random() * 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un color: ");
        pastillaIntroducida = sc.nextLine();

        pastillaAleatoria = numAleatorio == 1 ? pastilla : pastillaRoja;

        pastillaDefinitiva = (pastillaIntroducida != pastilla || pastillaIntroducida != pastillaRoja) ?
                "No has introducido el color que toca " + pastillaAleatoria : pastilla;

        System.out.println(pastillaDefinitiva);

    }

}