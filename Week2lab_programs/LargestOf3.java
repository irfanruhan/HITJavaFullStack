package lab_programs;

public class LargestOf3 {
	public static void main(String[] args) {
		double n1 = -5.5d, n2 = 4.5d, n3 = 3.5d;
		if( n1 >= n2 && n1 >= n3)
		System.out.println(n1 + " is the largest number.");
		else if (n2 >= n1 && n2 >= n3)
		System.out.println(n2 + " is the largest number.");
		else
		System.out.println(n3 + " is the largest number.");
	}
}
