package lab_programs;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int check = scan.nextInt();
		if(check%2==0) {
			System.out.println("The number entered is an Even Number");
		}
		else {
			System.out.println("The number entered is an Odd Number");
		}
	}
}
