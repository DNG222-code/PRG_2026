package exercicis.examenAnyo22y23.exercici2;

public class Esportistes {
    static int edat;
    static double pes;
    static double alsada;

    public static void calcularMedia() {

        TratamentFichers.leer(edat, pes, alsada);

        double calcularMediaPes;
        double calcularMediaAlsada;

        calcularMediaPes = pes + pes / 2;
        calcularMediaAlsada = alsada + alsada / 2;
        System.out.println("Media Pes: " + calcularMediaPes);
        System.out.println("Media Alsada: " + calcularMediaAlsada);
    }
}
