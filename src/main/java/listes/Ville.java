package listes;

import java.util.Objects;

public class Ville {

	private String nom;
	private int nombreHabitant;

	/**
	 * @param nom
	 * @param nombreHabitant
	 */
	public Ville(String nom, int nombreHabitant) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
	}
	
	@Override
	public String toString() {
		return nom + ", " + nombreHabitant + " habitants";
	}
	@Override
	public boolean equals(Object objet){
		//si object n'est pas une ville, je retourne false
		if(!(objet instanceof Ville)){
			return false;
		}
//		 Cast permet de transformer object en Ville
		Ville autre = (Ville) objet; 
		return Objects.equals(this.nom,autre.getNom()) && Objects.equals(this.nombreHabitant, autre.getNombreHabitant());
	}
	
		
	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitant() {
		return nombreHabitant;
	}

	
	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}
	
	

}
