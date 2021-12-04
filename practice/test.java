package practice;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		 System.out.println("Enter your name:"); 
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.nextLine();
	        String a[] = new String[n];
	        int nn = 0;
	        for(int i=0;i<n;i++) {
	        	a[i] = scan.nextLine();
	        	nn = scan.nextInt();
	        	scan.nextLine();
	        }
	        for(String i:a) {
	        	System.out.println(i);
	        }
	        System.out.println(nn);
		}
}
/*
 
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

 */


