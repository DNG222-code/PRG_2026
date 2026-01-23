package activitat7pt3;

public interface OrdenaDNI extends Comparable<Futbolista> {

    // Método compareTo.
    @Override
    public default int compareTo(Futbolista o) {
        Futbolista f = (Futbolista) o;

        return f.dni.compareTo(o.dni);
    }
}
