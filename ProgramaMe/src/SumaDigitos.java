import java.util.Scanner;

public class SumaDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[9];
        int numero = 1;
        
        do {
            for (int i = 0; i < numeros.length; i++) {
                if (numero >= 0 && numero <= 10) {
                    System.out.println("Introduce un número: ");
                    numero = sc.nextInt();
                }
            }
        } while(numero > 0 && numero <= 10);
    }
}