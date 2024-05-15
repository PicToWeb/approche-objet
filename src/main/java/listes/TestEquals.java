package listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Montpellier",34000);
		Ville v2 = new Ville("Montpellier",34000);
		
		if(v1.equals(v2)) {
			System.err.println("yeah");
		}else {
			System.out.println("ohh no");
		}
		
		v1=v2;
		if(v1 == v2) {
			System.err.println("yeah 2");
		}else {
			System.out.println("ohh no 2");
		}

	}

}
