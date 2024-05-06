package fr.diginamic.jdr;


public class Combat {
	
	int pointDeVieJoueur;
	int pointDeVieBot;
	int forceJoueur;
	int forceBot;
	
	
	/**
	 * @param pointDeVieJoueur
	 * @param pointDeVieBot
	 * @param forceJoueur
	 * @param forceBot
	 */
	public Combat(int pointDeVieJoueur, int pointDeVieBot, int forceJoueur, int forceBot) {
		this.pointDeVieJoueur = pointDeVieJoueur;
		this.pointDeVieBot = pointDeVieBot;
		this.forceJoueur = forceJoueur;
		this.forceBot = forceBot;
	}
	
	public void joueurVsBot() {
		int attaqueJoueur = forceJoueur + Personnage.setRandomRange(1,11);
		int attaqueBot = forceBot + Personnage.setRandomRange(1,11);
		int vieJoueur = pointDeVieJoueur;
		int vieBot = pointDeVieBot;
		
		
		System.out.println("Attaque Bot " + attaqueBot + " AttaqueJoueur " + attaqueJoueur);
		
		if (attaqueJoueur>attaqueBot) {
			vieBot -= attaqueJoueur-attaqueBot;
			pointDeVieBot=vieBot;	
		}else {
			vieJoueur -= attaqueBot-attaqueJoueur;
			pointDeVieJoueur = vieJoueur;
	
		}
		
	}
	public int[] vieGamers() {
		int[] result = new int[2];
		result[0]=pointDeVieBot;
		result[1]=pointDeVieJoueur;
		return result;
	}
	
	
	

}
