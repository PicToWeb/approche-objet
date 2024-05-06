package fr.diginamic.jdr;


import java.util.Scanner;

public class Jeux {

	public static Personnage game() {
		Personnage bot = new Personnage();
		int bot1 = Personnage.setRandomRange(1, 4);
		switch (bot1) {
		case 1:
			bot = new Loup();
			break;
		case 2:
			bot = new Gobelin();
			break;
		case 3:
			bot = new Troll();
			break;

		}
		// System.out.println(bot);

		return bot;

	}

	public static void main(String[] args) {

		Joueur player1 = new Joueur();
		Personnage bot1 = game();

		Scanner scanner = new Scanner(System.in);

		boolean exit = false;
		while (!exit) {
			System.out.println("1. Créer le personnage");
			System.out.println("2. Combattre une créature");
			System.out.println("3. Afficher le score");
			System.out.println("4. Sortir");
			System.out.println("---------------------- ");
			int nb = scanner.nextInt();

			switch (nb) {
			case 1:
				if (player1.getPointDeVie() < 0)
					player1 = new Joueur();

				System.out.println("Joueur créé, vous avez : " + player1.getPointDeVie() + " de points de vie");
				break;
			case 2:
				if (player1.getPointDeVie() < 0)
					System.out.println(
							"Votre personnage est décédé. Il a obtenu le score de " + player1.getScore() + " points !");
				else {

					
					if (bot1.getPointDeVie() > 0) {
						
						Combat game = new Combat(player1.getPointDeVie(),bot1.getPointDeVie(),player1.getForce(),bot1.getForce());
						game.joueurVsBot();
						bot1.setPointDeVie(game.vieGamers()[0]);
						player1.setPointDeVie(game.vieGamers()[1]);
						
						
						
					} else {
						player1.setScore(bot1.getScore());
						System.out.println("Bravo vous avez gagné, voici votre score " + player1.getScore());
						bot1 = game();
					}
					
				}

				break;
			case 3:
				System.out.println("Voici votre score : " + player1.getScore() + " points");
				System.out.println("vie bot : " + bot1.getPointDeVie());
				System.out.println("vie Joueur : " + player1.getPointDeVie());
				break;
			case 4:
				exit = true;
				scanner.close();
				break;

			}
		}

	}

}
