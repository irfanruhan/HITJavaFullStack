package practice;

import java.util.*;
import java.text.*;


public class GetDayFromDate {

	public String getDay(int month,int day,int year) {
		
		String finalDay = null;
		
		try {
			String input_date = String.format("%d/%d/%d", day,month,year);
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			Date dt1=format1.parse(input_date);
			DateFormat format2=new SimpleDateFormat("EEEE"); 
			finalDay=format2.format(dt1);
			//System.out.println(finalDay);
			//return finalDay;
		}
		catch(Exception e) {
			System.out.println("Some problem occured while parsing input_date");
		}
		
		return finalDay;
	}
	
	public static void main(String[] args) {
		GetDayFromDate d = new GetDayFromDate();
		String day = d.getDay(02, 23, 2000);
		System.out.println(day);
	}
}
