package practice;
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalHR {
	public static void main(String[] args) {
		System.out.println("Please enter the values");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=0;
		BigDecimal b[] = new BigDecimal[n];
		while(scan.hasNext()) {
			BigDecimal temp = scan.nextBigDecimal();
			System.out.println(temp);
			
			b[i] = temp;
			i+=1;
			System.out.println(b[i]);
		}
		
	}
}
