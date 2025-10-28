package repeticio;

public class Test {

    public static void main(String[] args) {

        // Bucles controlados por condición

        // while
//        int contador = 1;
//
//        while (contador <= 5) {
//            System.out.println("Iteración: " + contador);
//            contador++; // contador = contador + 1;
//
//        }

        // do-while

//        int contador = 1;
//
//        do {
//            System.out.println("Iteración: " + contador);
//            contador++;
//
//        } while (contador <= 5);

        // Bucles controlados por contador: for
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Iteración: " + i);
//
//        }

        // Salidas anticipadas
        // break
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3) {
//                break;
//
//            }
//            System.out.println("Iteración " + i);
//
//        }
//
//        System.out.println("Fuera");

        // continue
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3 || i == 4) {
//                continue;
//
//            }
//
//            System.out.println("Iteración " + i);
//
//        }
//
//        System.out.println("Fuera");

//        String cadena = "hola";
//        for (int i = 0; i < cadena.length(); i++) {
//            System.out.println(cadena.charAt(i));
//
//        }

//        for (int i = 0; i < cadena.length(); i++) {
//            System.out.println(cadena.charAt(i) + (int) cadena.charAt(i));
//
//        }

//        for (int i = 97; i <= 122; i++) {
//            System.out.println((char)i);
//
//        }

        // for-each
        // Lo veremos más adelante.

        // Bucles anidados
        for (int i = 0; i < 4; i++) {
            // System.out.println(i);
            for (int j = 0; j < 4; j++) {
                System.out.println("i = " + i + " :: j = " + j);

            }

        }

    }

}