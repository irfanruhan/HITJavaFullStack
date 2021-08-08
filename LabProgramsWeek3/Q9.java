package LabProgramsWeek3;

import java.util.Arrays;

public class Q9 {
	//Program which reverses elements of an array
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[]b = new int[a.length];
		int k = a.length-1;
		for(int i:a) {
			b[k]= i;
			k--;
		}
		System.out.print("The array was :");
		System.out.println(Arrays.toString(a));
		System.out.print("The reversed array is :");
		System.out.println(Arrays.toString(b));
	}
}
