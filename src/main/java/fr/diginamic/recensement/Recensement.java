package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensement.utils.TriRegion;
import fr.diginamic.recensement.utils.TriVille;
import fr.diginamic.recensement.utils.TriDepartement;

public class Recensement {

	protected List<Ville> villes;

	/**
	 * @param ville
	 */
	public Recensement(List<Ville> villes) {
		this.villes = villes;
	}

	@Override
	public String toString() {
		return "Recensement [ = " + getVilles() + "]";
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public int getPopulationByVille(String ville) {
		int pop = 0;
		for (Ville vi : villes) {
			if (vi.getNomCommune().equalsIgnoreCase(ville)) {
				pop = vi.getPopTot();
			}

		}
		return pop;
	}

	public int getPopulationByDep(String departement) {
		int pop = 0;
		for (Ville vi : villes) {
			if (vi.getCodeDep().equals(departement)) {
				pop += vi.getPopTot();
			}

		}

		return pop;
	}

	public int getPopulationByRegion(String region) {
		int pop = 0;
		for (Ville vi : villes) {
			if (vi.getNomRegion().equalsIgnoreCase(region)) {
				pop += vi.getPopTot();
			}

		}

		return pop;
	}

	static void tri(HashMap<String, Integer> map) {

		List<HashMap.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
		sortedEntries.sort(HashMap.Entry.comparingByValue(Comparator.reverseOrder()));

		int count = 0;
		for (HashMap.Entry<String, Integer> entry : sortedEntries) {
			if (count < 10) {
				int i = count + 1;
				System.out.println(" " + i + ") : " + entry.getKey() + " - Population : " + entry.getValue());
				count++;
			} else {
				break;
			}
		}
	}

	public void getMostRegionPeuple(Recensement recensement) {
		Collections.sort(recensement.getVilles(), new TriRegion());

		HashMap<String, Integer> regionPopulation = new HashMap<>();

		Iterator<Ville> p = villes.iterator();

		int i = 0;

		Ville first = villes.get(0);
		while (p.hasNext()) {
			Ville newVille = p.next();
			if (newVille.getNomRegion().equals(first.getNomRegion())) {
				i += newVille.getPopTot();
				regionPopulation.put(first.getNomRegion(), i);
			} else {
				i = 0;
			}
			first = newVille;

		}
		
		tri(regionPopulation);

	}

	public void getMostDepPeuple(Recensement recensement) {
		Collections.sort(recensement.getVilles(), new TriDepartement());
		HashMap<String, Integer> DepartementPopulation = new HashMap<>();

		Iterator<Ville> p = villes.iterator();

		int i = 0;

		Ville first = villes.get(0);

		while (p.hasNext()) {
			Ville newVille = p.next();
			if (newVille.getCodeDep().equals(first.getCodeDep())) {
				i += newVille.getPopTot();
				DepartementPopulation.put(first.getCodeDep(), i);
			} else {
				i = 1;
			}
			first = newVille;

		}
		tri(DepartementPopulation);

	}

	public void get10CityPopOfDep(String departement) {

		HashMap<String, Integer> DepartementPopulation = new HashMap<>();

		Iterator<Ville> p = villes.iterator();

		int i = 0;

		Ville first = villes.get(0);

		while (p.hasNext()) {

			Ville newVille = p.next();
			String commune = first.getNomCommune();

			if (first.getCodeDep().equals(departement)) {
				i = first.getPopTot();
				DepartementPopulation.put(commune, i);

			} else {
				i = 0;
			}
			first = newVille;

		}

		tri(DepartementPopulation);

	}

	public void get10CityPopOfRegion(String region) {

		HashMap<String, Integer> DepartementPopulation = new HashMap<>();

		Iterator<Ville> p = villes.iterator();

		int i = 0;

		Ville first = villes.get(0);

		while (p.hasNext()) {

			Ville newVille = p.next();
			String commune = first.getNomCommune();

			if (first.getNomRegion().equalsIgnoreCase(region)) {
				i = first.getPopTot();
				DepartementPopulation.put(commune, i);

			} else {
				i = 0;
			}
			first = newVille;

		}

		tri(DepartementPopulation);

	}

	public void getVillesPlusPeuple(Recensement recensement) {
		Collections.sort(recensement.getVilles(), new TriVille());
		int count = 0;
		for (Ville p : recensement.getVilles()) {
			if (count < 10) {
				System.out.println(p.getNomCommune().toUpperCase() + " - Population : " + p.getPopTot());
				count++;
			}

		}
	}

}
