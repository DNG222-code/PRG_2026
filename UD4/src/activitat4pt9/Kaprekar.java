package activitat4pt9;

import java.util.Scanner; // Importamos la clase Scanner.

public class Kaprekar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        // Pedir número válido
        do {
            System.out.print("Introduce un número de 4 cifras: ");
            num = sc.nextInt();

        } while (!numeroValido(num));

        // Llamar al método recursivo
        int pasos = recursivo(num, 0);

        System.out.println("El número necesita " + pasos + " iteraciones para llegar a 6174.");

    }

    // --- Método recursivo ---
    public static int recursivo(int num, int pasos) {

        // Caso base: cuando llegamos a 6174
        if (num == 6174) {
            return pasos;

        }

        pasos++; // contamos un paso

        // Extraer dígitos
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        // Ordenar dígitos de forma descendente (burbuja manual)
        int temp;
        if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; }
        if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; }
        if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }
        if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; }
        if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; }
        if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }

        // Construir los números mayor y menor
        int mayor = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        int menor = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

        int resultado = mayor - menor;

        // Mostrar el proceso
        System.out.printf("%04d - %04d = %04d\n", mayor, menor, resultado);

        // Llamada recursiva con el nuevo número
        return recursivo(resultado, pasos);

    }

    // --- Comprobación del número válido ---
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