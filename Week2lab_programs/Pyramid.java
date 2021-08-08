package lab_programs;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the height of pyramid");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
