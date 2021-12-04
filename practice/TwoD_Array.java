package practice;

import java.util.Scanner;

public class TwoD_Array {
	public int hgsum(int arr[][],int a,int b,int n) {
		int summax = -1000;
		for(int i=a;i<n-2;i++) {
			for(int j=b;j<n-2;j++) {
				int sum = (	arr[i][j]+arr[i][j+1]+arr[i][j+2]+
							         +arr[i+1][j+1]+
							arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]	);
				System.out.println("The sum is"+sum);
				if(sum>summax) {
					summax = sum;
				}
			}
		}
		return summax;
	}
	public static void main(String[] args) {
		System.out.println("Please enter the size of array and then it's elements");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int k = (arr.length-2) * (arr[0].length-2);
		int a = 0;
		int b = 0;
		int max = 0;
		TwoD_Array t = new TwoD_Array();
		
			max = t.hgsum(arr, a, b, n);
			//Getting max value and position
			System.out.println(max);
			
			
		/*	if(b<arr[0].length-1) {
				b++;
			}
			else {
				b=0;
				if(a<arr.length-1)a++;
			}
			k--;
		}*/
		//System.out.println(max);
	}
}
