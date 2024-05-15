package fr.diginamic.essais;


import java.util.Scanner;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		Operations resultat = new Operations();
		Scanner operation = new Scanner(System.in);

		// OPTION 1
		boolean exit = false;

		while (!exit) {
			System.out.println("1. Nouveau calcul");
			System.out.println("2. Quitter");
			System.out.println("Que voulez vous faire (1 - 2) ? ");
			int nb = operation.nextInt();
			switch (nb) {
			case 1:
				System.out.println("Nombre 1 : ");
				double nbr1 = operation.nextDouble();
				System.out.println("Quelle opération : + - * /");
				char operateur = operation.next().charAt(0);
				System.out.println("Nombre 2 : ");
				double nbr2 = operation.nextDouble();
				System.out.println("Résultat : " + resultat.calcul(nbr1, nbr2, operateur));
				System.out.println(" ");
				break;
			case 2:
				exit = true;
				operation.close();
				break;

			}
		}
// OPTION 2 : 

//		System.out.println("Addition : " + resultat.calcul(20, 20, '+'));
//		System.out.println("Soustraction : " + resultat.calcul(20, 20, '-'));
//		System.out.println("Multiplication : " + resultat.calcul(20, 20, '*'));
//		System.out.println("Multiplication : " + resultat.calcul(20, 20, 'x'));
//		System.out.println("Division : " + resultat.calcul(20, 20, '/'));
//		System.out.println("Erreur : " + resultat.calcul(20, 20, ')'));

	}

}
