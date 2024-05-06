package fr.diginamic.formes;

public class Carre extends Rectangle {

	public Carre(double longueur) {
		super(longueur);
		
	}
	@Override
	public String toString() {
	return "Carre -";
	}
	@Override
	public double calculerSurface() {

		return longueur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		
		return longueur  * 4;
	}

}
