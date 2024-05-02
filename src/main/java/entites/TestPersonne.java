package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne nb1 = new Personne();
		nb1.nom = "Picron";
		nb1.prenom ="Antoine";
		nb1.adresse_postale=new AdressePostale();
		nb1.adresse_postale.numeroRue=15;
		nb1.adresse_postale.libelleRue="Ma super rue";
		nb1.adresse_postale.codePostal=34000;
		nb1.adresse_postale.ville="Montpellier";
		Personne nb2 = new Personne();
		nb2.nom = "Durant";
		nb2.prenom ="Jean";
		nb2.adresse_postale=new AdressePostale();
		nb2.adresse_postale.numeroRue=35;
		nb2.adresse_postale.libelleRue="Ma super rue 2";
		nb2.adresse_postale.codePostal=30000;
		nb2.adresse_postale.ville="Nimes";
	}

}
