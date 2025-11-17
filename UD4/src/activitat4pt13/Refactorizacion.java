package activitat4pt13;

public class Refactorizacion {

    public static void main(String[] args) {

        int[] numeros = {2, 5, 8, 1, 4, 7};
        int suma = 0;
        int maximo = numeros[0];

        suma = sumaYMaximo(suma, maximo, numeros);

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El número máximo es: " + maximo);
        System.out.println("Números mayores que 4:");

        numMayores(numeros);

    }

    public static int sumaYMaximo(int suma, int maximo, int[] numeros) {
        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;

            }

        }

        return suma;

    }

    public static int numMayores(int[] numeros) {
        for (int numero : numeros) {
            if (numero > 4) {
                System.out.println(numero);

            }

        }

        return numeros.length;

    }

}