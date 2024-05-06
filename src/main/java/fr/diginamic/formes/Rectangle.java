package fr.diginamic.formes;

public class Rectangle extends Forme {
	double longueur;
	double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle(double longueurCarre) {
		this.longueur = longueurCarre;
	}
	@Override
	public String toString() {
	return "Rectangle -";
	}

	@Override
	public double calculerSurface() {

		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return (longueur + largeur) * 2;
	}

}
