package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Continent;
import listes.Ville;

public class MapVillesExo4 {

	public static void main(String[] args) {
		HashMap <String,Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice",new Ville("Nice", 343000,Continent.EUROPE));
		mapVilles.put("Carcasonne",new Ville("Carcasonne", 47800,Continent.EUROPE));
		mapVilles.put("Narbonne",new Ville("Narbonne", 53400,Continent.EUROPE));		
		mapVilles.put("Lyon",new Ville("Lyon", 484000,Continent.EUROPE));
		mapVilles.put("Foix",new Ville("Foix", 9700,Continent.EUROPE));
		mapVilles.put("Pau",new Ville("Pau", 77200,Continent.EUROPE));
		mapVilles.put("Marseille",new Ville("Marseille", 850700,Continent.EUROPE));
		mapVilles.put("Tarbes",new Ville("Tarbes", 40600,Continent.EUROPE));
		
		Iterator <Ville> valuesVille = mapVilles.values().iterator();
		Ville ville = new Ville("Tarbes", 40600,Continent.EUROPE);
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
