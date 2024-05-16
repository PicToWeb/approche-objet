package testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Été", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int orderNum;

	/**
	 * Constructor
	 * 
	 * @param libellé
	 * @param orderNum
	 */
	private Saison(String libelle, int orderNum) {
		this.libelle = libelle;
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return libelle + " " + orderNum;
	}

	/**
	 * Getter for libellé
	 * 
	 * @return the libellé
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter for orderNum
	 * 
	 * @return the orderNum
	 */
	public int getOrderNum() {
		return orderNum;
	}

	public static Saison extraireSaisonParLibelle(String value) {
		Saison[] saison = values();
		for (Saison s : saison) {
			if (s.getLibelle().equals(value))
				return s;
		}
		return null;
	}

}
