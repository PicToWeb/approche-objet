package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	double salary;

	public Salarie(String nom, String prenom, double salary) {
		super(nom, prenom);
		this.salary = salary;
	}

	@Override
	public double getSalaire() {

		return salary;
	}

	@Override
	public String typeIntervenant() {
		return "SALARIE";
	}

}
