package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class TestEcritureFichier {

	public static void main(String[] args) throws IOException {
		
		//integerToString pour convertir en String
		Path pathDest = Paths.get("C:/data/essai-sortie.txt");
		
		ArrayList<String> lignes = new ArrayList<>();
		lignes.add("Dauphin");
		lignes.add("Baleine");
		lignes.add("Requin");
		
		Files.write(pathDest, lignes);	

	}

}
