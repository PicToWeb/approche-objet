package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		
		Cercle cercle = new Cercle(5.25);
		Rectangle rectangle = new Rectangle(10,20);
		Carre carre = new Carre(10);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
		

	}

}
