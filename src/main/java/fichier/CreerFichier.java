package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		Path pathOri = Paths.get("C:/data/recensement.csv");
		Path pathDest = Paths.get("C:/data/recensement-sortie.csv");

		List<String> lignes = Files.readAllLines(pathOri);
		ArrayList<String> lignesDownload = new ArrayList<>();
		for (int i = 0; i < 101; i++) {

			lignesDownload.add(lignes.get(i));
		}

		Files.write(pathDest, lignesDownload);

	}

}
