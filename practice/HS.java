package practice;

import java.util.*;

public class HS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set <String> hs = new HashSet<String>();
        String s[] = new String[pair_left.length];
        for (int j = 0; j < t; j++) {
            pair_left[j] = scan.next();
            pair_right[j] = scan.next();
            s[j] = pair_left[j] + " " + pair_right[j];
            hs.add(s[j]);
            //System.out.println(hs.toString());
            System.out.println(hs.size());
        }
        
        
        
	}
}
