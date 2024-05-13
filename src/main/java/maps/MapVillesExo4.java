package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVillesExo4 {

	public static void main(String[] args) {
		HashMap <String,Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice",new Ville("Nice", 343000));
		mapVilles.put("Carcasonne",new Ville("Carcasonne", 47800));
		mapVilles.put("Narbonne",new Ville("Narbonne", 53400));		
		mapVilles.put("Lyon",new Ville("Lyon", 484000));
		mapVilles.put("Foix",new Ville("Foix", 9700));
		mapVilles.put("Pau",new Ville("Pau", 77200));
		mapVilles.put("Marseille",new Ville("Marseille", 850700));
		mapVilles.put("Tarbes",new Ville("Tarbes", 40600));
		
		Iterator <Ville> valuesVille = mapVilles.values().iterator();
		Ville ville = new Ville("Tarbes", 40600);
		while(valuesVille.hasNext()) {
			Ville popMin = valuesVille.next();
			if(ville.getNombreHabitant()>popMin.getNombreHabitant()) {
				ville=popMin;
				
				
			}
			
			
		}
		System.out.println("Ville qui a le moins d'habitant : " + ville);
		mapVilles.remove(ville.getNom());
		
		System.out.println("------------");
		for (String cle : mapVilles.keySet()){
			Ville v = mapVilles.get(cle);
				System.out.println((cle + " - " + v )); 
			}
		
	}
	
	

}
