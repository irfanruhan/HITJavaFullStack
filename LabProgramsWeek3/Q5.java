package LabProgramsWeek3;
import java.util.Scanner;
public class Q5 {
	public int mean(int a[]) {
		int sum = 0;
		for(int i:a) {
			sum += i;
		}
		return sum/(a.length);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of values");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Please enter the values");
		for(int i=0;i<n;i++) {
			int j = scan.nextInt();
			a[i] = j;
		}
		Q5 q = new Q5();
		int mean = q.mean(a);
		System.out.println("The mean is: "+ mean);
	}
}
