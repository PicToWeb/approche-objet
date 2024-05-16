package enums;

import java.util.ArrayList;
import java.util.Collections;

public class TestJourSemaine {

	public static void main(String[] args) {
		
		JourSemaine js = JourSemaine.LUNDI;
		
		ArrayList<JourSemaine> listeJours = new ArrayList<>();
		listeJours.add(JourSemaine.DIMANCHE);
		listeJours.add(JourSemaine.LUNDI);
		listeJours.add(JourSemaine.MERCREDI);
		System.out.println("---------------------");
		Collections.sort(listeJours);
		System.out.println(listeJours);
		System.out.println("---------------------");
		JourSemaine[]jours = JourSemaine.values();
		for(JourSemaine jour : jours) {
			System.out.println(jour);
		}
		System.out.println("---------------------");
		
		JourSemaine selection = JourSemaine.valueOf("MARDI");
		System.out.println(selection);
		
	}

}
