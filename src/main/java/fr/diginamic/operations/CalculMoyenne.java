package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	public double[] array;

	public CalculMoyenne(double[] array) {
		this.array = array;
	}

	public void ajout(double number) {

		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = number;
	}

	public double calcul() {

		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;

	}
}
