package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
	
	protected int force;
	protected int pointDeVie;
	int score;
	
	/**
	 * @param force
	 * @param pointDeVie
	 */
	public Personnage() {
	}
	

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	
	public static int setRandomRange(int low,int high) {
		Random r = new Random();
		int result = r.nextInt(high-low) + low;
		return result;
	}
	public int getScore() {
		return score;
	}
	

	
	
	
	
	
	

}
