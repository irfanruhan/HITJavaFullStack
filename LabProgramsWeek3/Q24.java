package LabProgramsWeek3;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the a value");
		int p = scan.nextInt();
		System.out.println("Please enter the b value");
		int q = scan.nextInt();
		System.out.println("Please enter the c value");
		int r = scan.nextInt();
		Quadratic qd = new Quadratic(p,q,r);
		qd.compute();
	}
}

class Quadratic{
	private int a,b,c;
	Quadratic(){
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	
	public Quadratic(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int geta() {
		return a;
	}
	
	public int getb() {
		return b;
	}
	
	public int getc() {
		return c;
	}
	
	public void changeA(int a) {
		this.a = a;
	}
	
	public void changeB(int b) {
		this.b = b;
	}
	
	public void changeC(int c) {
		this.c = c;
	}
	
	public void compute() {
		System.out.println("The equation corresponding to a, b & c is "+a+"x^2"+" + "+b+"x"+" + "+c);
		
		double x1 = ((-b)+(Math.sqrt((b*b) - (4*a*c))))/(2*a);
		double x2 = ((-b)-(Math.sqrt((b*b) - (4*a*c))))/(2*a);
		
		System.out.println("The solutions for this equation are "+ x1 + " "+ x2);
	}
	
}