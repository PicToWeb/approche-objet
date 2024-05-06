package fr.diginamic.entites;

public class Theatre {

	String name;
	int capacite;
	int totalClients;
	double recetteTotal;

	public Theatre(String name, int capacite ,int totalClients,double recetteTotal) {

		this.name = name;
		this.capacite = capacite;
		this.totalClients = totalClients;
		this.recetteTotal = recetteTotal;
	}
	public Theatre(String name, int capacite) {

		this.name = name;
		this.capacite = capacite;
		
	}

	public void inscrire(int nbreClient, double prixPlace) {
		int ajoutClient = totalClients + nbreClient;
		int placeRestante =0;
		if (ajoutClient < capacite) {
			totalClients += nbreClient;
			recetteTotal += nbreClient * prixPlace;
			voirInfos();
		} else {
			placeRestante = capacite - totalClients;
			System.out.println("La capacité total est atteinte, il reste : " + placeRestante + " places");
		}
	}

	public int getTotalClients() {
		return totalClients;
	}

	public double getRecetteTotal() {
		return recetteTotal;
	}

	public void voirInfos() {
		System.out.println(name + " -> " + "Total des clients : " + getTotalClients() + " / " +capacite + ", Recettes totales : " + getRecetteTotal() + "€");
	}
}
