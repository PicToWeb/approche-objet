package fr.diginamic.recensement;

public class Ville {
	
	private int codeRegion;
	private String nomRegion;
	private String codeDep;
	private int codeCommune;
	private String nomCommune;
	private int popTot;

	/**
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDep
	 * @param codeCommune
	 * @param nomCommune
	 * @param popTot
	 */
	public Ville(int codeRegion, String nomRegion, String codeDep, int codeCommune, String nomCommune, int popTot) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDep = codeDep;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTot = popTot;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTot() {
		return popTot;
	}

	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}

	@Override
	public String toString() {
		return "Ville [ Code_Région : " + getCodeRegion() + ", Nom_Région : " + getNomRegion() + ", Code_Département : "
				+ getCodeDep() + ", Code_Commune : " + getCodeCommune() + ", Nom_Commune : " + getNomCommune()
				+ ", Population_total : " + getPopTot() + "]";
	}
	
	

}
