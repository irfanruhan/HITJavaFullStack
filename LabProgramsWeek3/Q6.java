package LabProgramsWeek3;
import java.lang.*;
import java.util.Scanner;

public class Q6 {

   public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the new size of array");
	  int n = scan.nextInt();
      int arr1[] = { 0, 1, 2, 3, 4, 5 };
      int arr2[] = new int[n];
      // copies an array from the specified source array
      int len;
      if(arr1.length>arr2.length) {
    	  len = arr2.length;
      }
      else {
    	  len = arr1.length;
      }
      System.arraycopy(arr1, 0, arr2, 0, len);
      System.out.print("[");
      for(int i=0;i<(arr2.length);i++) {
    	  if(i<arr2.length-1){
    		  System.out.print(arr2[i]+",");
    	  }
    	  else {
    		  System.out.print(arr2[i]);
    	  }
      }
      System.out.print("]");
   }
}
