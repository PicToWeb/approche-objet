package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.services.RecherchePopulationVille;
import fr.diginamic.recensement.services.VillesPeupleDepartement;
import fr.diginamic.recensement.services.VillesPeupleRegion;
import fr.diginamic.recensement.services.RecherchePopulationDepartement;
import fr.diginamic.recensement.services.RecherchePopulationRegion;

public class ApplicationRecensement {
	
	static void menu() {
		System.out.println(" ");
		System.out.println("1. Population d'une ville donnée");
		System.out.println("2. Population d'un département donné");
		System.out.println("3. Population d'une région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
		System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");
		System.out.println("---------------------- ");
		
	}

	public static void main(String[] args) throws IOException {

		Recensement recensement = ImportRecensement.importDoc();
		Recensement villePopulation = recensement;
		
		boolean exit = false;

		while (!exit) {
			menu();
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				System.out.println("Quelle ville ? ");
				RecherchePopulationVille recherche = new RecherchePopulationVille();
				recherche.traiter(recensement, scanner2);
				break;
			case 2:
				System.out.println("Quelle département ? ");
				RecherchePopulationDepartement rechercheDep = new RecherchePopulationDepartement();
				rechercheDep.traiter(recensement, scanner2);
				break;
			case 3:
				System.out.println("Quelle Région ? ");
				RecherchePopulationRegion rechercheReg = new RecherchePopulationRegion();
				rechercheReg.traiter(recensement, scanner2);
				break;
			case 4 :
				villePopulation.getMostRegionPeuple(recensement);
				break;
			case 5 : 
				villePopulation.getMostDepPeuple(villePopulation);
				break;
			case 6 : 
				System.out.println("Quelle Département ? ");
				VillesPeupleDepartement rechercheViDep = new VillesPeupleDepartement();
				rechercheViDep.traiter(recensement, scanner2);
				break;
			case 7 : 
				System.out.println("Quelle Région ? ");
				VillesPeupleRegion rechercheViRegion = new VillesPeupleRegion();
				rechercheViRegion.traiter(recensement, scanner2);
				break;
			case 8:
				villePopulation.getVillesPlusPeuple(recensement);
				break;
			case 9:
				exit = true;
				scanner.close();
				break;
			}
		}

	}

}
