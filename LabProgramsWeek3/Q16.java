package LabProgramsWeek3;
import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		String s;
		System.out.println("Please enter the element to be scanned");
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		String array[] = {"abcd","efgh","ijkl","qwerty","abcd","efgh","ijkl","qwerty","abcd","efgh","ijkl","qwerty","abcd","efgh","ijkl","qwerty","abcd","efgh","ijkl","qwerty","abcd","efgh","ijkl","qwerty"};
		for(int i=0;i<array.length;i++) {
			if(s.equals(array[i])) {
				System.out.println(i);
			}
		}
	}
}
