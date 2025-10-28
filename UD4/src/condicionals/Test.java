package condicionals;

public class Test {

    public static void main(String[] args) {

        // if
//        int edat = 18;
//
//        if (edat >= 18) {
//            System.out.println("Eres mayor de edad.");
//
//        } else {
//            System.out.println("Eres menor de edad.");
//
//        }

        // if / else if /else

//        double nota = 7.5;

//        if (nota >= 9.0) {
//            System.out.println("Excelentes");
//        } else if (nota >= 7.0) {
//            System.out.println("Buen trabajo");
//        } else if (nota >= 5.0) {
//            System.out.println("Aprobado");
//        } else {
//            System.out.println("Suspendido!");
//
//        }

        // Anidar condicionales
//        int edad = 18;
//        String sexo = "Femenino";
//
//        if (edad >= 18) {
//            if (sexo.equals("Femenino")) {
//                System.out.println("Eres una mujer mayor de edad.");
//            } else if (sexo.equals("Masculino")) {
//                System.out.println("Eres un hombre mayor de edad.");
//            } else {
//                System.out.println("Género no determinado.");
//            }
//        } if (sexo.equals("Femenino")) {
//            System.out.println("Eres una mujer menor de edad.");
//        } else if (sexo.equals("Masculino")) {
//            System.out.println("Eres un hombre menor de edad.");
//        } else {
//            System.out.println("Género no determinado.");
//        }
//
//    }

        // Condicional múltiple SWITCH
        // switch CLÁSICO

//        int dia = 3;
//        String nombreDia;

//        switch (dia) {
//            case 1:
//                nombreDia = "Lunes";
//                break;
//            case 2:
//                nombreDia = "Martes";
//                break;
//            case 3:
//                nombreDia = "Miercoles";
//                break;
//            default:
//                nombreDia = "Día no especificado.";
//                break;
//        }
//
//        System.out.println("Hoy es: " + nombreDia);

        // switch MODERNO
        // A partir de Java 12
        // -> en lugar de case
        // Uso de llaves para agrupar bloques de código.
        // Ofrece la capacidad de volcar un valor en una variable,
        // Para ello se utiliza la palabra clave "yield".

        int dia = 2;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana";
            default -> {
                if (dia >= 8 && dia <= 14) {
                    yield "Día laboral";

                } else {
                    yield null;

                }
            }
        };

        System.out.println("Hoy es: " + nombreDia);

    }
    // switch MODERNO


}