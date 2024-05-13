package tri;

import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tri.Ville;

public class TriVille {

	public static void main(String[] args) throws IOException {
		Path pathOri = Paths.get("C:/data/recensement.csv");
		Path pathDest = Paths.get("C:/data/recensement-sortie3.csv");

		ArrayList<Ville> newVille = new ArrayList<>();

		List<String> lignes = Files.readAllLines(pathOri);

		String ligneEnTete = "";
		for (int i = 1; i < lignes.size() - 1; i++) {
			ligneEnTete = lignes.get(0);
			String extractLigne = lignes.get(i);
			String[] tokens = extractLigne.split(";");
			String popTotal = tokens[3].replaceAll(" ", "");

			Ville ajoutVille = new Ville(tokens[0], tokens[1], tokens[2], Integer.parseInt(popTotal));
			newVille.add(ajoutVille);
		}

		ArrayList<String> lignesDownload = new ArrayList<>();
		ArrayList <String> triPop = new ArrayList<>();
		for (int i = 1; i < newVille.size(); i++) {
			Ville popVille = newVille.get(i);

			if (popVille.getPopTotal() > 25000) {
				String ligneSortie = popVille.getNom() + ";" + popVille.getCodeDep() + ";" + popVille.getNomRegion()
						+ ";" + Integer.toString(popVille.getPopTotal());

				lignesDownload.add(ligneSortie);

			}

		}
		Collections.sort(newVille);
		
		for (Ville vi : newVille) {
			String ligneSortie = vi.getNom() + ";" +vi.getCodeDep() + ";" +vi.getNomRegion()+";" +Integer.toString(vi.getPopTotal());
			triPop.add(ligneSortie);
		}

		// System.out.println(newVille);
		lignesDownload.add(0, lignes.get(0));
		//Files.write(pathDest, lignesDownload);
		triPop.add(0, lignes.get(0));
		Files.write(pathDest, triPop);

	}

}
