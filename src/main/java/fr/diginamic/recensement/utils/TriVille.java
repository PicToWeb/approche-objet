package fr.diginamic.recensement.utils;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;


public class TriVille implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getPopTot() > o2.getPopTot()) {
			return -1;
		} else if (o1.getPopTot() < o2.getPopTot()) {
			return 1;
		}
		return 0;
	}

}
