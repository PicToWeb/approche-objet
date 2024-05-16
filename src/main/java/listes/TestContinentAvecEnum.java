package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<Ville> ville1 = new ArrayList<>();
		ville1.add(new Ville("New York", 50000, Continent.AMERIQUE));
		ville1.add(new Ville("Paris", 50000, Continent.EUROPE));
		ville1.add(new Ville("Pékin", 50000, Continent.ASIE));
		ville1.add(new Ville("Moscou", 50000, Continent.ASIE));
		ville1.add(new Ville("Berlin", 50000, Continent.EUROPE));
		ville1.add(new Ville("Sidney", 50000, Continent.OCEANIE));

		for (Ville v : ville1) {
			System.out.println(v);
		}

	}

}
