package corregits.encriptador1;

public class Encriptador {

//    private String ficheroMensaje;
//    private String ficheroCodigos;
//    private String ficheroCifrado;
//    private String texto;
//    private String textoCodificado;
//    private final char[] ALFABETO;
//    private final char[] CODIFICACION_ALFABETO;
//
//    // Constructor.
//    public Encriptador(String ficheroMensaje, String ficheroCodigos, String ficheroCifrado) {
//        this.setFicheroMensaje(ficheroMensaje);
//        this.setFicheroCodigos(ficheroCodigos);
//        this.setFicheroCifrado(ficheroCifrado);
//        this.setTexto();
//
//        this.ALFABETO = GestionFicheros.leerCodigo(this.getFicheroCodigos(), false);
//        this.CODIFICACION_ALFABETO = GestionFicheros.leerCodigo(this.getFicheroCodigos(), true);
//    }
//
//    public void codificaTexto() {
//        String aux = "";
//
//        for (int i = 0; i < this.getTexto().length(); i++) {
//            char caracter = this.getTexto().charAt(i);
//            if (caracter != ' ') {
//                int posicion = this.buscaPosicionCaracterAlfabeto(caracter, false);
//
//                if (posicion != -1) {
//                    char caracterCodificado = this.recuperaCaracterAlfabeto(posicion, true);
//                    aux += caracterCodificado;
//                }
//            } else {
//                aux += " ";
//            }
//
//            this.textoCodificado = aux;
//        }
//    }
//
//    private int buscaPosicionCaracterAlfabeto(char caracter, boolean esCodificado) {
//        int posicion = -1;
//        char[] alfabetoAux;
//
//        if (esCodificado) {
//            alfabetoAux = this.CODIFICACION_ALFABETO;
//        } else {
//            alfabetoAux = this.ALFABETO;
//        }
//
//        for (int i = 0; i < alfabetoAux.length; i++) {
//            if (caracter == alfabetoAux[i]) {
//                posicion = i;
//                break;
//            }
//        }
//
//        return posicion;
//    }
//
//    private char[] recuperaCaracterAlfabeto(boolean esCodificado) {
//        char[] alfabetoAux;
//
//        if (esCodificado) {
//            alfabetoAux = this.CODIFICACION_ALFABETO;
//        } else {
//            alfabetoAux = this.ALFABETO;
//        }
//
//        return alfabetoAux;
//    }
//
//    // Getters y setters.
//    private String getFicheroMensaje() {
//        return ficheroMensaje;
//    }
//
//    private void setFicheroMensaje(String ficheroMensaje) {
//        this.ficheroMensaje = ficheroMensaje;
//    }
//
//    private String getFicheroCodigos() {
//        return ficheroCodigos;
//    }
//
//    private void setFicheroCodigos(String ficheroCodigos) {
//        this.ficheroCodigos = ficheroCodigos;
//    }
//
//    private String getFicheroCifrado() {
//        return ficheroCifrado;
//    }
//
//    private void setFicheroCifrado(String ficheroCifrado) {
//        this.ficheroCifrado = ficheroCifrado;
//    }
//
//    public String getTexto() {
//        return texto;
//    }
//
//    private void setTexto() {
//        this.texto = GestionFicheros.leer(this.getFicheroMensaje().toLowerCase());
//    }
//
//    public String getTextoCodificado() {
//        return textoCodificado;
//    }
//
//    private void setTextoCodificado(String textoCodificado) {
//        this.textoCodificado = textoCodificado;
//    }
}
