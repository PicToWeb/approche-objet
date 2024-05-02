package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse_postale;

	public Personne(String name, String firstName) {
		nom = name;
		prenom = firstName;
	}

	public Personne(String name, String firstName, AdressePostale adress) {
		nom = name;
		prenom = firstName;
		adresse_postale = adress;
	}

	public void display() {
		System.out.println("Bonjour, je suis : " + nom.toUpperCase() + " " + prenom);
	}

	public void setNom(String name) {
		nom = name;
	}

	public String getNom() {
		return nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setAdress(AdressePostale adresse) {
		adresse_postale = adresse;
	}

	public AdressePostale getAdress() {
		return adresse_postale;
	}
}
