package practice;

import java.util.*;

public class Strings3 {
	
	//Part1:- Generating all substrings
	//Part2:- Collecting together substrings of size k
	//Part3:- Sorting Lexicographically
	//Part4:- Returning highest and lowest substring
	
	public static String lexcheckBig(String A,String B) {
		char a[] = A.toCharArray();
        char b[] = B.toCharArray();
        
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
                //System.out.println(a[i] + "," + b[i]);
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
        String biggest = "";
        //System.out.println(count1 + "," + count2);
        if(count1 > count2 || count1==count2) {
            biggest =  A;
        }
        else {
        	biggest = B;
        }
        return biggest;
	}
	
	public static String lexcheckSmall(String A,String B) {
		char a[] = A.toCharArray();
        char b[] = B.toCharArray();
        
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
                //System.out.println(a[i] + "," + b[i]);
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
        String smallest = "";
        //System.out.println(count1 + "," + count2);
        if(count1 < count2 || count1==count2) {
            smallest =  A;
        }
        else {
        	smallest = B;
        }
        return smallest;
	}
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //Part1
        int n = s.length();
        String subs[] = new String[n*(n+1)/2];
        String subsk[] = new String[(n-k+1)];
        int a = 0;
        int b = 0;
        for(int i=0;i<s.length();i++) {
        	for(int j=i+1;j<=s.length();j++) {
        		String temp = s.substring(i,j);
        		subs[a] = temp;
        		a++;
        	}
        }
        //Part2
        for(String i:subs) {
        	if(i.length() == k) {
        		subsk[b] = i;
        		b++;
        	}
        }
        //Part3
        smallest = subsk[0];
        largest = subsk[0];
        for(String i:subsk) {
        	largest = lexcheckBig(largest,i);
        	smallest = lexcheckSmall(smallest,i);
        	//System.out.println("*"+largest+" **"+smallest+"  ***"+i);
        }
        
        //Part4
        return smallest + "\n" + largest;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}
}
