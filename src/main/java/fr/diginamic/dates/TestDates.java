package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date dateOfDay = new Date(124,4,15);
		System.out.println(dateOfDay);
		SimpleDateFormat formateur = new SimpleDateFormat(" dd/MM/yyyy");
		String dateConvertie = formateur.format(dateOfDay);
		System.out.println(dateConvertie);
		
		Date NewDate = new Date (116,4,19,23,59,30);
		System.out.println(NewDate);
		SimpleDateFormat formateur2 = new SimpleDateFormat(" 'Date du' dd/MM/yyyy ' à ' HH:mm:ss ' secondes'");
		String dateConvertie2 = formateur2.format(NewDate);
		System.out.println(dateConvertie2);

	}

}
