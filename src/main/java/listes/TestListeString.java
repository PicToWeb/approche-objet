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
		
		//Méthode 2 pour trouver la ville contenant le plus de caractère
		String max = listeVille.get(0);
		for(int i = 1;i<listeVille.size();i++) {
			String nom = listeVille.get(i);
			if(nom.length()>max.length()) {
				max=nom;
				System.out.println(max);
			}
		}
		
		
		//Mettre tous les noms de ville en majuscules
		for (int i = 0; i < listeVille.size(); i++) {
			listeVille.set(i, listeVille.get(i).toUpperCase());
		}
		System.out.println("Liste en majuscules : " + listeVille);

		//supprimer de la liste les villes commencant par N
		Iterator<String> iter2 = listeVille.iterator();
		while (iter2.hasNext()) {
			String nomDelete = iter2.next();
			if (nomDelete.startsWith("N")) { // ou (nomDelete.charAt(0) == 'N')
				iter2.remove();
			}
		}
		System.out.println("Supprimer de la liste les villes commencant par N : " + listeVille);
		
		
		

	}

}
