package activitat6pt6;

public class AsistenteDirector extends Director {

    // Atributo
    int producciones;

    // Constructor con los atributos heredados.
    public AsistenteDirector(String nombre, int edad, String estilo, int producciones) {
        super(nombre, edad, estilo);
        this.producciones = producciones;
    }

    // Sobreescribimos el método toString.
    @Override
    public String toString() {
        return super.toString() + ", producciones: " + producciones;
    }
}