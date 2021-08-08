package LabProgramsWeek3;

import java.util.Arrays;

public class Q11 {
	public static void main(String[] args) {
		int a[][]  = new int[4][4];
		int num = 1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j] = num;
				num+=1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

