package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation opC1 = new Credit("24-04-2023",500);
		Operation opC2 = new Credit("26-04-2023",600);
		Operation opD3 = new Debit("28-04-2023",800);
		Operation opD4 = new Debit("30-04-2023",150);
		
		Operation [] ope = {opC1,opC2,opD3,opD4};
		
		int solde=0;
		
		for (int i = 0; i < ope.length; i++) {
			System.out.println(ope[i].getType());
			System.out.println(ope[i]);
			solde += ope[i].getMontant();
			System.out.println(solde);
			System.out.println("------");
		}
		System.out.println("Solde total : " + solde);
	}

}
