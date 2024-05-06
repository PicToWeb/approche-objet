package fr.diginamic.operations;

public class Operations {

	double a;
	double b;
	char operateur;

	public Operations() {
		
	}

	public double calcul(double a, double b, char operateur) {

		double result = 0;
		switch (operateur) {
		case '+':
			result = a + b;
			break;
		case '*':
		case 'x':
			result = a * b;
			break;
		case '-':
			result = a - b;
			break;
		case '/':
			result = a / b;
			break;
		default : 
			System.out.println("Opérateur incorrect, choisissez parmis '+' '-' '*' '/' ");
			

		}
		return result ;
	}

}