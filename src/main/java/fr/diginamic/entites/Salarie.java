package fr.diginamic.entites;

public class Salarie {

	String nom;
	String prenom;
	double salaire;
	
	public Salarie(String [] array) {
		nom = array[0];
		prenom = array[1];
		String replace = array[2].replace(" ", "");
		double transform = Double.parseDouble(replace);
		salaire=transform;
	}
	
	public String toString() {
		return "Nom : " + nom + " Prenom : " + prenom + " Salaire : " + salaire;
	}
	
	
}
