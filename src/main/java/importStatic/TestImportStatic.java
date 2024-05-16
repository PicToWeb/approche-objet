package importStatic;

import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class TestImportStatic {

	public static void main(String[] args) {
		
		double rayon =1.5;
		//double surface = Math.PI * Math.pow(rayon,2.0);
		double surface = PI * pow(rayon,2.0);
		System.out.println(surface);
		
		DecimalFormatSymbols symbol = DecimalFormatSymbols.getInstance(Locale.US);
		
		DecimalFormat formateur = new DecimalFormat("0.00",symbol);
		System.out.println(formateur.format(surface));

	}

}
