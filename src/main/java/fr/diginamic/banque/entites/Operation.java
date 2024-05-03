package fr.diginamic.banque.entites;

public abstract class Operation {

	protected String dateOperation;
	protected int montantOperation;
	protected int solde;
	
	public Operation(String dateOperation, int montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	@Override
	public String toString() {
		return "Date de l'opération : " + dateOperation + " Montant " + montantOperation;
	}
	
	public abstract String getType();
	
	
	public int getMontant() {
		return solde;
		
	}

	
}
