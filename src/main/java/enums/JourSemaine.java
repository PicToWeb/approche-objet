package enums;

public enum JourSemaine {
	
	LUNDI ("Lundi",1),
	MARDI ("Mardi",2),
	MERCREDI("Mercredi",3),
	JEUDI ("Jeudi",4),
	VENDREDI ("Vendredi",5),
	SAMEDI ("Samedi",6),
	DIMANCHE ("Dimanche",7);

	/** nom du jour (lundi à dimanche) */
	private String nom;

	/** numero du jour de 1 à 7 */
	private int numero;
	
	

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param numero
	 */
	private JourSemaine(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter for numero
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


}
