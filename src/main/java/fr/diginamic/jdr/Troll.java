package fr.diginamic.jdr;

public class Troll extends Personnage {

	private final int score = 5;
	public Troll() {
		super.setForce(super.setRandomRange(10,15));
		super.setPointDeVie(super.setRandomRange(20, 30));
		
	}
	public int getScore() {
		return score;
	}
	
	
	

}
