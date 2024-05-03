package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cercle1= new Cercle(5);
		Cercle cercle2= new Cercle(10);
		
		
		System.out.println("Cercle1 : " + "Perimetre : "+cercle1.perimCercle() + "Surface : "+ cercle1.surfaceCercle() );
		System.out.println("Cercle2 : " + "Perimetre : "+cercle2.perimCercle() + "Surface : "+ cercle2.surfaceCercle());

	}

}
