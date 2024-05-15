package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis(); 


		StringBuilder builder = new StringBuilder();
		//String str1 = String.format("j'ai %d en poches",2);
		
		for(int i=0;i<100000;i++) {
			builder.append(i);
			 //str1 = String.format("j'ai %d en poches",i);
			
		}
		builder.toString();
		System.out.println(builder);
		//System.out.println(str1);
		
		
		long fin = System.currentTimeMillis();
		long duree = fin-debut;
		System.out.println(duree);

	}

}
