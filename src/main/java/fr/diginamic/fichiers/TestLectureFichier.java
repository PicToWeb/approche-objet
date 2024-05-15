package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestLectureFichier {

	public static void main(String[] args) throws IOException {
		
		// Pour lire un fichier
		Path pathOri = Paths.get("C:/data/essai-sortie.txt");
		
		List<String> lignes = Files.readAllLines(pathOri);
		for(String ligne : lignes) {
			System.out.println(ligne);
		}
		
		
		
		
		

	}

}
