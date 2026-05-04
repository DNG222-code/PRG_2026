package exercicis.activitat10pt9;

import java.io.*;

public class TratamientoFicheros implements Serializable {

    public static void leerFicheros(String pathLectura) throws FileNotFoundException, IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(pathLectura))) {
            String linea = "";

            while (linea != null) {
                linea = in.readUTF();
            }
        }
    }

    public static void escribirFicheros(String pathEscritura) throws FileNotFoundException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(pathEscritura))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
