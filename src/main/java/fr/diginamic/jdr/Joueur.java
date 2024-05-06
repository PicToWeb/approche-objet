package fr.diginamic.jdr;

public class Joueur extends Personnage {

	int score;
	public Joueur() {
		super.setForce(super.setRandomRange(12,18));
		super.setPointDeVie(super.setRandomRange(20, 50));
		this.score=getScore();
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score += score;
	}
	
	

}
