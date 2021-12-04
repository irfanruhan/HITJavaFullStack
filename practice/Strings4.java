package practice;

import java.util.Scanner;

public class Strings4 {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A="hahah";
        String R = "";
        
        char a[] = A.toCharArray();
        char r[] = new char[a.length];
        int n = a.length-1;
        for(char i:a) {
        	r[n] = i;
        	n--;
        }
        R = String.valueOf(r);
        System.out.println(R);
        if(A.equals(R)) {
        	System.out.println("Yes");
        }
        else {
			System.out.println("No");
		}
    }
}
