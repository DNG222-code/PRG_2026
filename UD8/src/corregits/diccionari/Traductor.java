package corregits.diccionari;

// Representa la capacitat de traduir paraules utilitzant el diccionari.
public interface Traductor {

	// Haurà de retornar la traducció d’una paraula si existeix al diccionari.
	String traduir(String paraula);
}
