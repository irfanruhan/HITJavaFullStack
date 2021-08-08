package LabProgramsWeek3;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		System.out.println("Please enter the name of month");
		Scanner scan = new Scanner(System.in);
		String m = scan.nextLine();
		m.toLowerCase();
		switch(m) {
		  case "january":
		    System.out.println(m+" "+"has 31 days");
		    break;
		  case "february":
			  System.out.println("Please enter the name of month");
				String l = scan.nextLine();
				l.toLowerCase();
				if(l=="leap") {
					
				}
				else {
					
				}
		    break;
		  case "march":
			// code block
			break;
		  case "april ":
			// code block
			break;
		  case "may":
			// code block
			break;
		  case "june":
			// code block
			break;
		  case "july":
				// code block
				break;
		case "august ":
				// code block
				break;
		case "september":
				// code block
				break;
		case "october":
				// code block
				break;
		case "november":
			//
			break;
		case "december":
			//
		default:
			System.out.println("Please enter the month's name correctly");
		}
	}
}
