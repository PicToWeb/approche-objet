package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> city = new ArrayList<>();

		city.add(new Ville("Nice", 343000));
		city.add(new Ville("Carcasonne", 47800));
		city.add(new Ville("Naarbonne", 53400));
		city.add(new Ville("Lyon", 484000));
		city.add(new Ville("Foix", 9700));
		city.add(new Ville("Pau", 77200));
		city.add(new Ville("Marseille", 850700));
		city.add(new Ville("Tarbes", 40600));

		
		// Boucle de traitement
		Ville villeMax = new Ville("", 0);
		Ville villeMin=city.get(0);
		for (int i = 0; i < city.size(); i++) {
			Ville villeCourante = city.get(i);
			//recherche de la plus grande ville
			if(villeCourante.getNombreHabitant()>villeMax.getNombreHabitant()) {
				villeMax = villeCourante;
			}
			//villeMin
			if(villeCourante.getNombreHabitant()< villeMin.getNombreHabitant()) {
				villeMin = villeCourante;
			}
			//mettre en majuscule les ville de + 100 000 habitants
			if (villeCourante.getNombreHabitant() >= 100000) {
				villeCourante.setNom(villeCourante.getNom().toUpperCase());
			}
		}
		System.out.println(villeMax);
		System.out.println(villeMin);
		// Suppression de la plus petite ville
		city.remove(villeMin);
		System.out.println(city);
		
		
		
		
		
		

	}

}
