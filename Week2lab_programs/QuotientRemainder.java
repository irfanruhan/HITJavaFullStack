package lab_programs;

public class QuotientRemainder {
	public static void main(String[] args) {
		int dividend = 23, divisor = 4;
		int q = dividend / divisor;
		float quotient = (float)dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Integer Quotient = " + q);
		System.out.println("Float Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
