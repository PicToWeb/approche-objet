package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;


public class TestTheatre {

	public static void main(String[] args) {
		//nouveau théâtre
		Theatre beauxArts = new Theatre("Beaux Arts",185,0,0);

		beauxArts.inscrire(50,120);
		beauxArts.inscrire(20,150);
		beauxArts.inscrire(50,180);
		//inscritpion si places totales dépassées
		beauxArts.inscrire(70,200);
		beauxArts.voirInfos();
		
		//cas ou le théâtre existait déja
		Theatre grandPalace = new Theatre("Le grand Palace : ",250);
		grandPalace.inscrire(50, 250);
		grandPalace.inscrire(50, 350);
		//inscritpion si places totales dépassées
		grandPalace.inscrire(170, 450);
		grandPalace.voirInfos();

		
	}

}
