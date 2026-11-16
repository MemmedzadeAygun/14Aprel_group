package demo;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main_1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		Locale.setDefault(new Locale("az", "AZ"));
		
		Locale locale = new Locale("az", "AZ");
		
		ResourceBundle boundle = ResourceBundle.getBundle("messages", locale);
//		ResourceBundle boundle = ResourceBundle.getBundle("messages");
		
//		System.out.println(boundle.getString("welcome"));
		System.out.println(MessageFormat.format(boundle.getString("welcome"), "Mehemmed"));
		System.out.println(boundle.getString("login"));
		System.out.println(boundle.getString("logout"));
		
//		System.out.println(Locale.GERMAN);
//		System.out.println(Locale.GERMANY);	//1
		
//		System.out.println(new Locale("en"));
//		System.out.println(new Locale("en","US"));	//3
		
//		Locale locale = new Locale.Builder()
//		.setLanguage("hi")
//		.build();
		
//		Locale locale = new Locale.Builder()
//				.setLanguage("hi")
//				.setRegion("IN")
//				.build();
//		
//		System.out.println(locale);		//3
		
//		System.out.println(Locale.getDefault());
		
//		Locale.setDefault(new Locale("az", "AZ"));
//		System.out.println(Locale.getDefault());
	}

}
