package corregits.diccionari;

// Defineix els idiomes del diccionari i proporciona un mètode per obtenir el seu codi.
public enum Idioma {

	CASTELLA, CATALA;
	
	// Per obtenir el codi de l'idioma.
	public String getCodi() {
		return 
				switch (this) {
					case CASTELLA -> "ES";
					case CATALA -> "CA";		
					default -> "ES";		
				};
	}
}
