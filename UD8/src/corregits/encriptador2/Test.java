package corregits.encriptador2;

public class Test {

    public static void main(String[] args) {

        // Cargamos el mensaje.
		Encriptador encriptador = new Encriptador("UD8/FichersEncriptador/codec.txt",
                "UD8/FichersEncriptador/secreto.txt");

		// Mostramos el contenido del mensaje.
		System.out.println("Texto a descodificar:");
		System.out.println(encriptador.getTextoCodificado());

		// Encriptamos el texto.
		encriptador.desCodificaTexto();

		// Mostramos el texto desencriptado.
		System.out.println("Texto descodificado:");
		System.out.println(encriptador.getTexto());
    }
}
