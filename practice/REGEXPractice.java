package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class REGEXPractice {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
       for(int i=0;i<n;i++){
            String IP = in.next();
            String Check = "$" + IP;
            boolean temp = Check.matches(new MyRegex11().pattern);
            if (temp == true) {
            	System.out.println("YES");
            }
            else {
            	System.out.println("NO");
            }
        }
	}
}

class MyRegex11{
    
    String pattern =  "^(?=.*[a-z])(?=."
                       + "*[A-Z])(?=.*\\d)"
                       + "(?=.*[-+_!@#$%^&*., ?]).+$";
}