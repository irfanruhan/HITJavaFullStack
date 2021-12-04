package classprograms;

import java.util.*;

// Set Collection can be declared using HashSet and TreeSet
//TreeSet is best performance wise, it's already sorted
public class SetDemo {
	public static void main(String[] args) {
		Set hs = new HashSet();
		Set ts = new TreeSet();
		hs.add(1234);
		hs.add(1);
		hs.add(9573);
		hs.add(1234);
		hs.add(9573);
		hs.add(1234);
		hs.add(1);
		hs.add(9573);
		ts.add(1234);
		ts.add(1234);
		ts.add(1);
		ts.add(9573);
		ts.add(1234);
		ts.add(9573);
		ts.add(1234);
		System.out.println(hs.toString());
		System.out.println(ts.toString());
	}
}
