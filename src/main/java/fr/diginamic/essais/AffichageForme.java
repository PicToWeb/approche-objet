package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

//	Forme forme;
//	
//	public AffichageForme(Forme forme) {
//		this.forme = forme;
//	}

	public static void afficher(Forme forme) {
		System.out.println(forme.toString() + " Périmètre : " + forme.calculerPerimetre());
		System.out.println(forme.toString() + " Surface : " + forme.calculerSurface());
	}
}
