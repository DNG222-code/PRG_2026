package variables;

public class Test {

    public static void main(String[] args) {
        // UD3 - El Llenguatge Java
        // variable

//        boolean isGanadorSiPierde = true; // false.
//        // isGanadorSiPierde = true;
//
//        System.out.println(isGanadorSiPierde);
//
//        // int
//        int numero = 2;
//        int otroNumero = numero;
//
//        System.out.println(numero);
//        System.out.println(otroNumero);
//
//        // Com nomenar variables
//        int edat = 22;
//        int Edat = 23; // Son variables diferents.
//        int edatPare = 22;
//        edatPare = 23;
//
//        // Constant
//        final double PI = 3.14;
//
//        String dni = "424242H";
//        final String DNI_PARE = dni; // Constant van totes en majúscula.

        // 2. Operadors i Expressions
        // =

        // Tipus de dades primitius
        // Lògics | boolean | true, false
        // Caràcters | char caràcters unicode
        // Numèrics | byte      | enter de 8 bits
        //          | short     | enter de 16 bits
        //          | int       | enter de 32 bits
        //          | long      | enter de 64 bits
        //          | float     | real de 32 bits
        //          | double    | real de 64 bits

        // String - java.lang.String, es una clase.

        // Tipus de dades numèrics
        // byte         8 bits (1 byte) de  -128 a 127 valor defecte: 0
        // short        16 bits         de -32768 a 32767 valor defecte: 0
        // int          32 bits         de -2^31 a 2^31 -1 valor defecte: 0
        // long         64 bits         de -2^63 a 2^63 -1 valor defecte: 0L long(L)

        // IEEE754
        // Núm = mantissa * base^exponent
        // 345 = 0.345 * 10^3
        // float        32 bits 0.0f
        // double       63 bits 0.0d

        // Operadors numèrics
        // Tipus                Operador    Precedència     Operació
        // Prefix, postfix      -- ++       exp++ ++expr    Increment/decrement
//        int numero = 5;
//        System.out.println(numero);
//        numero++;
//        ++numero;
        // --numero;
//        System.out.println(numero);

        // Unaris               + -     + -                 Canviar de signe
//        int numero = 5;
//        numero = -numero;
//        System.out.println(numero);
        // Multiplicatius      * / %    * / %               Mult, divisió i residu
//        int numerador = 10;
//        int denominador = 2;
//        System.out.println(numerador % denominador);

        // Aditius              +, -    +, -                Suma i restar
//        int numero1 = 10;
//        int numero2 = 2;
//        int resultat = numero1 + numero2;
//        System.out.println(numero1 + numero2); // resultat anónim.
//
//        System.out.println(resultat);

        // Operadors numèrics d'assignació abreujada
        // Operador     Ús              Equivalent a
        // +=           op1 += op2      op1 = op1 + op2
//        int op1 = 5;
//        int op2 = 3;
//        op1 = op1 + op2;
//        op1 += op2;
//        System.out.println(op1);
        // -=           op1 -= op2      op1 = op1 - op2
        // *=           op1 *= op2      op1 = op1 * op2
        // /=           op1 /= op2      op1 = op1 / op2
        // %=           op1 %= op2      op1 = op1 % op2

        // Tipus de dades lògics o booleanes
        // true, false

        // Operadors lògics condicionals
        // !    Negació del valor
        // &&   AND
        // ||   OR
        // ?:   Operador ternari.

//        boolean esMayorDeEdad = true;
//        boolean esDona = true;
//        System.out.println(esMayorDeEdad && esDona);
//        // System.out.println(esMayorDeEdad || esDona);
//        // System.out.println(!esMayorDeEdad); // Pasa a ser false.

        // Operadors lògics relacionals
        // == true si els dos valors son true
//        int numero1 = 5;
//        int numero2 = 10;
//        boolean prova = (numero1 == numero2);
//        boolean prova = !(numero1 == numero2);

        // !=   invers a ==
        // >    mayor a
        // >=   mayor igual
//        boolean prova = (numero1 != numero2);
//        System.out.println(prova);

//        boolean prova = (numero1 > numero2);
//        System.out.println(prova);
//
//        boolean prova = (numero1 >= numero2);
//        System.out.println(prova);

        // Tipus de dades per caràcters
        // char (intimament lligat a int)
//        char lletra = 'a'; // Unicode (16 bits)

        // String - Tipus de dada estructurada
//        String cadena = "Cuando despertó, el dinosaurio todavía estaba allí.";
//        // +
//        String a = "Hola ";
//        String b = "qué tal?";
//        String c = a + b;
//        System.out.println(c); // Concatenar

        // Conversió de tipus
//        int a = 2; // 2
//        double x = a; // 2.0
//
//        System.out.println(a);
//        System.out.println(x);

//        int c = '*';
//        System.out.println(c); // ASCII

//        int a = (int)2.4;
//        System.out.println(a);

//        System.out.println(5/9); // Posa 0 perque no hi espai.
//        System.out.println((double) 5/9);

        // Comentaris

        // Variables de l'aplicació
        int edad = 33; // Edad de l'usuari.

        // Comentaris en línea
        /*
        *
        *
        *
        *
        */

        // Comentari de documentació
        /**
         *
         */

    }

}
