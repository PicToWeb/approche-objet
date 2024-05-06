package fr.diginamic.formes;

public class Cercle extends Forme {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	@Override
	public String toString() {
	return "Cercle -";
	}

	@Override
	public double calculerSurface() {
		double carre = rayon*rayon; 
		return carre * Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		double diametre = rayon*2; 
		return diametre * Math.PI;
	}
	
	

}
