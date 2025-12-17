package prueba;

import java.util.*;

public class SumaDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[9];

        while (true) {
            // Leer 9 números (si aparece un negativo, salir)
            for (int i = 0; i < numeros.length; i++) {
                int n = sc.nextInt();
                if (n < 0) {
                    sc.close();
                    return; // termina el programa
                }
                numeros[i] = n;
            }

            // Sumar los 9 números
            int suma = 0;
            for (int num : numeros) {
                suma += num;
                System.out.println(suma);
            }
        }
    }
}