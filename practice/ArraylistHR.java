package practice;

import java.util.*;
import java.util.ArrayList;

public class ArraylistHR {
	public static void main(String[] args) {
		System.out.println("Please enter the values");
		Scanner scan = new Scanner(System.in);
		//Test Cases -> n
		int n = scan.nextInt();
		ArrayList<Integer>[] alal = new ArrayList[n];
		for(int i=0;i<n;i++) {
			alal[i] = new ArrayList<Integer>();
			int nn = scan.nextInt();
			for(int j=0;j<nn;j++) {
				alal[i].add(scan.nextInt());
			}
		}
		int nnn = scan.nextInt();
		for(int k=0;k<nnn;k++) {
			int naa = scan.nextInt();
			int na = scan.nextInt();
			try{
				//System.out.println
				System.out.println(alal[naa-1].get(na-1));
			}
			catch(Exception e) {
				System.out.println("Error!");
			}
		}
		//System.out.println(alal[]);
	}
}
