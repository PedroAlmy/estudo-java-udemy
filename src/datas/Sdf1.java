package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf1 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Date d = sdf1.parse("22/04/2018");
		Date d2 = sdf2.parse ("22/04/2018 08:42:57");
		Date d3 = new Date();
		Date d4 = new Date(System.currentTimeMillis());
		Date d5 = new Date(1000L * 60L * 60L * 5L);
		Date d6 = new Date();
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		System.out.println(" ");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d2));
		System.out.println(sdf2.format(d3));
	}	

}
