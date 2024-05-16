package varargs;

public class TestVarArgs {

	public static void main(String[] args) {

		// Avec
		int resultat = addition(18, 22, -6, 3);
		System.out.println(resultat);

		// Avec un tableau d'entiers
		int[] entiers = { 18, 22, -6, 3 };
		resultat = addition(resultat);

		// Sans argument
		resultat = addition();
		System.out.println(resultat);
	}

	/**
	 * Méthode qui prend en paramètre un tableau d'entiers OU un nombre d'entiers.
	 * 
	 * @param mesValeurs
	 * @return
	 */
	public static int addition(int... mesValeurs) {
		int total = 0;

		for (int i = 0; i < mesValeurs.length; i++) {
			total += mesValeurs[i];

		}
		return total;
	}

}
