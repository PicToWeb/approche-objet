package fr.diginamic.banque.entites;

public abstract class Operation {

	protected String dateOperation;
	protected double montantOperation;
	
	public Operation(String dateOperation, double montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	@Override
	public String toString() {
		return "Date de l'opération : " + dateOperation + " Montant " + montantOperation + " type=" + getType();
	}
	
	
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}

	public abstract String getType();
	
	
	public abstract double getMontant(double solde);

	
}
