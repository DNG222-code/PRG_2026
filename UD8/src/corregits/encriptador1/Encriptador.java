package corregits.encriptador1;

import java.io.*;

/*
	Un encriptador es una aplicación que transforma un texto haciéndolo ilegible para
	aquellos que desconocen el código.
	Diseña un programa que lea un fichero de texto
	(mensaje.txt), lo codifique y cree un nuevo archivo (secreto.txt) con el mensaje
	cifrado. El alfabeto de codificación se encontrará en el fichero codec.txt.
	Un ejemplo de codificación del alfabeto es:

	a b c d e f g h i j k l m n o p q r s t o v w x y z
	e m s r c i j n f x y w t a k o z d l q v b h o p g
 */

public class Encriptador {

    // Atributos.
    private String ficheroMensaje;
    private String ficheroCodigos;
    private String ficheroCifrado;
    private String texto; // Guardará el contenido leído de un fichero.
    private String textoCodificado; // Codificación de texto.
    private final char[] alfabeto; // {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "o", "v", "w", "x", "y", "z"};
    private final char[] codificacionAlfabeto; //{"e", "m", "s", "r", "c", "i", "j", "n", "f", "x", "y", "w", "t", "a", "k", "o", "z", "d", "l", "q", "v", "b", "h", "o", "p", "g"};

    // Constructor
    public Encriptador(String ficheroMensaje, String ficheroCodigos, String ficheroCifrado) {
        // Informamos a los atributos necesarios.
        this.setFicheroMensaje(ficheroMensaje);
        this.setFicheroCodigos(ficheroCodigos);
        this.setFicheroCifrado(ficheroCifrado);
        this.setTexto();

        // Recuperamos los códigos.
        this.alfabeto = GestionFicheros.leerCodigo(this.getFicheroCodigos(), false);
        this.codificacionAlfabeto = GestionFicheros.leerCodigo(this.getFicheroCodigos(), true);
    }

    // Métodos de la clase.
    public void codificaTexto() {
        String aux = "";

        // Recorremos texto y codificamos letra a letra, según
        // su posición en el array.
        for(int i = 0; i < this.getTexto().length(); i++) {
            // Capturamos el caracter.
            char caracter = this.getTexto().charAt(i);
            if(caracter != ' ') {
                // Buscamos su posición en el alfabeto.
                int posicion = this.buscaPosicionCaracterAlfabeto(caracter, false);
                if(posicion != -1) {
                    // Recuperamos el caracter que ocupa la misma posición
                    // en el alfabeto codificado.
                    char caracterCodificado = this.recuperaCaracterAlfabeto(posicion, true);
                    aux += caracterCodificado;
                }
            } else {
                aux += ' ';
            }
        }

        this.setTextoCodificado(aux);
    }

    // Busca la posición que ocupa un caracter en un array.
    private int buscaPosicionCaracterAlfabeto(char caracter, boolean esCodificado) {
        // Variables auxiliares.
        int posicion = -1;
        char[] alfabetoAux;

        // Decidimos qué alfabeto utilizar.
        if(esCodificado) {
            alfabetoAux = this.codificacionAlfabeto;
        } else {
            alfabetoAux = this.alfabeto;
        }

        // Buscamos la posición.
        for(int i = 0; i < alfabetoAux.length; i++) {
            if(caracter == alfabetoAux[i]) {
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
        if(esCodificado) {
            alfabetoAux = this.codificacionAlfabeto;
        } else {
            alfabetoAux = this.alfabeto;
        }

        return alfabetoAux[posicion];
    }

    // Getters y Setters.
    private String getFicheroMensaje() {
        return ficheroMensaje;
    }
    private void setFicheroMensaje(String ficheroMensaje) {
        this.ficheroMensaje = ficheroMensaje;
    }
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
    private void setTexto() {
        this.texto = GestionFicheros.leer(this.getFicheroMensaje()).toLowerCase();
    }
    public String getTextoCodificado() {
        return textoCodificado;
    }
    private void setTextoCodificado(String textoCodificado) {
        this.textoCodificado = textoCodificado;
    }
}
