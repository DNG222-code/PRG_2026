package corregits.diccionari;

import java.io.*;
import java.util.*;

// Gestiona les traduccions.
public class Diccionari implements Traductor, Serializable {

	// Atributs.
	private Entrada[] entrades; // Array d’objectes Entrada per ficar-hi les traduccions del diccionari.
	
	// Contructor.
	public Diccionari() {
		// Aprofitem el constructor per a inicialitzar entrades
		// (inicialment no tindrà elements).
		this.setEntrades(new Entrada[0]);
	}
	
	// Mètodes de la classe Diccionari.
	
    // Mètodes publics de Dicionari.
	
	// Afegeix una nova entrada al diccionari.
    public void afegir(String castella, String catala) {

        Entrada nova = new Entrada(castella, catala);

        Entrada[] nou = new Entrada[this.getEntrades().length + 1];

        for (int i = 0; i < this.getEntrades().length; i++)
            nou[i] = this.getEntrades()[i];

        nou[this.getEntrades().length] = nova;

        this.setEntrades(nou);
    }
    
    // Mostra totes les entrades del diccionari ordenades naturalment.
    public void llistar() {

    	// Ordenem les entrades del diccionari (ordre natural).
        Arrays.sort(this.getEntrades());

        // Les mostrem.
        for(Entrada entrada : this.getEntrades()) {
        	System.out.println(entrada);
        }
        
//        for(int i=0;i<this.getEntrades().length;i++)
//            System.out.println(this.getEntrades()[i]);
    }
    
    // Mètodes privats de Dicionari.
    
	// Localitza una paraula en castellà dins del diccionari i retorna la seva posició.
    private int cercar(String paraula) {

        for (int i = 0; i < this.getEntrades().length; i++) {

        	// Per fer la comparació, ho passo tot a minúcules.
        	// (podria fer servir "equalsIgnoreCase" en lloc de "toLowerCawe").
            if(this.getEntrades()[i].getCastella().toLowerCase().equals(paraula.toLowerCase())) {
            	// Retornem la posició.
                return i;
            }
        }

        // Si no troba coincidència, retornem -1.
        return -1;
    }
    
    // Mètodes de Traductor.
    
    // Retorna la traducció d’una paraula si existeix al diccionari.
	@Override
	public String traduir(String paraula) {

		// Cerquem la posició de coincidència.
        int posicio = this.cercar(paraula);

        if(posicio == -1) {
        	// Si no trobem coincidència, retornem un null.
            return null;
        }

        // Retornem la traducció.
        return this.getEntrades()[posicio].getCatala();
	}

	// Getters i Setters.
	// Els faig tots privats donat que no els faré
	// servir fora de la classe.
	private Entrada[] getEntrades() {
		return entrades;
	}

	private void setEntrades(Entrada[] entrades) {
		this.entrades = entrades;
	}

}
