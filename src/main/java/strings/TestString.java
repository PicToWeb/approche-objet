package strings;

public class TestString {

	public static void main(String[] args) {
		String chaine = "    Bonjour    "; // chaine de caractere est immutable
		chaine.concat("  !"); // n'affichera rien car ce n'est pas enrigstré dans une variable. 
		 chaine = chaine.trim();
		System.out.println(chaine);

	}

}
