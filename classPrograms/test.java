package classPrograms;
import LabProgramsWeek3.QuickSort;
public class test {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int a[] = {4,2,1,3,95,23,45,63,1,0,0};
		qs.sort(a,0,a.length-1);
		qs.printArray(a);
	}
}
