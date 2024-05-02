package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;

	public AdressePostale(int nRue, String rue,int cp, String ville) {
		numeroRue=nRue;
		libelleRue=rue;
		codePostal=cp;
		this.ville=ville;
		
		
	}
	
}
