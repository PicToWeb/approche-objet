package fichier;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path pathOri = Paths.get("C:/data/recensement.csv");
		Path pathDest = Paths.get("C:/data/recensement-sortie.csv");

		ArrayList<Ville> newVille = new ArrayList<>();

		List<String> lignes = Files.readAllLines(pathOri);

		String ligneEnTete ="";
		for (int i = 1; i < lignes.size() - 1; i++) {
			ligneEnTete = lignes.get(0);
			String extractLigne = lignes.get(i);	
			String[] tokens = extractLigne.split(";");
			String popTotal = tokens[3].replaceAll(" ", "");
			
			Ville ajoutVille = new Ville(tokens[0], tokens[1], tokens[2], Integer.parseInt(popTotal));
			newVille.add(ajoutVille);
		}



		ArrayList<String> lignesDownload = new ArrayList<>();
		
		for (int i = 1; i < newVille.size(); i++) {
			Ville popVille = newVille.get(i);

			if (popVille.getPopTotal() > 25000) {
				String ligneSortie = popVille.getNom() + ";" + popVille.getCodeDep() + ";"+popVille.getNomRegion() + ";"+Integer.toString(popVille.getPopTotal());
				lignesDownload.add(ligneSortie);	

			}
			
		}
		lignesDownload.add(0, lignes.get(0));
		Files.write(pathDest, lignesDownload);

	}

}
