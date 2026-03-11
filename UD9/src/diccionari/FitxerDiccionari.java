package diccionari;

import java.io.*;

public class FitxerDiccionari {

    public static Diccionari carregar(String nomFitxer) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFitxer))) {
            Diccionari diccionari = (Diccionari) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en recuperar el fitxer: " + e.getMessage() + "\nCrearem un nou diccionari");
            return new Diccionari();
        }
        return new Diccionari();
    }

    public static void guardar(Diccionari diccionari, String nomFitxer) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFitxer))) {
            oos.writeObject(diccionari);
        } catch (IOException e) {
            System.out.println("Error en guardar el fitxer: " + e.getMessage());
        }
    }
}
