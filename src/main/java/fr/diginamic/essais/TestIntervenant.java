package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie jean = new Salarie("Durant", "Jean", 2850);
		System.out.println(jean.getSalaire());

		Pigiste jordan = new Pigiste("Perez", "Jordan", 15, 165);
		System.out.println(jordan.getSalaire());

		System.out.println("----------------------");
		jean.afficherDonnees();
		System.out.println("\n" + "----------");
		jordan.afficherDonnees();
	}

}
