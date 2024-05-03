package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemuneration;

	public CompteTaux(String accountNumber, double accountBalance, double tauxRemuneration) { // constructeur de la
																								// classe fille
		super(accountNumber, accountBalance); // appel du constructeur de la classe mère
		this.tauxRemuneration = tauxRemuneration;

	}

	@Override
	public String toString() {

		return super.toString() + " Taux de rémnuération : " + tauxRemuneration;
	}

}
