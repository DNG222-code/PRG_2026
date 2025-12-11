package activitat6pt6;

public class Solista extends Cantante {

    // Atributo
    String[] repertorio = new String[3];

    // Constructor.
    public Solista(String nombre, int edad, TipoVoz voz, String... repertorio) {
        super(nombre, edad, voz);
        this.repertorio = repertorio;
    }

    // Método
    public void muestraRepertorio() {
        // Mostramos los repertorios de la cadena.
        for (String r : repertorio) {
            System.out.println(r);
        }
    }

    // Sobreescribimos el método to String.
    @Override
    public String toString() {
        return super.toString() + ", repertorio: " + repertorio;
    }
}