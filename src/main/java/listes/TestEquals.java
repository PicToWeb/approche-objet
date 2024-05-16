package listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Montpellier",34000);
		Ville v2 = new Ville("Montpellierr",34000);
		
		if(v1.equals(v2)) {
			System.out.println("yeah");
		}else {
			System.err.println("ohh no");
		}
		
		v1=v2;
		if(v1 == v2) {
			System.out.println("yeah 2");
		}else {
			System.err.println("ohh no 2");
		}

	}

}
