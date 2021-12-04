package practice;

import java.util.*;

public class DequeueHR {
	public static void main(String[] args) {
		 System.out.println("Please enter the values");
		 Scanner in = new Scanner(System.in);
         Deque<Integer> deque = new LinkedList<Integer>();
         HashSet<Integer>hs = new HashSet<Integer>();
         int n = in.nextInt();
         int m = in.nextInt();
         int max=-1;
         for (int i = 0; i < n; i++) {
             int num = in.nextInt();
             deque.add(num);
             hs.add(num);
             if(deque.size()==m) {
            	 System.out.println("1->"+deque.toString());
            	 //HashSet<Integer>hss = new HashSet<Integer>(deque);
            	 //System.out.println(hss.toString());
            	 if(max<hs.size()) {
            		 max  =hs.size();
            	 }
            	 System.out.println("2->"+deque.toString());
            	 int first = deque.remove();
            	 if(!deque.contains(first)) {
            		 hs.remove(first);
            	 }
             }
             System.out.println("3->"+deque.toString());
         }
         System.out.println(max);
	}
}
