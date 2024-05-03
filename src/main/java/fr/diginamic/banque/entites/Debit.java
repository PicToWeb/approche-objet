package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
		
	}
	

	@Override
	public String getType() {
		return "DEBIT " ;
	}
	@Override
	public int  getMontant() {
		return solde -= montantOperation;
	}

}
