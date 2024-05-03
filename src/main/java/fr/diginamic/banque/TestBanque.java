package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte user1 = new Compte("FR 545-859-987", 4501.54);
		//System.out.println(user1);

		Compte user2 = new CompteTaux("fr 548-87-987",4555.5,54.5);
		Compte [] result = {user1,user2};
		
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
