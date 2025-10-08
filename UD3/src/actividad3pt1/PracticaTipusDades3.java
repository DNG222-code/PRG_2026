package actividad3pt1;

public class PracticaTipusDades3 {

    public static void main(String[] args) {

        int valor = 75; // Declaramos la variable valor y le asignamos el 75.
        double altreValor = 15.5; // Declaramos la variable altreValor y le asignamos 15.5.

        double valorDoble = (double) valor; // Declaramos valorDoble y hacemos un cast con double.

        System.out.println("Valor en double: " + valorDoble); // Imprimimos el resultado.

        // Declaramos la variable sumaValors y sumamos el valorDoble y altreValor.
        double sumaValors =  valorDoble + altreValor;

        System.out.println("Total: " + sumaValors); // Imprimimos el resultado.

    }

}