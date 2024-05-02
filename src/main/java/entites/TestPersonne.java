package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//méthode 1
		AdressePostale a1 = new AdressePostale(60,"Rue de la joie",34000,"Montpellier");
		Personne nb1 = new Personne("Picron","Antoine",a1);
		
		AdressePostale adressNew = new AdressePostale(55,"avenue du bonheur",30000,"Montpellier");

		// méthode 2
		Personne nb2 = new Personne("Durant","Jean",new AdressePostale(35,"Ma super rue2",30000,"Nimes"));
		
		
		
		//System.out.println(nb2.nom + nb2.prenom + nb2.adresse_postale.numeroRue  );

		nb1.display();
		nb1.setNom("Marin");
		nb1.setPrenom("Paul");
		System.out.println(nb1.getAdress().getLibelleRue());
		nb1.setAdress(adressNew);
		nb1.display();
		
		System.out.println(nb1.getNom());
		System.out.println(nb1.getPrenom());
		System.out.println(nb1.getAdress().getLibelleRue());
		
		

	}

}
