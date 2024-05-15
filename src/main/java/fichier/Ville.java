package fichier;

public class Ville  {

	String nom;
	String codeDep;
	String nomRegion;
	int popTotal;

	/**
	 * @param nom
	 * @param tokens
	 * @param nomRegion
	 * @param tokens2
	 */
	public Ville(String nom, String tokens, String nomRegion, int tokens2) {
		super();
		this.nom = nom;
		this.codeDep = tokens;
		this.nomRegion = nomRegion;
		this.popTotal = tokens2;
	}

	public String toString() {
		return nom + " " + codeDep + " " + nomRegion + " " + popTotal;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotal() {
		return popTotal;
	}

	public void setPopTotal(int popTotal) {
		this.popTotal = popTotal;
	}


}
