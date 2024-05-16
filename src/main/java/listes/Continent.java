package listes;

public enum Continent {

	EUROPE("Europe"), AFRIQUE("Afrique"), ASIE("Asie"), OCEANIE("Océanie"), AMERIQUE("Amérique");

	private String libelle;

	/**
	 * Constructor
	 * 
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter for libelle
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}
