package LabProgramsWeek3;

import java.util.Arrays;

public class Q20 {
	public static void main(String[] args) {
		int a[][] = {{1,2,4,3},{1,2,6,4},{12,4},{18,2,3,4,1,7,9}};
		int b[][] = new int[a.length][];for(int I=0; I<a.length; I++) b[I] = new int[a[I].length];
		for(int i=0;i<a.length;i++) {
			//ArrayUtils.reverse(a[i]);
			//int l = a[i].length-1;
			int high = a[i][0];
			for(int j=1;j<a[i].length;j++) {
				if(high<a[i][j]) {
					//int temp = high;
					high = a[i][j];
					//a[i][j] = temp;
				}
				//System.out.println(b[l]+" "+a[j]);
				//b[i][j] = a[i][l];
				//System.out.println(l+","+j);
				//l--;
			}
			System.out.println(high); 
			//System.arraycopy(a, 0, b, i, a[i].length-1);
			//System.out.println("Done");
		}
		/*
		for(int i=0;i<b.length;i++) {
			System.out.println(Arrays.toString(b[i]));
			//System.out.println("Done");
		}
		*/
		/*System.out.println("Done");
		a = b;
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
			//System.out.println("Done");
		}*/
	}
}
