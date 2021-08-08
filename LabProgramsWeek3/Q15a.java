package LabProgramsWeek3;

import java.util.Arrays;

public class Q15a {
	public static void main(String[] args) {
		int primes[] = new int[100];
		primes[0]=2;
		int k = 1;
		for(int i=3;i<=100;i++) {
			int count = 0;
			for(int j=2;j<i;j++) {
				if(i%j!=0) {
					count+=1;
				}
			}
			if(count==(i-2)) {
				primes[k]= i;
				k+=1;
			}
		}
		for(int i:primes) {
			if(i!=0) {
				System.out.println(i);
			}
		}
	}
}
