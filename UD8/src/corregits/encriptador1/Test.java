package corregits.encriptador1;

public class Test {

    public static void main(String[] args) {

        // Cargamos el mensaje.
        Encriptador encriptador = new Encriptador("UD8/FichersEncriptador/mensaje.txt",
                "UD8/FichersEncriptador/codec.txt",
                "secreto.txt");

        // Mostramos el contenido del mensaje.
        System.out.println("Texto a codificar:");
        System.out.println(encriptador.getTexto());

        // Encriptamos el texto.
        encriptador.codificaTexto();

        // Mostramos el texto encriptado.
        System.out.println("Texto codificado:");
        System.out.println(encriptador.getTextoCodificado());

        // Guardamos el texto encriptado.
        GestionFicheros.escribeFichero(encriptador.getTextoCodificado(), encriptador.getFicheroCifrado());
    }
}
