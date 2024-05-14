package fr.diginamic.recensement.utils;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;

public class TriDepartement implements Comparator <Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		return o1.getCodeDep().compareTo(o2.getCodeDep());
	}

}
