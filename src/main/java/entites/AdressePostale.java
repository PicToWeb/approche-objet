package entites;

public class AdressePostale {

	// variable de classe de type constante
	public static final int NB_DEPARTEMENTS = 101;
	
	//variable de classe
	public static int nb_dep = 34;
	//on utilisera AdressePostale.nb_dep = 30; -> pour le modifier 

	// variable d'instance
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	private String ville;

	public AdressePostale(int nRue, String rue, int cp, String ville) {
		numeroRue = nRue;
		libelleRue = rue;
		codePostal = cp;
		this.ville = ville;

	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
