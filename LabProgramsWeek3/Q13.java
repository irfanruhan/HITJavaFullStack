package LabProgramsWeek3;

import java.util.Arrays;

public class Q13 {
	public static void main(String[] args) {
		int ms[][] = {{15,16},{13,14},{7,9},{12,11}};
		float marks[] = new float[4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				int t1 = ms[i][j];
				marks[i] += t1;
			}
			marks[i] = marks[i]/2;
		}
		System.out.println("The Results are"+Arrays.toString(marks));
	}
}
