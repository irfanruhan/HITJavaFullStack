package LabProgramsWeek3;
import java.util.Arrays;
import java.util.Scanner;
public class Q17 {
	public static void main(String[] args) {
		String digits[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String levels[] = {"","Ten","Hundred","Thousand"};
		String word[] = new String[5];
		System.out.println("Please enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0;
		while(num>0) {
			int n = num%10;
			word[i] = digits[n] + " " +levels[i];
			System.out.println(n + " " + word[i]);
			num = num/10;
			i++;
		}
		String exp = "";
		for(int j = word.length-1;j>=0;j--) {
			if(word[j]!=null) {
				exp = exp + " " +word[j];
			}
		}
		System.out.println(exp);
	}
}
