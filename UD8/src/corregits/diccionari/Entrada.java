package corregits.diccionari;

import java.io.*;

// Representa una entrada del diccionari, formada per
// la paraula en castellà i la seva traducció en català.
// Serialitzem per poder emprar la classe a fitxers binaris.
public class Entrada implements Comparable<Entrada>, Serializable {

	// Atributs.
	private String castella; // La paraula en castellà. Només lectura.
	private String catala; // La paraula en català.  Només lectura.
	
	// Constructors.
	public Entrada(String castella, String catala) {
		this.setCastella(castella);
		this.setCatala(catala);
	}
	
	// Ordre natural: castellà.
	@Override
	public int compareTo(Entrada o) {

		return this.castella.compareTo(o.castella);
	}

	// Mètodes sobreescrits d'Object.
	// Mostra l’informació de la parella de paraules,
	// amb el format: ES: paraulaEnCastellà -> CA: paraulaEnCatalà
	public String toString() {
		return Idioma.CASTELLA.getCodi() + ": " + this.castella + " -> " + Idioma.CATALA.getCodi() + ": " + this.catala;
	}
	// Getters i Setters.
	public String getCastella() {
		return castella;
	}

	// Només lectura.
	private void setCastella(String castella) {
		this.castella = castella;
	}

	public String getCatala() {
		return catala;
	}

	// Només lectura.
	private void setCatala(String catala) {
		this.catala = catala;
	}

	
	
}
