package LabProgramsWeek3;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Please enter the number to be checked");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean check = false;
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count +=1;
			}
		}
		if(count>0) {
			check = true;
		}
		if(check==false) {
			System.out.println("It's a prime number!");
		}
		else {
			System.out.println("It's not a prime number!");
		}
	}
}
