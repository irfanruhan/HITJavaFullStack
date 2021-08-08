package lab_programs;

import java.util.Scanner;

public class ReversePyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the height of pyramid");
		int n = scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
