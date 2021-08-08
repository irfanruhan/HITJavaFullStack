package lab_programs;

import java.util.Scanner;

public class SpecialPyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the height of pyramid");
		int n = scan.nextInt();
		int maxwidth = 2*n+1;
		for(int i=0;i<n;i++) {
			System.out.println(" ".repeat(maxwidth/2-i)+"*".repeat(2*i+1)+" ".repeat(maxwidth/2-i));
		}
		for(int i=2;i<=n;i++) {
			System.out.println(" ".repeat(i)+"*".repeat(maxwidth-(2*i))+" ".repeat(i));
		}
	}
}
