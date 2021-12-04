package practice;

import java.util.*;

public class subarrays {
	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
		for(int j=1;j<=n-i;j++) {
			int[] temp = new int[j];
			System.arraycopy(arr,i,temp,0,j);
			int sum = 0;
			for(int k:temp) {
				sum+=k;
			}
			if(sum<0) {
				//System.out.println("Negative Sum");
				count += 1;
			}
			
		}
	}
		System.out.println(count);
	}
}
