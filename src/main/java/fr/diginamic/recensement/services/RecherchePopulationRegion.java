package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement region, Scanner input) {
		String value = input.nextLine();
		System.out.println("Population totale : " + region.getPopulationByRegion(value));
		System.out.println(" ");

	}

}
