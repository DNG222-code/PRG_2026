package activitat4pt8;

import java.util.Scanner; // Importamos la clase Scanner.

public class Kaprekar {

    public static void main(String[] args) {

        // Declaramos la variables que usaremos.
        Scanner sc = new Scanner(System.in);
        int num;
        int pasos = 0;
        int temp;

        // Pedir número válido
        do {
            System.out.print("Introduce un número de 4 cifras: ");
            num = sc.nextInt();

        } while (!numeroValido(num));

        // Repetir hasta llegar a 6174
        while (num != 6174) {
            pasos++;

            // Extraer dígitos
            int d1 = num / 1000;
            int d2 = (num / 100) % 10;
            int d3 = (num / 10) % 10;
            int d4 = num % 10;

            // Ordenar dígitos manualmente (burbuja simple)
            if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; }
            if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; }
            if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }
            if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; }
            if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; }
            if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }

            // Ahora d1 >= d2 >= d3 >= d4 (orden descendente)
            int mayor = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

            // Orden ascendente invertido (d4,d3,d2,d1)
            int menor = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

            num = mayor - menor;

            System.out.printf("%04d - %04d = %04d\n", mayor, menor, num);
        }

        System.out.println("El número necesita " + pasos + " iteraciones para llegar a 6174.");
    }

    // Comprobar número válido: 4 cifras y no todos iguales
    public static boolean numeroValido(int n) {
        if (n < 1000 || n > 9999) return false;

        int d1 = n / 1000;
        int d2 = (n / 100) % 10;
        int d3 = (n / 10) % 10;
        int d4 = n % 10;

        // Ver si los 4 dígitos son iguales
        return !(d1 == d2 && d2 == d3 && d3 == d4);

    }

}