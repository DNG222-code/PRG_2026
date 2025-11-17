package actividad3pt2;

public class Ejercicio2 {

    public static void main(String[] args) {
        boolean esCapital = true;
        int nombreDeCiutadans = 30000;
        double impostPerCiutada = 0.0;

        boolean esMetropolis = (esCapital && nombreDeCiutadans > 100000)
                || (nombreDeCiutadans > 200000 && (nombreDeCiutadans * impostPerCiutada * 12) > 720000000) ? true : false;

        System.out.println("És metropolis? " + esMetropolis);

    }

}