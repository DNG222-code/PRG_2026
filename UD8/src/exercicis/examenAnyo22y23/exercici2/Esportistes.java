package exercicis.examenAnyo22y23.exercici2;

public class Esportistes {

    static int edat;
    static double pes;
    static double alsada;
    static int count = 0;

    static double sumaPes = 0.0;
    static double sumaAlsada = 0.0;

    public static void calcularMedia() {

        TratamentFichers.leer(edat, pes, alsada, count);

        sumaPes += pes;
        sumaAlsada += alsada;
        count++;

        System.out.println();

        double mediaPes = sumaPes / count;
        double mediaAlsada = sumaAlsada / count;

        System.out.println("Media Pes: " + mediaPes);
        System.out.println("Media Alsada: " + mediaAlsada);
    }
}
