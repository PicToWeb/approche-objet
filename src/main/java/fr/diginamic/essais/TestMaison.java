package fr.diginamic.essais;


import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		
		Maison home1 = new Maison();
		
		Chambre chambre1 = new Chambre(25,1);
		home1.ajouterPiece(chambre1);
		
		SalleDeBain sdb1 = new SalleDeBain(10,1);
		home1.ajouterPiece(sdb1);
		
		Cuisine cuisine1 = new Cuisine(10,0);
		home1.ajouterPiece(cuisine1);

		Salon salon1 = new Salon(60,1);
		home1.ajouterPiece(salon1);
		
		WC wc1 = new WC(5,0);
		home1.ajouterPiece(wc1);
		WC wc2 = new WC(10,1);
		home1.ajouterPiece(wc2);
		
		Chambre chambreNull=null;
		home1.ajouterPiece(chambreNull);
		
		System.out.println(home1.toString());
		System.out.println("Superficie totale : " + home1.getSuperficieTotal());
		System.out.println("Superficie par étage : " + home1.getSuperficieParEtage(1));
		//De 1 à 5 
		System.out.println("Superficie par Type de pièces : " + home1.getSuperficieParTypePiece(2));
		System.out.println("Nombre de pièce par Type de pièces : " + home1.getNbPiecesParTypePiece(5));
		
		
		
	}

}
