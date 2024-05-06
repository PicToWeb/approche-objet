package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		
		//Index du premier charactère
		char premierCaractere = chaine.charAt(0);
		System.out.println(premierCaractere);
		
		//Longeur de la chaine de caractère
		int longueurChaine = chaine.length();
		System.out.println(longueurChaine);
		
		//Numéro d'index du caractère ';'
		int indexFirst =  chaine.indexOf(';',0);
		System.out.println(indexFirst);
		
		//Extraction des caractères compris entre 0 et l'index du ';'
		String extract = chaine.substring(0,indexFirst);
		System.out.println(extract);
		
		//Majuscule et minuscule
		String maj = extract.toUpperCase();
		String min = extract.toLowerCase();
		System.out.println("maj : " + maj + " Min : " + min);
		
		//Découper une chaine de caractère
		
		String [] array = chaine.split(";");
		System.out.println(Arrays.toString(array));
		
		
		//Instance de salarie
		Salarie user1 = new Salarie();
		user1.ajoutSalarie(array);
		System.out.println(user1.toString());
		
		 
		
	}

}
