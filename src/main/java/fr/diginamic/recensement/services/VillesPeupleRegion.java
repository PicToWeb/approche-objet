package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;

public class VillesPeupleRegion extends MenuService {

	@Override
	public void traiter(Recensement villes, Scanner input) {
		String value = input.nextLine();
		System.out.println("Population totale : ");
		villes.get10CityPopOfRegion(value);
		System.out.println(" ");

	}

}
