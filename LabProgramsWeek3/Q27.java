package LabProgramsWeek3;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p;
		int fp,fa,sp,sa,tp,ta;
		System.out.println("Welcome to the Returns Calculator!");
		System.out.println("To start, Please enter the initial amount");
		p = scan.nextInt();
		System.out.println("Please enter the first year profit in %");
		fp = scan.nextInt();
		System.out.println("Please enter the first year profit amount(for any non % amount)");
		fa = scan.nextInt();
		System.out.println("To start, Please enter the second year profit in %");
		sp = scan.nextInt();
		System.out.println("Please enter the second year profit (for any non % amount)");
		sa = scan.nextInt();
		System.out.println("To start, Please enter the third year profit in %");
		tp = scan.nextInt();
		System.out.println("Please enter the third year profit (for any non % amount)");
		ta = scan.nextInt();
		calc c = new calc();
		System.out.println("The amount is "+c.getreturns(p,fp,fa,sp,sa,tp,ta));
	}
}
class calc{
	int getreturns(int p,int fp,int fa,int sp,int sa,int tp,int ta) {
		int amount1y = p + (fp/100*p) + fa;
		int amount2y = p + (sp/100*p) + sa;
		int amount3y = p + (tp/100*p) + ta;
		int amount = amount1y + amount2y + amount3y;
		return amount;
	}
}
