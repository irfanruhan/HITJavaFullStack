package practice;

import java.util.*;

public class dequepractice {
public static void main(String[] args) {
	Deque<Integer> d  = new LinkedList<Integer>();
	HashSet<Integer> h = new HashSet<Integer>();
	System.out.println("Please enter the values");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int max = -1;
	for(int i=0;i<n;i++) {
		int temp = scan.nextInt();
		d.add(temp);
		h.add(temp);
		if(d.size()==m) {
			if(max<h.size()) {
				max = h.size();
			}
			
			int first = d.removeFirst();
			if(!d.contains(first)) {
				h.remove(first);
			}
			
		}
	}
	System.out.println(max);
}
}
