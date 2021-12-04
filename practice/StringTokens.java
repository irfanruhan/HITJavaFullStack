package practice;

import java.util.Scanner;
//Important point -> use .charAt()  for string iteration 
// and use "\\?" to avoid the compiler problems for ? + etc...
//** .split("[^a-zA-Z]+")  --->  very important **
public class StringTokens {
	public static void main(String[] args) {
		System.out.println("Please enter the string to be tokenised");
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close(); 
        s = s.trim();
        if(s.length()==0) {
        	System.out.println("0");
        	return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for(String i:words) {
        	System.out.println(i);
        }
	}
}