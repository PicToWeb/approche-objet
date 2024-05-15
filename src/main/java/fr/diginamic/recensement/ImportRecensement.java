package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ImportRecensement {
	
	 static Recensement importDoc() throws IOException {
		 Path pathOri = Paths.get("C:/Users/piicr/Downloads/recensement.csv");
			
			List<String> lignes = Files.readAllLines(pathOri);
			
			List<Ville> villes = new ArrayList<>();

			String ligneColonne = lignes.remove(0);
			
			//String[] colonnes = ligneColonne.split(";");
			
			for (int i = 1; i < lignes.size() - 1; i++) {
				String extractLigne = lignes.get(i);	
				String[] tokens = extractLigne.split(";");
				String popTotal = tokens[9].replaceAll(" ", "");
			
				Ville ajoutVille = new Ville(Integer.parseInt(tokens[0]), tokens[1], tokens[2],Integer.parseInt(tokens[5]),tokens[6],Integer.parseInt(popTotal));
				villes.add(ajoutVille);
			}
			
			Recensement recensement = new Recensement(villes);
			return recensement;
	}

}
