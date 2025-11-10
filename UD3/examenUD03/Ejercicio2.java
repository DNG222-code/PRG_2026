package examenUD03;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaramos las variables fijas:
        final int NUM_COMENSALES = 6;
        final double FRUTA_PER_PERSONA = 120.5;

        // Variables para los totales.
        double totalFruta;
        double totalAzucar;
        double totalAgua;

        // Variables para los truncados.
        int totalAzucarInt = 0;
        int totalAguaInt = 0;

        // Hacemos los calculos para saber los totales.
        totalFruta = NUM_COMENSALES * FRUTA_PER_PERSONA; // Nos da el total de fruta.
        totalAzucar = totalFruta / 5; // Nos da el total de azucar.
        totalAgua = totalAzucar * 15; // Nos da el total de agua.

        // Truncamos los totales.
        totalAzucarInt = (int) totalAzucar;
        totalAguaInt = (int) totalAgua;

        // Mostramos los resultados por pantalla.
        System.out.println("Para preparar zumo para 6 personas: ");
        System.out.println("Fruta: " + totalFruta + " gramos");
        System.out.println("Azucar: " + totalAzucar + " (con decimales)" + " - " + totalAzucarInt
                + " unidades" + " (truncado)");
        System.out.println("Agua: " + totalAgua + " (con decimales)" + " -  " + totalAguaInt
                + " unidades" + " (truncado)");

    }

}