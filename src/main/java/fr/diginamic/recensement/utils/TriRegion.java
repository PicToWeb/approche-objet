package fr.diginamic.recensement.utils;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;

public class TriRegion implements Comparator <Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getCodeRegion() > o2.getCodeRegion()) {
			return -1;
		} else if (o1.getCodeRegion() < o2.getCodeRegion()) {
			return 1;
		}
		return 0;
	}

}
