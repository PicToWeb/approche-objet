package fr.diginamic.recensement.services;


import java.util.Scanner;

import fr.diginamic.recensement.Recensement;


public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner input) {
		
		String ville = input.nextLine();
		System.out.println("Population totale : " + recensement.getPopulationByVille(ville));
		System.out.println(" ");
		
		
		
	}

	

}
