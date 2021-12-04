package practice;

import java.util.*;

public class BitSetHR {
	public static void main(String[] args) {
		//System.out.println("Please enter values");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BitSet B1 = new BitSet(n);
		BitSet B2 = new BitSet(n);
		int q = scan.nextInt();
		for(int i=0;i<q;i++) {
			String query = scan.next();
			int left = scan.nextInt();
			int right = scan.nextInt();
			/*
			   Queries Possible:-
			   AND <set><set>
					OR <set><set>
						XOR <set><set>
							FLIP <set><index>
								SET <set><index>
			 */
			switch(query) {
				case "AND":
					if(left == 1 && right==2) {
						B1.and(B2);
					}
					else if(left == 2 && right == 1) {
						B2.and(B1);
					}
					else if(left == 1 && right == 1) {
						B1.and(B1);
					}
					else if(left == 2 && right == 2) {
						B2.and(B2);
					}
					break;
				case "OR":
					if(left == 1 && right==2) {
						B1.or(B2);
					}
					else if(left == 2 && right == 1) {
						B2.or(B1);
					}
					else if(left == 1 && right == 1) {
						B1.or(B1);
					}
					else if(left == 2 && right == 2) {
						B2.or(B2);
					}
					break;
				case "XOR":
					if(left == 1 && right==2) {
						B1.xor(B2);
					}
					else if(left == 2 && right == 1) {
						B2.xor(B1);
					}
					else if(left == 1 && right == 1) {
						B1.xor(B1);
					}
					else if(left == 2 && right == 2) {
						B2.xor(B2);
					}
					break;
				case "FLIP":
					if(left == 1) {
						B1.flip(right);
					}
					else if(left == 2) {
						B2.flip(right);
					}
					break;
				case "SET":
					if(left == 1) {
						B1.set(right);
					}
					else if(left == 2) {
						B2.set(right);
					}
					break;
			}
			
			//System.out.print(B1.toString());
			//System.out.print(" "+B2.toString()+"\n");
			/*int countset1 =0;
			int countset2 = 0;
			for(int j=0;j<n;j++) {
				if(B1.get(j)) {
					countset1+=1;
				}
				if(B2.get(j)) {
					countset2+=1;
				}
			}
			System.out.println(countset1 + " "+ countset2);
			*/
			System.out.println(B1.cardinality() + " " + B2.cardinality());
		}
	}
}
