package actividad3pt1;

public class PracticaTipusDades4 {

    public static void main(String[] args) {

        long valor = 120L; // Declaramos la variable valor.
        float altreValor = 45.8f; // Declaramos la variable altreValor.

        // Convertimos valor a float y lo guardamos en la variable valorFloat.
        float valorFloat = (float) valor;

        System.out.println("Valor Float: " + valorFloat); // Imprimimos el valorFloat.

        float sumaValors = valorFloat + altreValor; // Guardamos la suma de los 2 floats en sumaValors.

        System.out.println("Total: " + sumaValors); // Imprimimos el total.

    }

}