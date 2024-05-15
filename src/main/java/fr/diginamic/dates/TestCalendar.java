package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016,4,19,23,59,30);
		
		Date d2 = cal.getTime();
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date1 =formateur.format(d2);
		
		System.out.println(date1);
		
		Date d3 = Calendar.getInstance().getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(d3));
		
		//Francais
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEE dd/MMM/yyyy HH:mm:ss",Locale.FRANCE);
		System.out.println(formateur3.format(d3));
		//Russe
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd/MMM/yyyy HH:mm:ss",Locale.forLanguageTag("ru-RU"));
		System.out.println(formateur4.format(d3));
		//chinois
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEE dd/MMM/yyyy HH:mm:ss",Locale.CHINESE);
		System.out.println(formateur5.format(d3));
		//allemand
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEE dd/MMM/yyyy HH:mm:ss",Locale.GERMAN);
		System.out.println(formateur6.format(d3));
	}
}
