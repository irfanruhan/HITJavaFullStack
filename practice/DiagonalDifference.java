package practice;

import java.util.*;

public class DiagonalDifference {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sd1=0;
		int sd2 =0;
		int arr[][] = new int[n][n];
		int arv[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			int k = n-1;
			for(int j=0;j<n;j++) {
				arr[i][j] = scan.nextInt();
				arv[i][k] = arr[i][j];
				//System.out.println(k - j);
				//System.out.println(k);
				//System.out.println(arr[i][j] + "   " + arr[i][k]);
				if(i==j) {
					sd1 += arr[i][j];
				}
				/*if(i==k) {
					sd2 += arr[i][k];
				}*/
				k--;
			}
		}
		for(int l=0;l<n;l++) {
			arv[l][0] = arr[l][n-1];
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arv[i][j]);
				if(i==j)sd2+=arv[i][j];
			}
		}
		System.out.println("The sums are: "+sd1 + " " +sd2);
		int diff = Math.abs(sd2-sd1);
		System.out.println(diff);
	}
}
