package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		
	}
	

	@Override
	public String getType() {
		return "DEBIT " ;
	}
	@Override
	public double  getMontant(double solde) {
		return solde - montantOperation;
	}

}
