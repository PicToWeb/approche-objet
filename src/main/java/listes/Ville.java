package listes;

import java.util.ArrayList;

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

	public String getNom() {
		return nom;
	}

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
