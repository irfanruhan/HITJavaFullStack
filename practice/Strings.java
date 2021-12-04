package practice;
import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        char a[] = A.toCharArray();
        char b[] = B.toCharArray();
        char firstA = a[0];
        char firstB = b[0];
        int count1 = 0;
        int count2 = 0;
        /*System.out.println((int)firstA);
        System.out.println((int)firstB);
        if(firstA > firstB) {
        	System.out.println("False");
        }
        else {
        	System.out.println("True");
        }*/
        
        int lg = (a.length<b.length)?a.length:b.length;
        
        for(int i=0;i<lg;i++) {
        	if(a[i]==b[i]) {
        		continue;
        	}
        	if(a[i]!=b[i]) {
        		System.out.println(a[i] + "," + b[i]);
        		count1 += (int)a[i];
            	count2 += (int)b[i];
            	break;
        	}
        }
        
        if((a.length != b.length)&&(count1 == count2)) {
        	if(a.length>b.length) {
        		count2 = -1; 
        	}
        	else {
        		count1 = -1;
        	}
        }
        
        //System.out.println(count1 + "," + count2);
        if(count1 < count2 || count1==count2) {
        	System.out.println("No");
        }
        else {
        	System.out.println("Yes");
        }
        
        a[0] = Character.toUpperCase(a[0]);
        b[0] = Character.toUpperCase(b[0]);
        
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        System.out.println(as +" "+ bs);
        
	}
}
