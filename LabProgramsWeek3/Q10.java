//WAP to create a 2D array that stores elements 
/*
 1	2	3	4
 5	6	7	8
 9	10	11	12
 13	14	15	16
 */
package LabProgramsWeek3;

import java.util.Arrays;

public class Q10 {
	public static void main(String[] args) {
		int a[][] = new int[4][4];
		int n = 0;
		for(int i[]:a) {
			for(int j=0;j<4;j++) {
				n+=1;
				i[j] = n;
			}
			System.out.println(Arrays.toString(i));
		}
	}
}

