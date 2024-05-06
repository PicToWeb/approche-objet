package fr.diginamic.jdr;

public class Gobelin extends Personnage {

	private final int score = 2;
	public Gobelin() {
		super.setForce(super.setRandomRange(5,10));;
		super.setPointDeVie(super.setRandomRange(10, 15));
		
	}
	public int getScore() {
		return score;
	}
	
	
	

}
