package practice;

import java.text.*;
import java.util.*;


public class CurrencyFormat {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("Please enter the amount to be formatted");
		double payment = scan.nextDouble();
		/* NumberFormat n = new NumberFormat();
		You cannot instantiate the NumberFormat object using new because it is an abstract class. Abstract classes are meant solely for inheritance, you cannot instantiate an object of an abstract class.
		*/
		Locale india = new Locale("en","IN");
		NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat i = NumberFormat.getCurrencyInstance(india);
		NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println("US: "+u.format(payment));
		System.out.println("India: "+i.format(payment));
		System.out.println("China: "+c.format(payment));
		System.out.println("France: "+f.format(payment));
		
	}
}
