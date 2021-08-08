package LabProgramsWeek3;

import java.util.Arrays;


//Write a program to reverse the elements of each row in a two dimensional array
//I have written a ROBUST Program
public class Q19 {
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{1,2,3},{1,2,3,4,5},{1,2}};
		int b[][] = new int[a.length][];for(int I=0; I<a.length; I++) b[I] = new int[a[I].length];
		for(int i=0;i<a.length;i++) {
			//ArrayUtils.reverse(a[i]);
			int l = a[i].length-1;
			for(int j=0;j<a[i].length;j++) {
				//System.out.println(b[l]+" "+a[j]);
				b[i][j] = a[i][l];
				//System.out.println(l+","+j);
				l--;
			}
			//System.arraycopy(a, 0, b, i, a[i].length-1);
			//System.out.println("Done");
		}
		/*
		for(int i=0;i<b.length;i++) {
			System.out.println(Arrays.toString(b[i]));
			//System.out.println("Done");
		}
		*/
		System.out.println("Done");
		a = b;
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
			//System.out.println("Done");
		}
	}
}
