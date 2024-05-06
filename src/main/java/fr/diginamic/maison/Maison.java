package fr.diginamic.maison;

import java.util.Arrays;

//import fr.diginamic.maison.Piece;
public class Maison {
	public Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}

	@Override
	public String toString() {

		String voirPiece = "";
		
		for (Piece p : pieces) {
			voirPiece += p.getClass().getSimpleName() + " = Numéro :  " +  p.getType() + ", " ;
			
		}

		return "Voici les pièces de la maison : " + voirPiece ;
	}

	public void ajouterPiece(Piece piece) {

		if (piece == null || piece.superficie < 0 || piece.etage < 0) {
		} else {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = piece;
		}

	}

	public double getSuperficieTotal() {

		double superficie = 0;
		for (Piece p : pieces) {
			superficie += p.getSuperficie();
		}
		return superficie;
	}

	public double getSuperficieParEtage(int etage) {
		double superficie = 0;
		for (Piece p : pieces) {
			if (p.getEtage() == etage)
				superficie += p.getSuperficie();
		}
		return superficie;
	}
	
	public double getSuperficieParTypePiece(int type) {
		double superficie = 0;
		for(Piece p : pieces) {
			if(p.getType() == type)
				superficie+=p.getSuperficie();	
		}
		
		return superficie;
	}
	
	public int getNbPiecesParTypePiece(int type) {
		int number=0;
		for(Piece p : pieces) {
			if(p.getType() == type) {
				number += 1;
			}
		}
		
		return number;
	}
}
