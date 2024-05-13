package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", 65000000, "Europe"));
		pays.add(new Pays("Allemagne", 80000000, "Europe"));
		pays.add(new Pays("Belgique", 10000000, "Europe"));
		pays.add(new Pays("Russie", 150000000, "Asie"));
		pays.add(new Pays("Chine", 1400000000, "Asie"));
		pays.add(new Pays("Indonésie", 220000000, "Océanie"));
		pays.add(new Pays("Australie", 20000000, "Océanie"));
		pays.add(new Pays("Australie2", 20000000, "Océanie"));

		System.out.println(pays);

		HashMap<String, Integer> paysParContinent = new HashMap<>();

		Iterator<Pays> p = pays.iterator();
		int i = 0;
		Pays first = pays.get(0);
		while (p.hasNext()) {
			Pays newPays = p.next();
			if (newPays.getContinent().equals(first.getContinent())) {
				paysParContinent.put(first.getContinent(), i = i + 1);
			} else {
				i = 1;
			}
			first = newPays;

		}
		System.out.println(paysParContinent);

	}

}
