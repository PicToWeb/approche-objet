package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		Collections.addAll(liste,-1,5,7,3,-2,4,8,5);
		
		//affichage liste
		System.out.println("Liste initiale : " + liste);
		
		//taille de la liste
		int tailleListe=liste.size();
		System.out.println("Taille de la liste : " + tailleListe);
		
		//Rechercher et afficher le plus grand élément de la liste
		System.out.println("L'élément le plus grand est : " + Collections.max(liste));
		
		//Supprimer le plus petit élément de la liste
		int min = Collections.min(liste);
		Iterator <Integer> iter = liste.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			if(number == min) {
				iter.remove();
			}
		}
		System.out.println("Liste sans le plus petit élément -> " + min + " : "  + liste);
		
		//Recherchez tous les éléments négatifs et modifier les pour qu'ils deviennent positifs
		for (int i=0;i<liste.size();i++) {
			int negative = liste.get(i);
			if(negative < 0 ) {
				negative = Math.abs(negative);
				liste.set(i, negative);
			}
		}
		System.out.println("Liste sans valeurs négatives : " + liste);
		
		
		

	}

}
