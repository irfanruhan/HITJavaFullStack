//15b
package LabProgramsWeek3;
import java.util.Arrays;
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		System.out.println("Please enter the number to be checked");
		Scanner scan = new Scanner(System.in);
		int check = scan.nextInt();
		Q15 q = new Q15();
		q.Armstrong(check);
		q.Perfect(check);
	}
	int Armstrong(int a) {
		int sum = 0;
		while(a!=0){
			int s = a%10;
			a=a/10;
			sum += Math.pow(s, 3);
		}
		System.out.println("The number is an armstrong number");
		return 0;
	}
	int Perfect(int p) {
		int sum = 0;
		for(int i=1;i<p;i++) {
			if(p%i==0) {
				sum+=i;
			}
		}
		if(sum==p) {
			System.out.println("The number is a perfect number");
		}
		return 1;
	}
	int Palindrome(int pp) {
		
		return 2;
	}
}
