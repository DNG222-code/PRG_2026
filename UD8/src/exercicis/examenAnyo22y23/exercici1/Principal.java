package exercicis.examenAnyo22y23.exercici1;

public class Principal {

    public static void main(String[] args) {

        Integer[] resultado = Fusio.fusionar("fitxer1.dat", "fitxer2.dat");

        Fusio.guardar(resultado);

        System.out.println("Fusió guardada en fusio.dat");
    }
}