package testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		// exo 1 -> lister les saisons
		Saison[] saison = Saison.values();
		for (Saison s : saison) {
			System.out.println(s);
		}

		System.out.println("--------------");

		// exo 2 -> retrouver et afficher le libellés de ETE
		String nom = "ETE";
		Saison selection = Saison.valueOf(nom);
		System.out.println(selection);

		System.out.println("--------------");

		// exo 3 ->Developpez une methode qui retounr une instance de saison en fonction
		// du libellé
		String libelle = "Hiver";
		Saison choix = Saison.extraireSaisonParLibelle(libelle);
		System.out.println(choix);

	}

}
