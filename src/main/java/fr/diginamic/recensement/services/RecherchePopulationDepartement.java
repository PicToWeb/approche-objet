package fr.diginamic.recensement.services;

import java.util.Scanner;
import fr.diginamic.recensement.Recensement;


public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement departement, Scanner input) {
		
		String value = input.nextLine();
		System.out.println("Population totale : " + departement.getPopulationByDep(value));
		System.out.println(" ");

	}

}
