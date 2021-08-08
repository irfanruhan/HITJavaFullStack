package LabProgramsWeek3;

public class Q7 {
	public static void main(String[] args) {
		int arr[] = {3,8,1,2,9,34,6,8,0,1};
        int n = arr.length;
  
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
  
        System.out.println("sorted array");
        ob.printArray(arr);
	}
}
