package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Strings5 {
	
public static boolean isAnagram(String A,String B) {
	boolean check = false;
	String aa = A.toLowerCase();
	String bb = B.toLowerCase();
	//System.out.println(aa);
	//System.out.println(bb);
	char[]a = aa.toCharArray();
	char[]b = bb.toCharArray();
	
	/*
	Arrays.sort(a);
	Arrays.sort(b);
	
	if(Arrays.equals(a, b)) {
		check = true;
	}*/
	int count=0;
	if(a.length == b.length) {
		
		for(char i:a) {
			for(int j=0;j<a.length;j++) {
				//System.out.println(i +" "+ b[j]);
				if(i == b[j]) {
					b[j] = '$';
					count+=1;
					//System.out.println("After : "+i + b[j]);
					break;
				}
				
			}
		}
	}
	
	if(count == a.length && a.length == b.length) {
		check = true;
	}
	
	return check;
}
	
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     System.out.println("Enter the two Strings");
	 String a = scan.next();
     String b = scan.next();
     scan.close();
     boolean ret = isAnagram(a, b);
     System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
