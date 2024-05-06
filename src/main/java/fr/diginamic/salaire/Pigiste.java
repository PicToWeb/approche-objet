package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int workDay;
	double dailyPay;

	public Pigiste(String nom, String prenom, int workDay, double dailyPay) {
		super(nom, prenom);
		this.workDay = workDay;
		this.dailyPay = dailyPay;
	}

	@Override
	public double getSalaire() {

		return dailyPay * workDay;
	}

	@Override
	public String typeIntervenant() {
		return "PIGISTE";
	}

}
