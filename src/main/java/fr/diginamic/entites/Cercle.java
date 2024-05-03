package fr.diginamic.entites;

public class Cercle {

	protected double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimCercle() {
		double diametre = rayon*2; 
		return diametre * Math.PI;
	}
	public double surfaceCercle() {
		double carre = rayon*rayon; 
		return carre * Math.PI;
	}
}
