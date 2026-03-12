package corregits.diccionari;

import java.io.*;

// S’encarrega de gestionar la persistència
// de les dades del diccionari en un fitxer binari.
public class FitxerDiccionari {

	
    public static Diccionari carregar(String nomFitxer) {

    	// Treballem amb recursos, d'aquesta manera no s'ha de tancar el fitxer.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFitxer))) {

        	// Creem un diccionari i li assignem el contingut del fitxer.
            Diccionari diccionari = (Diccionari) ois.readObject();

            // El retornem.
            return diccionari;

        } catch(ClassNotFoundException ex) {
        	System.out.println("Error en recuperar l'informació del ficher \"" + nomFitxer + "\".\nCrearem un diccionari nou");
        	// Retornem un diccionari nou (que estarà buit).
            return new Diccionari();
        } catch (IOException ex) {
        	// Quan carreguem, no considerem un error que no hi hagi dades en el fitxer.
        	// Retornem un diccionari nou (que estarà buit).
            return new Diccionari();
        }
    }

    // Escriu en el fitxer l’objecte Diccionari.
    public static void guardar(Diccionari diccionari, String nomFitxer) {

    	// Treballem amb recursos, d'aquesta manera no s'ha de tancar el fitxer.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFitxer))) {

        	// Escribim l'objecte en el diccionari.
            oos.writeObject(diccionari);

        } catch(IOException ex) {
            System.out.println("Error en guardar el fitxer: \"" + nomFitxer + "\".");
        }
    }
}
