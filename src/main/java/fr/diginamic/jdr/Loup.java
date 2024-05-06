package fr.diginamic.jdr;

public class Loup extends Personnage {

	private final int score = 1;
	public Loup() {
		super.setForce(super.setRandomRange(3,8));;
		super.setPointDeVie(super.setRandomRange(5, 10));
	}
	public int getScore() {
		return score;
	}
	
	
	

}
