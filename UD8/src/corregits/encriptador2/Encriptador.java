package corregits.encriptador2;

/*
    Diseña un programa que lea el fichero secreto.txt y lo descodifique utilizando la
    información de codec.txt. El mensaje descifrado aparecerá en la consola.
*/

public class Encriptador {

    // Atributos.
    private String ficheroCodigos;
    private String ficheroCifrado;
    private String texto; // Descodificación de textCodificado.
    private String textoCodificado; // Guardará el contenido leído de un fichero.
    private final char[] alfabeto;
    private final char[] codificacionAlfabeto;

    // Constructor
    public Encriptador(String ficheroCodigos, String ficheroCifrado) {
        // Informamos a los atributos necesarios.
        this.setFicheroCodigos(ficheroCodigos);
        this.setFicheroCifrado(ficheroCifrado);
        this.setTextoCodificado();

        // Recuperamos los códigos.
        this.alfabeto = GestionFicheros.leerCodigo(this.getFicheroCodigos(), false);
        this.codificacionAlfabeto = GestionFicheros.leerCodigo(this.getFicheroCodigos(), true);
    }

    // Métodos de la clase.
    public void desCodificaTexto() {
        String aux = "";

        // Recorremos textoCodificado y descodificamos letra a letra, según
        // su posición en el array.
        for (int i = 0; i < this.getTextoCodificado().length(); i++) {
            // Capturamos el caracter.
            char caracterCodificado = this.getTextoCodificado().charAt(i);
            if (caracterCodificado != ' ') {
                // Buscamos su posición en el alfabeto.
                int posicion = this.buscaPosicionCaracterAlfabeto(caracterCodificado, true);
                if (posicion != -1) {
                    // Recuperamos el caracter que ocupa la misma posición
                    // en el alfabeto codificado.
                    char caracter = this.recuperaCaracterAlfabeto(posicion, false);
                    aux += caracter;
                }
            } else {
                aux += ' ';
            }
        }

        this.setTexto(aux);
    }

    // Busca la posición que ocupa un caracter en un array.
    private int buscaPosicionCaracterAlfabeto(char caracter, boolean esCodificado) {
        // Variables auxiliares.
        int posicion = -1;
        char[] alfabetoAux;

        // Decidimos qué alfabeto utilizar.
        if (esCodificado) {
            alfabetoAux = this.codificacionAlfabeto;
        } else {
            alfabetoAux = this.alfabeto;
        }

        // Buscamos la posición.
        for (int i = 0; i < alfabetoAux.length; i++) {
            if (caracter == alfabetoAux[i]) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    // Recupera el caracter que ocupa una posición determinada en un array.
    private char recuperaCaracterAlfabeto(int posicion, boolean esCodificado) {
        // Variables auxiliares.
        char[] alfabetoAux;

        // Decidimos qué alfabeto utilizar.
        if (esCodificado) {
            alfabetoAux = this.codificacionAlfabeto;
        } else {
            alfabetoAux = this.alfabeto;
        }

        return alfabetoAux[posicion];
    }

    // Getters y Setters.
    private String getFicheroCodigos() {
        return ficheroCodigos;
    }

    private void setFicheroCodigos(String ficheroCodigos) {
        this.ficheroCodigos = ficheroCodigos;
    }

    public String getFicheroCifrado() {
        return ficheroCifrado;
    }

    private void setFicheroCifrado(String ficheroCifrado) {
        this.ficheroCifrado = ficheroCifrado;
    }

    public String getTexto() {
        return texto;
    }

    // texto se recupera de un fichero.
    private void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTextoCodificado() {
        return textoCodificado;
    }

    private void setTextoCodificado() {
        this.textoCodificado = GestionFicheros.leer(this.getFicheroCifrado()).toLowerCase();
    }
}