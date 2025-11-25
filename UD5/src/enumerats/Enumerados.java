package enumerats;

import java.util.Scanner;

public class Enumerados {

    public static void main(String[] args) {
        // ENUMERADOS

        DiaSemana hoy = DiaSemana.MARTES;

        Scanner sc = new Scanner(System.in);

//        if (hoy == DiaSemana.MARTES) {
//            System.out.println("Hoy es martes!");
//
//        } else {
//            System.out.println("No hoy es martes!");
//
//        }

        System.out.println("Introduzca un número de 1 a 7: ");
        int dia = sc.nextInt();

        hoy = switch (dia) {
            case 1 -> DiaSemana.LUNES;
            case 2 -> DiaSemana.MARTES;
            case 3 -> DiaSemana.MIECRES;
            case 4 -> DiaSemana.JUEVES;
            case 5 -> DiaSemana.VIERNES;
            case 6 -> DiaSemana.SABADO;
            case 7 -> DiaSemana.DOMINGO;
            default -> {
                yield DiaSemana.DOMINGO;
            }
        };

//        int salida;
        switch (hoy) {
            case LUNES -> System.out.println("Hoy es lunes!");
            case MARTES -> System.out.println("Hoy es martes!");
            case MIECRES -> System.out.println("Hoy es miércoles!");
            case JUEVES -> System.out.println("Hoy es jueves!");
            case VIERNES -> System.out.println("Hoy es viernes!");
            case SABADO -> System.out.println("Hoy es sábado!");
            case DOMINGO -> System.out.println("Hoy es domingo!");
        }
//        System.out.println("No es valido");

        System.out.println(DiaSemana.DOMINGO);

    }

}