package fr.diginamic.banque.entites;

public class Compte {

	protected String accountNumber;
	protected double accountBalance;

	public Compte(String accountNumber, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Voci votre numéro de compte : " + accountNumber + " et votre solde : " + accountBalance;
	}

}
