package listes;

import java.util.Objects;

public class Ville {

	private String nom;
	private int nombreHabitant;
	private Continent continent;

	/**
	 * @param nom
	 * @param nombreHabitant
	 */
	public Ville(String nom, int nombreHabitant, Continent continent) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + ", " + nombreHabitant + " habitants" + " Continent : " + continent.getLibelle();
	}

	@Override
	public boolean equals(Object objet) {
		// si object n'est pas une ville, je retourne false
		if (!(objet instanceof Ville)) {
			return false;
		}
//		 Cast permet de transformer object en Ville
		Ville autre = (Ville) objet;
		return Objects.equals(this.nom, autre.getNom())
				&& Objects.equals(this.nombreHabitant, autre.getNombreHabitant());
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

	/**
	 * Getter for continent
	 * 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter for continent
	 * 
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
