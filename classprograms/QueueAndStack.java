package classprograms;

import java.util.*;

public class QueueAndStack {
	
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add("A");
		q.add("B");
		q.add(1);
		System.out.println(q.peek());
		System.out.println(q.poll());
		Stack s = new Stack();
		s.add("A");
		s.add("B");
		s.add(1);
		System.out.println(s.get(1));
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
	
	
}
