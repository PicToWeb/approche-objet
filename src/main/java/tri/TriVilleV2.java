package tri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tri.Ville;

public class TriVilleV2 {

	public static void main(String[] args) throws IOException {
		Path pathOri = Paths.get("C:/data/recensement.csv");
		List<String> lignes = Files.readAllLines(pathOri);
		String ligneColonne = lignes.remove(0);
		String[] colonnes = ligneColonne.split(";");

		List<Ville> villes25k = new ArrayList<>();
		for (String ligne : lignes) {

			String[] elements = ligne.split(";");
			int nbHabs = Integer.parseInt(elements[3].replaceAll(" ", ""));
			Ville ville = new Ville(elements[0], elements[1], elements[2], nbHabs);
			if (ville.getPopTotal() >= 25000) {

				villes25k.add(ville);
			}
		}
		// on trie le tableau via le comparator
		Collections.sort(villes25k,new ComparatorNom());
		// Génération des lignes pour le fichier de sortie des villes de plus de 25000
		// habs
		ArrayList<String> selection = new ArrayList<>();

		// On commence par ajouter les entêtes de colonnes qui nous intéressent
		selection.add(colonnes[0] + ";" + colonnes[1] + ";" + colonnes[2] + ";" + colonnes[3]);

		// Puis on ajoute à la liste des lignes, chaque ville de plus de 25k transformée
		// en chaines de caractères
		for (Ville ville : villes25k) {
			String ligneSortie = ville.toCsv();
			selection.add(ligneSortie);
		}

		// Génération du fichier de sortie
		//tri par département
		//Collections.sort(selection);
		Path pathDest = Paths.get("C:/data/recensement-Tri-par-regionV3.csv");
		Files.write(pathDest, selection);
		


		System.out.println("Nombre de lignes sélectionnées = " + selection.size());
	}

}
