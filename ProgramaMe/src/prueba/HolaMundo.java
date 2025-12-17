package prueba;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        if (n >= 0 && n <= 5) {
            for (int i = 0; i < n; i++) {
                System.out.println("Hola Mundo.");
            }
        }
    }
}