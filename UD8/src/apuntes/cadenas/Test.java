package apuntes.cadenas;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        char c = 'A';
//        int cu = c;
//        System.out.println(cu);

        int n = 67;
        char letra = (char) n;

//        c++; // Se incrementa a la siguiente letra.
//        System.out.println(c);

//        System.out.println(Character.isLetter(c));
//        System.out.println(Character.isDigit(c));
//        System.out.println(Character.isUpperCase(c));
//        System.out.println(Character.isLowerCase(c));
//        System.out.println(Character.isWhitespace(c));

        // STRING
        String cadena = "Hola";
        String cadena2 = new String("hola");

//        System.out.println(cadena.equalsIgnoreCase(cadena2.toLowerCase()));

//        System.out.println(cadena.compareTo(cadena2));

//        System.out.println(cadena.concat(" mundo"));

        char c = cadena.charAt(3);
//        System.out.println(c);
//        String subCadena = cadena.substring(0, cadena.length()); // Si pasa la cadena, da Error.
//        System.out.println(subCadena);

//        System.out.println(cadena.indexOf("l")); // Si no está la letra da un -1.

//        System.out.println(cadena.lastIndexOf("a"));

//        System.out.println(cadena.isEmpty());

//        System.out.println(cadena.contains("how"));

//        System.out.println(cadena.startsWith("h"));

//        System.out.println(cadena.endsWith("a"));

//        String[] partesCadena = cadena.split(",");
//        System.out.println(Arrays.toString(partesCadena));

        char[] letras = cadena.toCharArray();
        System.out.println(Arrays.toString(letras));

        String cadenaDeNuevo = String.valueOf(letras); // Junta la cadena.
        System.out.println(cadenaDeNuevo);
    }
}
