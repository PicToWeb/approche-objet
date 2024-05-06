package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		double[] array1 = { 10, 55, 20 };
		double[] array2 = { 100, 100, 100 };

		CalculMoyenne average1 = new CalculMoyenne(array1);
		average1.ajout(35.5);
		System.out.println("Premiere moyenne : " + average1.calcul());
		
		CalculMoyenne average2 = new CalculMoyenne(array2);
		average2.ajout(100);
		System.out.println("Seconde moyenne : " + average2.calcul());

	}

}
