package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> listeVille = new ArrayList<>();
		Collections.addAll(listeVille, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		Iterator<String> iter = listeVille.iterator();
		String cityMax = "";
		while (iter.hasNext()) {
			String nextCity = iter.next();
			if (nextCity.length() > cityMax.length()) {
				cityMax = nextCity;
			}
		}
		System.out.println("Ville contenant le plus de caractère : " + cityMax);

		for (int i = 0; i < listeVille.size(); i++) {

			listeVille.set(i, listeVille.get(i).toUpperCase());
		}
		System.out.println("Liste en majuscules : " + listeVille);

		Iterator<String> iter2 = listeVille.iterator();
		while (iter2.hasNext()) {
			String nomDelete = iter2.next();
			if (nomDelete.startsWith("N")) {
				iter2.remove();
			}
		}
		System.out.println("Supprimer de la liste les villes commencant par N : " + listeVille);
		
		
		

	}

}
