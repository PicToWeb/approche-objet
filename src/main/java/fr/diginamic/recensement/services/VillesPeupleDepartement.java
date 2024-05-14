package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;

public class VillesPeupleDepartement extends MenuService {

	@Override
	public void traiter(Recensement villes, Scanner input) {
		String value = input.nextLine();
		System.out.println("Population totale : ");
		villes.get10CityPopOfDep(value);
		System.out.println(" ");

	}

}
