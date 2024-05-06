package fr.diginamic.jdr;

public class Jeux {

	public static Personnage game() {
		Personnage bot = new Personnage();
		int bot1 = bot.setRandomRange(1, 4);
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

		Personnage player1 = new Joueur();
		System.out.println(player1.getForce());
		System.out.println(player1.getPointDeVie());

		Personnage bot1 = game();
		System.out.println(bot1.getForce());
		System.out.println(bot1.getPointDeVie());

	}

}
