package utils;

import java.lang.Integer;

public class TestMethodeStatic {

	public static void main(String[] args) {

		//convertir string en int
		final String chaine = "12";
		int resultat = Integer.parseInt(chaine);
		System.out.println(resultat);

		//afficher le plus grand
		int a = 10;
		int b = 25;
		int result = Integer.max(a, b);
		System.out.println(result);
	}

}
